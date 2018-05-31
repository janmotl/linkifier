package main;

import utility.Levenshtein;
import utility.Logistic;
import utility.String2Num;
import utility.Tokenization;

import javax.annotation.Nullable;
import java.sql.*;
import java.util.*;

public class Column {
	public static final List<String> KEYWORDS = Arrays.asList("aux", "code", "id", "key", "name", "nbr", "no", "nr", "num", "number", "pk", "sk", "symb", "type");
	private static final List<String> KEYWORD_SINGLETONS = Arrays.asList("code", "id");
	public static final double[] WEIGHTS = new double[]{   // Scores trained with RapidMiner on estimatePK_v12.csv. The prediction were checked for match with RapidMiner.
			-1.255989036611402,     // BigInt
			0.8718200051682662,     // Integer
			1.4494153854912695,     // Date
			1.1475269778853086,     // SmallInt
			1.909937969610287,      // Decimal  (number data type is commonly used for PKs on Oracle)
			0.3010409448050391,     // TinyInt
			-0.6301088817679945,    // Varchar (if neither data type is set, char is assumed)
			-0.3572837668352633,    // Timestamp (current timestamp does not guarantee uniqueness)
			-6.983492156855835,     // Binary
			-8.304064238516748,     // Double
			-12.495859985315553,    // Time
			-10.96973949430889,     // Real
			-11.055174485616435,    // Bit
			-12.112336864895012,    // LongVarBinary
			-11.399861507364074,    // LongVarChar
			-13.573785261790494,    // isDecimal (important for decimal data type)
			-1.4574438301928647,    // ordinalPosition (the first columns are more likely to be part of a PK)
			-0.014171247956165164,  // levenshteinDistance (the id should be named after the table)
			-0.08086468555542288,   // minLDOtherTable (the column should be named after some table)
			2.2622770893171467,     // isDoppelganger (common in relationship tables)
			2.416948097469165,      // isKeywordSingleton ("ID" and "Code" are a sign of a PK)
			0.5868531351405547,     // isJunctionTable (junction tables commonly have a compound PK)
			-0.02144685660568901,   // tableColumnCount (with the increasing count of columns the likelihood of being PK decreases)
			-0.0891177276845673,    // avgWidthBigger10 (columns longer than 10 bytes are less likely to be PK)
			-69.00752830718835,     // nullRatio (by definition a PK is not null)
			0.7979103654488896,     // uniqueRatio (surrogate PKs must be unique, compound PKs not)
			0.5724005855564281};    // contains (some common token like "id", "no",...)
	private static final double BIAS = 2.1407107807446657;
	private final String name;              // Column name
	private final String tableName;
	private final String longName;          // Format: table.column
	private final List<String> tokenizedName;
	private String lowerCaseTrimmedName;    // For string distance
	private List<String> tokenizedLowerCaseTrimmedName = new ArrayList<>();
	private Table table;                    // The father table
	private int dataType;                   // Data type as defined by JDBC (simplified if appropriate)
	private String dataTypeName;            // Data type as defined by JDBC
	private @Nullable Boolean isUnique;		// Expensive SQL query -> is not automatically calculated
	private @Nullable Boolean isNotNull;	// Expensive SQL query -> is not automatically calculated
	private @Nullable Double uniqueRatio;	// From vendor database specific source
	private @Nullable Double nullRatio;		// From vendor database specific source
	private @Nullable Double widthAvg;      // From vendor database specific source: average byte width of non-null records
	private @Nullable String textMin;       // From vendor database specific source
	private @Nullable String textMax;       // From vendor database specific source
	private @Nullable Double valueMin;      // From vendor database specific source
	private @Nullable Double valueMax;      // From vendor database specific source
	private @Nullable double[] histogramBounds; // From vendor database specific source
	private @Nullable Timestamp lastUpdated;    // From vendor database specific source (metadata for debugging)
	private @Nullable Long rowsSampled;     // From vendor database specific source (metadata for debugging)
	private boolean isUniqueConstraint = false; // From getIndexInfo() - if there is an index, it is flipped from false
	private boolean isNullable;             // From getColumns() JDBC call -> ought to be filled in
	private boolean isKeywordSingleton;
	private boolean isJunctionTable;
	private double isJunctionTable2;
	private Boolean hasMultiplePK;
	private boolean tableContainsLob;
	private int columnSize;
	private int decimalDigits;				// Decided based on the data type definition -> defined only for numeric/decimal data types
	private boolean hasDefault;
	private int ordinalPosition;
	private int ordinalPositionEnd;
	private int tableColumnCount;
	private Long estimatedRowCount = 0L;	// Zero is a reasonable fallback since it suggests we have no information about the column
	private boolean isAutoincrement;
	private String trimmedName;             // Column name without the shared prefix in the table
	private Boolean contains;               // Map of booleans of columnName endings
	private Integer levenshteinDistance;    // Levenshtein Distance columnName vs. tableName
	private Integer minLDOtherTable;        // Minimal Levenshtein Distance columnName vs. some other tableName
	private Boolean isDoppelganger = false;
	private String doppelgangerName;
	private @Nullable Double nullCountAsFirstColumn;
	private Double previousColumnsAreNotSufficient;
	private @Nullable Boolean isEmptyTable;	// Availability depends on the availability of estimatedRowCount
	private @Nullable Double suspiciousNullRatio;	// Availability depends on the availability of nullRatio
	private Double primaryKeyProbability;   // Estimated probability that this column alone is a PK
	private Boolean isEstimatedPk = false;  // Estimated binary decision whether the column is a part of PK
	private Boolean isBestAttemptPk = false;  // If the PK is set in the database, the database PK is used. Otherwise estimate the PK
	private Boolean isPrimaryKey = false;   // The label


