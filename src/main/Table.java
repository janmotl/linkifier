package main;

import utility.Levenshtein;

import javax.annotation.Nullable;
import java.sql.DatabaseMetaData;
import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;


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

	public static String getHeader(String delimiter) {
		if (delimiter==null) throw new IllegalArgumentException("The delimiter cannot be null");

		return String.join(delimiter,
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
				"avgWidthBigger50",
				"isKeywordSingleton",
				"isJunctionTable",
				"isJunctionTable2",
				"hasMultiplePK",
				"levenshteinDistance",
				"minLDOtherTable",
				"isDoppelganger",
				"contains",
				"suspiciousNullRatio",
				"nullCountAsFirstColumn",
				"previousColumnsAreNotSufficient",
				"isEmptyTable",
				"isPrimaryKey"
		);
	}

	public @Nullable Column getColumn(String columnName) {
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

		for (Entry<String, Double> entry : multiSet.entrySet()) {
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

	// Based on ER theory that all tables in a database either describe an Entity or a Relationship we estimate
    // that a table describe a Relationship. The guess is based on the convention that the Relationship table name
    // is composed of names of two other tables in the schema.
    // Note: This can be nicely formulated with ILP since we want Hungarian best match but with the constraint
    // that we want to reference two different tables. The following code just approximates that.
    public double isJunctionTable2(List<Table> tables) {

        // Find a combination of two tables that match best to this table name
        int minDistance = Integer.MAX_VALUE;

        for (Table tPrefix : tables) {
            String prefix = tPrefix.getLowerCaseTrimmedName();
            for (Table sPrefix : tables) {
                String suffix = sPrefix.getLowerCaseTrimmedName();

                int distance = Levenshtein.getDistance(prefix + "_" + suffix, lowerCaseTrimmedName);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        // We permit 2 errors (e.g. due to difference in singular/plural form, used separator...).
        // To make it fuzzy we use a sigmoid.
        double result = 1.0 / (1.0 + Math.pow(10, minDistance-2));

	    // Store the result
        for (Column column : columnList) {
			column.setIsJunctionTable2(result);
		}

	    return result; // For better testability
    }

    // In composite FKs it should hold that a tuple contains only non-null values in the FK,
    // or all values in the FK are null. We approximate this rule.
	// Unfortunately, this rule is applicable only in {Mondial, Basketball_men} datasets. And in Basketball_men
	// this rule does not hold (both, MySQL and PostgreSQL do not enforce it)... Hence, this rule is rather useless.
    public void nullCountMatchesFirstColumn() {
	    // The first column has it constant
	    columnList.get(0).setNullCountAsFirstColumn(0.0);

	    // Compute for the rest
        if (columnList.size() < 2) return;

        for (int i = 1; i < columnList.size(); i++) {
	        if (columnList.get(i).getNullRatio() != null &&  columnList.get(0).getNullRatio() != null) {
		        double absDiff = Math.abs(columnList.get(i).getNullRatio() - columnList.get(0).getNullRatio());
		        columnList.get(i).setNullCountAsFirstColumn(absDiff);
	        }
        }
    }

    // If we want to look at possible composite keys, of two or more columns, we’re going to look for combinations
    // of columns whose multiplied distinct count is equal to or greater than the table’s total row count.
    // See: https://sqlsunday.com/2017/02/21/finding-primary-key-candidates/
    public void previousColumnsAreNotSufficient() {
	    // A single column?
	    if (columnList.size()<2) {
		    for (Column column : columnList) {
			    column.setPreviousColumnsAreNotSufficient(0.0); // A single column in the table -> must be PK.
		    }
	    }

	    // No metadata?
	    if (columnList.get(0).getRowCount() == null) return;

	    // Initialization
        long rowCount = columnList.get(0).getRowCount();
        double optimisticUniqueRow = 1.0;

	    for (int i = 1; i < columnList.size(); i++) {
		    if (columnList.get(i-1).getUniqueRatio() != null) {
			    optimisticUniqueRow = columnList.get(i-1).getUniqueRatio() * rowCount * optimisticUniqueRow;
			    columnList.get(i).setPreviousColumnsAreNotSufficient(optimisticUniqueRow/rowCount);
		    }
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
		if (getEstimatedPk().isEmpty()) {
			throw new IllegalStateException("EstimatedPk is empty");
		}

		String keys = "";
		String separator = leftQuote + ", " + rightQuote;
		for (Column column : getEstimatedPk()) {
			keys += column.getName() + separator;
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
