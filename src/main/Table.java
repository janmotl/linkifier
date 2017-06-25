package main;

import java.sql.DatabaseMetaData;
import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class Table {

	private final String schemaName;                        // Schema name
	private final String name;                              // Table name
	private String lowerCaseTrimmedName;                    // For string distances
	private List<String> tokenizedLowerCaseTrimmedName;     // For tpc similarity
	private String trimmedName;								// Table name without the shared prefix in the schema
	private List<Column> columnList = new ArrayList<>();    // All columns in the table


	public Table(String schemaName, String name) {
		this.schemaName = schemaName;
		this.name = name;
	}

	public static String getHeader() {
		return "schema" + Setting.CSV_SEPARATOR + getHeader(Setting.CSV_SEPARATOR);
	}

	public static String getHeader(String separator) {
		return String.join(separator,
				"table",
				"column",
				"dataTypeName",
				"isUnique",
				"isUniqueConstraint",
				"columnSize",
				"decimalDigits",
				"isDecimal",
				"hasDefault",
				"ordinalPosition",
				"ordinalPositionEnd",
				"tableColumnCount",
				"tableContainsLob",
				"estimatedRowCount",
				"isAutoincrement",
				"isNotNull",
				"nullRatio",
				"isNullable",
				"uniqueRatio",
				"minValue",
				"maxValue",
				"avgWidth",
				"avgWidthBigger10",
				"correlationAbs",
				"isKeywordSingleton",
				"isJunctionTable",
				"hasMultiplePK",
				"levenshteinDistance",
				"minLDOtherTable",
				"isDoppelganger",
				"contains",
				"isPrimaryKey"
		);
	}

	public Column getColumn(String columnName) {
		for (Column column : columnList) {
			if (column.getName().equals(columnName)) return column;
		}

		return null;
	}

	public String getName() {
		return name;
	}

	public List<Column> getColumnList() {
		return columnList;
	}

	public List<Column> getPk() {
		List<Column> result = new ArrayList<>();
		for (Column column : columnList) {
			if (column.isPrimaryKey()) result.add(column);
		}
		return result;
	}

	public List<Column> getEstimatedPk() {
		List<Column> result = new ArrayList<>();
		for (Column column : columnList) {
			if (column.isEstimatedPk()) result.add(column);
		}
		return result;
	}

	public List<Column> getBestAttemptPk() {
		List<Column> result = new ArrayList<>();
		for (Column column : columnList) {
			if (column.isBestAttemptPk()) result.add(column);
		}
		return result;
	}

	public String getTrimmedName() {
		return trimmedName;
	}

	public void setTrimmedName(String trimmedName) {
		this.trimmedName = trimmedName;
	}

	public void setLowerCaseTrimmedName(String lowerCaseTrimmedName) {
		this.lowerCaseTrimmedName = lowerCaseTrimmedName;
	}

	public String getLowerCaseTrimmedName() {
		return lowerCaseTrimmedName;
	}

	public void setTokenizedLowerCaseTrimmedName(List<String> tokenizedLowerCaseTrimmedName) {
		this.tokenizedLowerCaseTrimmedName = tokenizedLowerCaseTrimmedName;
	}

	public List<String> getTokenizedLowerCaseTrimmedName() {
		return tokenizedLowerCaseTrimmedName;
	}

	public void getColumns(DatabaseMetaData metaData, String databaseName, String schemaName, String tableName) throws SQLException {
		List<Column> columns = new ArrayList<>();

		try (ResultSet result = metaData.getColumns(databaseName, schemaName, tableName, null)) {
			while (result.next()) {
				Column column = new Column(tableName, result.getString("COLUMN_NAME"), this);
				column.setDataType(result.getInt("DATA_TYPE"));
				// We map some of unique MSSQL and Oracle data types to common data types to simplify subsequent analysis.
				// The mapping should be done in the vendor specific classes.
				String typeName = result.getString("TYPE_NAME");
				if (typeName.contains("VARCHAR")) { // Covers NVARCHAR and NVARCHAR2. By default these would be mapped to OTHER.
					column.setDataType(12);
				}
				if ("NCHAR".equals(typeName)) { // Covers NCHAR. By default this would be mapped to OTHER.
					column.setDataType(1);
				}
				column.setDataTypeName(JDBCType.valueOf(column.getDataType()).toString());
				column.setNullable(result.getBoolean("NULLABLE"));
				column.setColumnSize(result.getInt("COLUMN_SIZE"));
				column.setDecimalDigits(result.getInt("DECIMAL_DIGITS"));
				column.setHasDefault(result.getString("COLUMN_DEF") != null);
				column.setOrdinalPosition(result.getInt("ORDINAL_POSITION"));
				column.setAutoincrement("YES".equals(result.getString("IS_AUTOINCREMENT")));
				columns.add(column);
			}
		}

		columnList = setColumnCounts(columns);
	}

	private List<Column> setColumnCounts(List<Column> columnList) {
		for (Column column : columnList) {
			column.setTableColumnCount(columnList.size());
			column.setOrdinalPositionEnd(columnList.size() - column.getOrdinalPosition() + 1);
		}
		return columnList;
	}

	public void setColumnTokenWeight() {
		Map<String, Double> multiSet = new HashMap<>();

		for (Column column : columnList) {
			for (String token : column.getTokenizedLowerCaseTrimmedName()) {
				if (multiSet.containsKey(token)) multiSet.put(token, multiSet.get(token)+1);
				else multiSet.put(token, 1.0);
			}
		}

		for (Map.Entry<String, Double> entry : multiSet.entrySet()) {
			entry.setValue(Math.log(columnList.size()/entry.getValue()));
		}
	}



	// Identify junction table by the fact that the first two columns appear at the 1st position in some other table.
	public void isJunctionTable(List<Table> tables) {

		boolean match1 = false;
		boolean match2 = false;

		if (columnList.size()>=2) {
			for (Table table : tables) {
				if (table.getColumnList().get(0).getName().equals(columnList.get(0).getName())) match1 = true;
				if (table.getColumnList().get(0).getName().equals(columnList.get(1).getName())) match2 = true;
			}
		}

		for (Column column : columnList) {
			column.setJunctionTable(match1 && match2);
		}

	}

	public void tableContainsLob() {
		boolean containsLob = false;
		for (Column column : columnList) {
			if (column.getDataTypeName().contains("BINARY") || column.getDataTypeName().contains("LOB") || column.getDataTypeName().contains("OBJECT") || column.getDataTypeName().contains("ARRAY")) containsLob = true;
		}

		for (Column column : columnList) {
			column.setTableContainsLob(containsLob);
		}
	}

	public void hasMultiplePK() {
		boolean multiplePK = (getPk().size() > 1);   // The bestAttemptPk is still not available -> use database PKs
		for (Column column : columnList) {
			column.setHasMultiplePK(multiplePK);
		}
	}

	public void getPrimaryKeys(DatabaseMetaData metaData, String databaseName, String schemaName, String tableName) throws SQLException {
		try (ResultSet result = metaData.getPrimaryKeys(databaseName, schemaName, tableName)) {
			while (result.next()) {
				for (Column column : columnList) {
					if (column.getName().equals(result.getString(4))) {
						column.setPrimaryKey(true);
					}
				}
			}
		}
	}

	public void getUniqueConstraint(DatabaseMetaData metaData, String databaseName, String schemaName, String tableName) throws SQLException {
		try (ResultSet result = metaData.getIndexInfo(databaseName, schemaName, tableName, true, true)) {
			while (result.next()) {
				for (Column col : columnList) {
					if (col.getName().equals(result.getString(9))) {
						col.setUniqueConstraint(true);
					}
				}
			}
		}
	}


	public String toQuery(char leftQuote, char rightQuote) {
		String keys = "";
		String separator = leftQuote + ", " + rightQuote;
		for (Column column : getEstimatedPk()) {
			keys = keys + column.getName() + separator;
		}
		keys = keys.substring(0, keys.length() - separator.length());
		return "ALTER TABLE " + leftQuote + name + rightQuote + " ADD PRIMARY KEY (" + leftQuote + keys + rightQuote + ");";
	}

	public String toProbability() {
		String table = "";
		for (Column column : columnList) {
			table += String.join(Setting.CSV_SEPARATOR,
					Setting.CSV_QUOTE + schemaName + Setting.CSV_QUOTE,
					Setting.CSV_QUOTE + name + Setting.CSV_QUOTE,
					column.toFeature(),
					String.format(Locale.ROOT, "%.6f", column.getPkProbability())   // String.format can be slow
			) + System.lineSeparator();
		}
		return table;
	}

	public String toFeature() {
		String table = "";
		for (Column column : columnList) {
			table += String.join(Setting.CSV_SEPARATOR,
					Setting.CSV_QUOTE + schemaName + Setting.CSV_QUOTE,
					Setting.CSV_QUOTE + name + Setting.CSV_QUOTE,
					column.toFeature()
			) + System.lineSeparator();
		}
		return table;
	}

	public String toString() {
		return name;
	}

}
