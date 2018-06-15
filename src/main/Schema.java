package main;

import utility.Chen;
import utility.HeapWithFixedSize;
import utility.Tokenization;
import vendor.Vendor;
import vendor.VendorFactory;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Schema {

	private final static Logger LOGGER = Logger.getLogger(Schema.class.getName());
	private static final int MAX_HEAP_SIZE = 2000;  // Defines how many FK constraint candidates to keep

	public static List<Table> getPrimaryKeys(Connection connection, String databaseName, String schemaName, Pattern tableBlacklist) throws SQLException {
		List<Table> tables = getTables(connection.getMetaData(), databaseName, schemaName, tableBlacklist);

		Vendor vendor = VendorFactory.getVendor(connection.getMetaData().getDatabaseProductName());
		vendor.getTableStatistics(databaseName, schemaName, tables, connection);
		vendor.getColumnStatistics(databaseName, schemaName, tables, connection);

		for (Table table : tables) {
			for (Column column : table.getColumnList()) {
				column.setLD(table.getLowerCaseTrimmedName());
				column.setMinLDOtherTable(tables);
				column.setKeywordSingleton();
				column.setKeywords();
				column.setDoppelganger(table);
				column.setIsEmptyTable();
				column.setSuspiciousNullRatio();
			}
			table.isJunctionTable(tables);
			table.isJunctionTable2(tables);
			table.tableContainsLob();
			table.hasMultiplePK();
			table.setColumnTokenWeight();
			table.nullCountMatchesFirstColumn();
			table.previousColumnsAreNotSufficient();
		}

		setPkProbabilities(tables);
		return tables;
	}

	private static void setPkProbabilities(List<Table> tables) {
		for (Table table : tables) {
			for (Column column : table.getColumnList()) {
				column.estimatePrimaryKeyProbability();
			}
		}
	}

	private static List<Table> getTables(DatabaseMetaData metaData, String databaseName, String schemaName, Pattern tableBlacklist) throws SQLException {
		List<Table> tables = new ArrayList<>();
		String[] types = {"TABLE"};

		try (ResultSet result = metaData.getTables(databaseName, schemaName, null, types)) {
			while (result.next()) {
				String tableName = result.getString("TABLE_NAME");
				if (tableBlacklist.matcher(tableName).matches()) continue;	// Skip blacklisted tables
				Table table = new Table(databaseName, tableName);   // We pass databaseName in place of schemaName because of MySQL
				table.getColumns(metaData, databaseName, schemaName, tableName);
				table.getPrimaryKeys(metaData, databaseName, schemaName, tableName);
				table.getUniqueConstraint(metaData, databaseName, schemaName, tableName);
				tables.add(table);
			}
		}
		setTableTrimmedName(tables);
		setColumnTrimmedName(tables);
		LOGGER.info("Table count: " + tables.size());

		return tables;
	}

	private static void setTableTrimmedName(List<Table> tables) {
		String prefix = getTableCommonPrefix(tables);
		for (Table table : tables) {
			table.setTrimmedName(table.getName().replaceFirst(prefix, ""));
			table.setLowerCaseTrimmedName(table.getName().replaceFirst(prefix, "").toLowerCase());
			table.setTokenizedLowerCaseTrimmedName(Tokenization.lowercaseSplit(table.getName().replaceFirst(prefix, "")));
		}
	}

	private static String getTableCommonPrefix(List<Table> tables) {
		String commonPrefix = "";
		int maxLength = Integer.MAX_VALUE;
		for (Table table : tables) {
			maxLength = Math.min(maxLength, table.getName().length());
		}

		if (tables.size()<2) return "";

		for (int prefixLength = 1; prefixLength < maxLength ; prefixLength++) {
			commonPrefix = tables.get(0).getName().substring(0, prefixLength);
			for (Table table : tables) {
				if (!commonPrefix.equals(table.getName().substring(0, prefixLength))) {
					return commonPrefix.substring(0, prefixLength-1);
				}
			}
		}

		return commonPrefix;
	}

	// Remove column prefixes if and only if all columns in all tables in the schema are prefixed
	private static void setColumnTrimmedName(List<Table> tables) {
		int prefixLengthMin = Integer.MAX_VALUE;

		for (Table table : tables) {
			String prefix = getColumnCommonPrefix(table.getColumnList());
			prefixLengthMin = Math.min(prefixLengthMin, prefix.length());
		}

		for (Table table : tables) {
			String prefix = "";
			if (prefixLengthMin>0) prefix = getColumnCommonPrefix(table.getColumnList());

			for (Column column : table.getColumnList()) {
				// Set trimmed name
				column.setTrimmedName(column.getName().replaceFirst(prefix, ""));

				// Set tokenizedLowerCaseTrimmedName
				column.getTokenizedLowerCaseTrimmedName().clear();
				for (String token : Tokenization.split(column.getTrimmedName())) {
					column.getTokenizedLowerCaseTrimmedName().add(token.toLowerCase());
				}

				// Set lowerCaseTrimmedName
				column.setLowerCaseTrimmedName(column.getTrimmedName().toLowerCase());
			}
		}
	}

	private static String getColumnCommonPrefix(List<Column> columns) {
		String commonPrefix = "";
		int maxLength = Integer.MAX_VALUE;
		for (Column column : columns) {
			maxLength = Math.min(maxLength, column.getName().length());
		}

		if (columns.size()<2) return "";

		for (int prefixLength = 1; prefixLength < maxLength ; prefixLength++) {
			commonPrefix = columns.get(0).getName().substring(0, prefixLength);
			for (Column column : columns) {
				if (!commonPrefix.equals(column.getName().substring(0, prefixLength))) {
					return commonPrefix.substring(0, prefixLength-1);
				}
			}
		}

		return commonPrefix;
	}


	public static List<Table> getExpensiveFeatures(List<Table> tables, Connection connection, String schemaName) throws SQLException {
		for (Table table : tables) {
			for (Column column : table.getColumnList()) {
				column.isUnique(connection, schemaName, table.getName());
				column.isNotNull(connection, schemaName, table.getName());
			}
		}
		return tables;
	}



	public static List<Relationship> getRelationships(Connection connection, String databaseName, String schemaName, List<Table> tables, boolean exhaustive) throws SQLException, InterruptedException {
		List<Relationship> relationships = generateRelationships(schemaName, tables, exhaustive);

		for (Table table : tables) {
			try (ResultSet result = connection.getMetaData().getImportedKeys(databaseName, schemaName, table.getName())) {
				while (result.next()) {
					String pkTable = result.getString("PKTABLE_NAME");
					String fkTable = result.getString("FKTABLE_NAME");
					String pkColumn = result.getString("PKCOLUMN_NAME");
					String fkColumn = result.getString("FKCOLUMN_NAME");

					for (Relationship relationship : relationships) {
						if (fkColumn.equals(relationship.getFk().getName()) &&
							pkColumn.equals(relationship.getPk().getName()) &&
							fkTable.equals(relationship.getFkTableName()) &&
							pkTable.equals(relationship.getPkTableName())) {
								relationship.setForeignKey(true);
						}
					}
				}
			}
		}

		return relationships;
	}

	// To speed up the processing, we pre-filter the candidates to:
	//  1) Be of the same dataTypeCategory
	//  2) FK and PK should not be the same column
	private static List<Relationship> generateRelationships(String schemaName, List<Table> tables, boolean exhaustive) throws InterruptedException {
		// Generate list of all fk: table.column
		List<Relationship> nList = new ArrayList<>();
		for (Table table : tables) {
			for (Column column : table.getColumnList()) {
				Relationship relationship = new Relationship();
				relationship.setFk(column);
				relationship.setFkTable(table);
				nList.add(relationship);
			}
		}
		LOGGER.info("Column count: " + nList.size());

		List<Relationship> nnList;
		Chen chen = new Chen(tables);   // Pre-computes frequencies
		if (exhaustive) nnList = getAllCandidates(schemaName, tables, nList, chen);
		else nnList = getCandidates(schemaName, tables, nList, chen);
		LOGGER.info("Candidate foreign key constraint count: " + nnList.size());

		return nnList;
	}

	// Generate list of the top candidates for table.column --> table.pk
	// In theory, a FK may reference any column(s), which is unique. But base on the analysis of >70 databases,
	// all FKs reference a PK. So, it is a reasonable heuristic to generate only all pairs of columns referencing a PK.
	// Since this method can be time consuming on large databases, it is interruptible.
	private static List<Relationship> getCandidates(String schemaName, List<Table> tables, List<Relationship> nList, Chen chen) throws InterruptedException {
		PriorityQueue<Relationship> nnList = new HeapWithFixedSize<>(MAX_HEAP_SIZE);
		for (Table pkTable : tables) {
			for (Column pkColumn : pkTable.getBestAttemptPk()) {
				// To avoid excessive overhead, we do not check the interruption state in the inner most loop
				if (Thread.interrupted()) {
					LOGGER.info("The execution was interrupted on the user's behalf.");
					throw new InterruptedException("The execution was interrupted during the generation of relationship candidates on the user's behalf.");
				}
				for (Relationship relationship : nList) {
					Relationship cloned = new Relationship(relationship);
					cloned.setPk(pkColumn);
					cloned.setPkTable(pkTable);
					cloned.setFastFeatures(schemaName);
					if (cloned.getDataTypeCategoryAgree() && !cloned.isTheSameColumn()) {
						cloned.setMediumFeatures(chen);
						cloned.estimateForeignKeyProbability();
						nnList.add(cloned);
					}
				}
			}
		}
		return new ArrayList<>(nnList);
	}

	// Generate list of all table.column --> table.pk
	private static List<Relationship> getAllCandidates(String schemaName, List<Table> tables, List<Relationship> nList, Chen chen) {
		List<Relationship> nnList = new ArrayList<>();
		for (Table pkTable : tables) {
			for (Column pkColumn : pkTable.getBestAttemptPk()) {
				for (Relationship relationship : nList) {
					Relationship cloned = new Relationship(relationship);
					cloned.setPk(pkColumn);
					cloned.setPkTable(pkTable);
					cloned.setFastFeatures(schemaName);
					cloned.setMediumFeatures(chen);
					cloned.estimateForeignKeyProbability();
					nnList.add(cloned);
				}
			}
		}
		return nnList;
	}
}