	public Column(String tableName, String name) {
		this.name = name;
		this.tableName = tableName;
		longName = tableName + "." + name;
		tokenizedName = Tokenization.split(name);
	}

	public Column(String tableName, String name, Table table) {
		this(tableName, name);
		this.table = table;
	}

	public int getDataType() {
		return dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

	public String getDataTypeName() {
		return dataTypeName;
	}

	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

	public void setNullable(boolean isNullable) {
		this.isNullable = isNullable;
	}

	public void setUniqueConstraint(boolean uniqueConstraint) {
		isUniqueConstraint = uniqueConstraint;
	}

	public int getColumnSize() {
		return columnSize;
	}

	public void setColumnSize(int columnSize) {
		this.columnSize = columnSize;
	}

	public int getDecimalDigits() {
		return decimalDigits;
	}

	public void setDecimalDigits(int decimalDigits) {
		this.decimalDigits = decimalDigits;
	}

	public void setHasDefault(boolean hasDefault) {
		this.hasDefault = hasDefault;
	}

	public int getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(int ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public void setOrdinalPositionEnd(int ordinalPositionEnd) {
		this.ordinalPositionEnd = ordinalPositionEnd;
	}

	public void setTableColumnCount(int tableColumnCount) {
		this.tableColumnCount = tableColumnCount;
	}

	public Long getRowCount() {
		return estimatedRowCount;
	}

	public void setAutoincrement(boolean autoincrement) {
		isAutoincrement = autoincrement;
	}

	public String getName() {
		return name;
	}

	public String getLongName() {
		return longName;
	}

	public String getTrimmedName() {
		return trimmedName;
	}

	public void setTrimmedName(String trimmedName) {
		this.trimmedName = trimmedName;
	}

	public List<String> getTokenizedName() {
		return Collections.unmodifiableList(tokenizedName);
	}

	public List<String> getTokenizedLowerCaseTrimmedName() {
		return tokenizedLowerCaseTrimmedName;
	}

	public void setTokenizedLowerCaseTrimmedName(List<String> tokenizedLowerCaseTrimmedName) {
		this.tokenizedLowerCaseTrimmedName = tokenizedLowerCaseTrimmedName;
	}

	public String getLowerCaseTrimmedName() {
		return lowerCaseTrimmedName;
	}

	public void setLowerCaseTrimmedName(String lowerCaseTrimmedName) {
		this.lowerCaseTrimmedName = lowerCaseTrimmedName;
	}

	public Table getTable() {
		return table;
	}

	public double getPkProbability() {
		return primaryKeyProbability;
	}

	public Boolean getContains() {
		return contains;
	}

	public Boolean isPrimaryKey() {
		return isPrimaryKey;
	}

	public void setPrimaryKey(boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	public Boolean isKeywordSingleton() {
		return isKeywordSingleton;
	}

	public void setJunctionTable(boolean junctionTable) {
		isJunctionTable = junctionTable;
	}

	public void setIsJunctionTable2(double isJunctionTable2) {
		this.isJunctionTable2 = isJunctionTable2;
	}

	public void setHasMultiplePK(Boolean hasMultiplePK) {
		this.hasMultiplePK = hasMultiplePK;
	}

	public Boolean hasMultiplePK() {
		return hasMultiplePK;
	}

	public @Nullable Double getUniqueRatio() {
		return uniqueRatio;
	}

	public void setUniqueRatio(@Nullable Double uniqueRatio) {
		// The passed parameter can be null (e.g. because the table contains zero rows)
		this.uniqueRatio = uniqueRatio;
	}

	public @Nullable Double getNullRatio() {
		return nullRatio;
	}

	public void setNullRatio(Double nullRatio) {
		this.nullRatio = nullRatio;
	}

	public @Nullable Double getWidthAvg() {
		return widthAvg;
	}

	public void setWidthAvg(Double widthAvg) {
		this.widthAvg = widthAvg;
	}

	public @Nullable String getTextMin() {
		return textMin;
	}

	public void setTextMin(@Nullable String textMin) {
		this.textMin = textMin;

		// JDBC may return nulls (e.g. for binary data)
		if (textMin==null) {
			return;
		}

		try {
			valueMin = Double.valueOf(textMin);
		} catch (Exception ignored) {
			valueMin = String2Num.getNumericValue(textMin); // Encode string as a number
		}
	}

	public @Nullable String getTextMax() {
		return textMax;
	}

	public void setTextMax(@Nullable String textMax) {
		this.textMax = textMax;

		// JDBC may return nulls (e.g. for binary data)
		if (textMax==null) {
			return;
		}

		try {
			valueMax = Double.valueOf(textMax);
		} catch (Exception ignored) {
			valueMax = String2Num.getNumericValue(textMax); // Encode string as a number
		}
	}

	public @Nullable Double getValueMin() {
		return valueMin;
	}

	public @Nullable Double getValueMax() {
		return valueMax;
	}

	public @Nullable double[] getHistogramBounds() {
		return histogramBounds;
	}

	public void setHistogramBounds(double[] histogramBounds) {
		this.histogramBounds = histogramBounds;
	}

	public Boolean isDoppelganger() {
		return isDoppelganger;
	}

	public String getDoppelgangerName() {
		return doppelgangerName;
	}

	public void setDoppelgangerName(String doppelgangerName) {
		this.doppelgangerName = doppelgangerName;
	}

	public boolean getTableContainsLob() {
		return tableContainsLob;
	}

	public void setTableContainsLob(boolean tableContainsLob) {
		this.tableContainsLob = tableContainsLob;
	}

	public void setEstimatedRowCount(long estimatedRowCount) {
		this.estimatedRowCount = estimatedRowCount;
	}

	public void setNullCountAsFirstColumn(double nullCountAsFirstColumn) {
		this.nullCountAsFirstColumn = nullCountAsFirstColumn;
	}

	public void setPreviousColumnsAreNotSufficient(double previousColumnsAreNotSufficient) {
		this.previousColumnsAreNotSufficient = previousColumnsAreNotSufficient;
	}

    public void setIsEmptyTable() {
	    if (estimatedRowCount != null) {
		    isEmptyTable = (estimatedRowCount == 0);
	    }
    }

	public double isEmptyTable() {
		if (isEmptyTable == null) {
			return 0.4226982101795587; // Average for pk_isEmptyTable, bench schemas inflate it
		} else {
			return isEmptyTable ? 1 : 0;
		}
	}

	public Integer getLD() {
		return levenshteinDistance;
	}

	public void setLD(String a) {
		levenshteinDistance = Levenshtein.getDistance(a, lowerCaseTrimmedName);
	}

	// Get min(LD of the column to some other table)
	// The nice thing is that this feature is resistant to duplicated tables...
	public void setMinLDOtherTable(List<Table> tables) {
		int minimum = Integer.MAX_VALUE;

		for (Table table : tables) {
			if (table.getName().equals(tableName)) continue;
			int ld = Levenshtein.getDistance(table.getLowerCaseTrimmedName(), lowerCaseTrimmedName);
			minimum = Math.min(minimum, ld);
		}

		minLDOtherTable = minimum;
	}

	// There are situations when nulls are not surprising. For example, if the table is denormalized, then columns
	// coll3, coll4,... are likely to contain a lot of nulls.
	public void setSuspiciousNullRatio() {
		if (NullsExpected.containsKeyword(tokenizedLowerCaseTrimmedName)) {
			suspiciousNullRatio = 0.0;
		} else {
			suspiciousNullRatio = nullRatio;
		}
	}

	public double getSuspiciousNullRatio() {
		if (suspiciousNullRatio == null) {
			return 0.03643104889927603; // Average for FK candidates (as it is used in relationship for fk columns)
		} else {
			return suspiciousNullRatio;
		}
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public void setRowsSampled(Long rowsSampled) {
		this.rowsSampled = rowsSampled;
	}

	public void setKeywordSingleton() {
		for (String keyword : KEYWORD_SINGLETONS) {
			if (keyword.equalsIgnoreCase(name)) {
				isKeywordSingleton = true;
				return;
			}
		}

		isKeywordSingleton = false;
	}

	public void setKeywords() {
		contains = Tokenization.contains(tokenizedLowerCaseTrimmedName, KEYWORDS);
	}

	public void setDoppelganger(Table table) {
		isDoppelganger = Doppelganger.isDoppelganger(table, this);
	}

	public void isUnique(Connection conn, String schemaName, String tableName) throws SQLException {
		// The ratio is biased to avoid division by zero
		String query = "select 1.0 * (1+count(distinct `" + name + "`)) / (1+count(`" + name + "`)) from `" + schemaName + "`.`" + tableName + "`";

		try (Statement stmt = conn.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			if (rs.next()) {
				isUnique = (rs.getInt(1) == 1);
				uniqueRatio = (rs.getDouble(1)); // We overwrite the estimate from the statics with the true value
			}
		}
	}

	public void isNotNull(Connection conn, String schemaName, String tableName) throws SQLException {
		// The ratio is biased to avoid division by zero
		String query = "select 1.0 * (1+count(`" + name + "`)) / (1+count(*)) from `" + schemaName + "`.`" + tableName + "`";

		try (Statement stmt = conn.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			if (rs.next()) {
				isNotNull = (rs.getDouble(1) == 1.0);
				nullRatio = 1.0 - rs.getDouble(1); // We overwrite the estimate from the statics with the true value
			}
		}
	}

	public void estimatePrimaryKeyProbability() {
		primaryKeyProbability = Logistic.classify(toArray(), WEIGHTS, BIAS);
	}

	public Boolean isEstimatedPk() {
		return isEstimatedPk;
	}

	public void setEstimatedPk(Boolean estimatedPrimaryKey) {
		isEstimatedPk = estimatedPrimaryKey;
	}

	public Boolean isBestAttemptPk() {
		return isBestAttemptPk;
	}

	public void setBestAttemptPk(Boolean bestAttemptPk) {
		isBestAttemptPk = bestAttemptPk;
	}

	public double[] toArray() {
		return new double[]{
				"BIGINT".equals(dataTypeName) ? 1 : 0,
				"INTEGER".equals(dataTypeName) ? 1 : 0,
				"DATE".equals(dataTypeName) ? 1 : 0,
				"SMALLINT".equals(dataTypeName) ? 1 : 0,
				"DECIMAL".equals(dataTypeName) ? 1 : 0,
				"TINYINT".equals(dataTypeName) ? 1 : 0,
				"VARCHAR".equals(dataTypeName) ? 1 : 0,
				"TIMESTAMP".equals(dataTypeName) ? 1 : 0,
				"BINARY".equals(dataTypeName) ? 1 : 0,
				"DOUBLE".equals(dataTypeName) ? 1 : 0,
				"TIME".equals(dataTypeName) ? 1 : 0,
				"REAL".equals(dataTypeName) ? 1 : 0,
				"BIT".equals(dataTypeName) ? 1 : 0,
				"LONGVARBINARY".equals(dataTypeName) ? 1 : 0,
				"LONGVARCHAR".equals(dataTypeName) ? 1 : 0,
				decimalDigits > 0 ? 1 : 0,
				ordinalPosition,
				levenshteinDistance,
				minLDOtherTable,
				isDoppelganger ? 1 : 0,
				isKeywordSingleton ? 1 : 0,
				isJunctionTable ? 1 : 0,
				tableColumnCount,
				widthAvg == null ? 0.02285066570468397 : Math.max(Math.log10(widthAvg)-1, 0),
				nullRatio == null ? 0.03851633649153026 : nullRatio,
				uniqueRatio == null ? 0.3222991158526707 : uniqueRatio,
				contains ? 1 : 0
		};
	}

	public String toFeature() {
		return String.join(Setting.CSV_SEPARATOR,
				Setting.CSV_QUOTE + name + Setting.CSV_QUOTE,
				dataTypeName,
				isUnique == null ? "" : isUnique.toString(),
				isUniqueConstraint ? "true" : "false",
				Integer.toString(columnSize),
				Integer.toString(decimalDigits),
				(decimalDigits > 0) ? "true" : "false",
				hasDefault ? "true" : "false",
				Integer.toString(ordinalPosition),
				Integer.toString(ordinalPositionEnd),
				Integer.toString(tableColumnCount),
				tableContainsLob ? "true" : "false",
				estimatedRowCount.toString(),
				isAutoincrement ? "true" : "false",
				isNotNull == null ? "" : isNotNull.toString(),
				nullRatio == null ? "" : String.format(Locale.ROOT, "%.6f", nullRatio),
				isNullable ? "true" : "false",
				uniqueRatio == null ? "" : String.format(Locale.ROOT, "%.6f", uniqueRatio),
				valueMin == null ? "" : valueMin.toString(),
				valueMax == null ? "" : valueMax.toString(),
				widthAvg == null ? "" : widthAvg.toString(),
				widthAvg == null ? "" : (widthAvg>50 ? "true" : "false"),
				isKeywordSingleton ? "true" : "false",
				isJunctionTable ? "true" : "false",
				Double.toString(isJunctionTable2),
				hasMultiplePK.toString(),
				levenshteinDistance.toString(),
				minLDOtherTable.toString(),
				isDoppelganger.toString(),
				contains ? "true" : "false",
				suspiciousNullRatio == null ? "" : suspiciousNullRatio.toString(),
				nullCountAsFirstColumn == null ? "" : nullCountAsFirstColumn.toString(),
				previousColumnsAreNotSufficient == null ? "" : previousColumnsAreNotSufficient.toString(),
				isEmptyTable == null ? "" : isEmptyTable.toString(),
				lastUpdated == null ? "" : lastUpdated.toString(),
				rowsSampled == null ? "" : rowsSampled.toString(),
				isPrimaryKey.toString()
		);
	}

	public String toString() {
		return longName;
	}

	// Needed for graph traversing
	@Override public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Column column = (Column) o;

		return longName.equals(column.longName);
	}

	@Override public int hashCode() {
		return longName.hashCode();
	}

}
