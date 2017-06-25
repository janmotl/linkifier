package main;

import utility.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import static java.lang.Math.*;

public class Relationship implements Comparable<Relationship> {

	private static final List<String> KEYWORDS_FK = Arrays.asList("fk", "type", "eid");
	private static final List<String> STAT_LESS_DATA_TYPE = Arrays.asList("BINARY", "LONGVARBINARY", "LONGVARCHAR");
	private static final double[] WEIGHTS = new double[]{   // Coefficients from H20. The coefficients must NOT be standardized. Beware of changing att=false to att=true as it changes not only the sign, but also bias.
			-0.700089536608705,     // fk_isPrimaryKey (this helps to get the direction from FK to PK right, but it does not always hold)
			0.8083306055552485,     // fk_contains (FKs generally contains tokens like "ID", "code",...)
			0.10629621014079517,    // fk_levenshteinDistance (FK should be named differently from it's own table name)
			-0.002608408791982627,  // fk_ordinalPosition (FKs are generally somewhere at the beginning of the table)
			-3.1271679052709227,    // fk_isKeywordSingleton ("id" name is commonly the name of the PK, not FK)
			1.1263050903926626,     // fk_tableContainsLob (if a table contains LOB, it is more likely on the FK side than PK side)
			2.080985736648847,      // fk_isDoppelganger (common in relationship tables)
			-5.433500350930434,     // pk_isDoppelganger (entity tables do not contain doppelgangers, which are identified by their names)
			-2.827856707221662,     // pk_hasMultiplePK (multiple PK columns are a sign of a junction table)
			7.889218949482217,      // dataTypeCategoryAgree (should hold, but can be violated between char and varchar) MOVE TO dataTypeAgree
			3.148549839180387,      // dataLengthAgree (desirable, but can be violated in case of varchar)
			7.67137217122626,       // tokenShareRatioLD (FK should be similar to PK's name; works better than levenshteinColumns and tpcSimilarity)
			6.180094171665725,      // tpcSimilarity (FK name should be composed of {fkTable, pkTable, pk, typical keywords})
			-0.33830948191073695,   // levenshteinToTable (FK should be similar to PK's table name)
			0.6780118791106244,     // pkDoesNotHaveMoreTokensThanFk (PK names are generally shorter than FK names)
			-1.796300917231083,     // violatesSpecialization (FK in is-a relationship should not have more columns than PK)
			4.558902237589775,  	// isInRange (FK values should be in the range of PK values)
			-1.8968522536350347, 	// avgWidthDiff (the average length of the values in FK should be close to average in PK)
			-0.8483438241947663,    // violatesCardinalityConstraint (the count of unique values in FK should be ≤ count in PK)
			0.27570287140420485,    // rangeCoverage (values in FK should cover a wide range of values in PK)
			-15.271897552298254,    // isTheSameColumn (self referencing should never happen)
			-2.7369860356123077};   // isTheSameTable (hierarchies are relatively rare in the databases)
	private static final double BIAS = -28.846198408554553;

	//	1) Do the data types agree?
	//	2) Do the data type properties (like length, count of decimals, is signed/unsigned, text encoding) agree?
	//	3) Levenshtein distance between the primary key and the attribute name.
	//	4) Does the attribute name end with (case insensitive): {aux, code, id, key, name, nbr, no, pk, sk, type}? Each suffix should also be appended with "\d*" to permit numbered suffixes (for the matching use regex). Create one feature for each suffix.
	//	5) Contains null value? (As checked with a query on the actual data.)
	//	6) If we randomly select N (or top N) unique records, what proportion of them can we match to the primary key? N can be e.g. 500.
	//	7) Table row count comparison (of the table with the PK and the table with the attribute).
	// + Other attributes from PK detection
	// Note: Currently the biggest problem is a correct dealing with is-a relationship (which of the tables is at the root?).
	// Note: We should add the "leaking" features like isGenerated....
	private Boolean dataTypeAgree;
	private Boolean dataTypeCategoryAgree;
	private Boolean dataLengthAgree;
	private Boolean decimalAgree;
	private Boolean isTheSameColumn;
	private Boolean isTheSameTable;
	private Boolean firstCharAgree;
	private Boolean nameAgree;          // Naive feature for comparison with Oracle Data Modeller
	private Integer levenshteinColumns;
	private Integer levenshteinToTable;
	private Integer levenshteinFromTable;
	private double tokenShareRatioLd;
	private double chenColumnSimilarity;
	private double chenTableSimilarity;
	private double tpcSimilarity;
	private double satisfiedFKRatio;
	private double violatesCardinalityConstraint;
	private String satisfiesFKConstraint = "untested";
	private Boolean isInRange;
	private Double rangeCoverage;                       // Can be null
	private Double histogramSimilarity;                 // Can be null
	private Boolean violatesSpecialization = false;
	private Boolean containsFKName;
	private double avgWidthDiff;
	private Column fk;                   // We model composite fk constraints by defining the individual relationships
	private Column pk;
	private String fkTable;
	private String pkTable;
	private String fkLowerCaseTrimmedTable;
	private String pkLowerCaseTrimmedTable;
	private List<String> pkTableTokenizedLowerCaseTrimmedName; // Precomputed values for Tpc similarity
	private List<String> fkTableTokenizedLowerCaseTrimmedName; // Precomputed values for Tpc similarity
	private String schema;
	private double foreignKeyProbability;           // Estimated probability that this is a foreign key
	private Boolean isEstimatedFk = false;          // The binary estimate after optimization
	private Boolean isForeignKey = false;           // The label

	public Relationship() {
	}


	public Relationship(Relationship other) {
		dataTypeAgree = other.dataTypeAgree;
		dataTypeCategoryAgree = other.dataTypeCategoryAgree;
		dataLengthAgree = other.dataLengthAgree;
		decimalAgree = other.decimalAgree;
		isTheSameColumn = other.isTheSameColumn;
		isTheSameTable = other.isTheSameTable;
		firstCharAgree = other.firstCharAgree;
		levenshteinColumns = other.levenshteinColumns;
		levenshteinToTable = other.levenshteinToTable;
		levenshteinFromTable = other.levenshteinFromTable;
		tokenShareRatioLd = other.tokenShareRatioLd;
		satisfiesFKConstraint = other.satisfiesFKConstraint;
		satisfiedFKRatio = other.satisfiedFKRatio;
		rangeCoverage = other.rangeCoverage;
		containsFKName = other.containsFKName;
		fk = other.fk;
		pk = other.pk;
		fkTable = other.fkTable;
		pkTable = other.pkTable;
		fkLowerCaseTrimmedTable = other.fkLowerCaseTrimmedTable;
		pkLowerCaseTrimmedTable = other.pkLowerCaseTrimmedTable;
		fkTableTokenizedLowerCaseTrimmedName = other.fkTableTokenizedLowerCaseTrimmedName;
		pkTableTokenizedLowerCaseTrimmedName = other.pkTableTokenizedLowerCaseTrimmedName;
		schema = other.schema;
		foreignKeyProbability = other.foreignKeyProbability;
		isEstimatedFk = other.isEstimatedFk;
		isForeignKey = other.isForeignKey;
	}

	public static String getHeader() {
		return String.join(Setting.CSV_SEPARATOR,
				"schema",
				"pk_" + Table.getHeader(Setting.CSV_SEPARATOR + "pk_"),
				"fk_" + Table.getHeader(Setting.CSV_SEPARATOR + "fk_"),
				"dataTypeAgree",
				"dataTypeCategoryAgree",
				"dataLengthAgree",
				"decimalAgree",
				"isTheSameColumn",
				"isTheSameTable",
				"firstCharAgree",
				"nameAgree",
				"levenshteinColumns",
				"levenshteinToTable",
				"levenshteinFromTable",
				"tpcSimilarity",
				"tokenShareRatioLd",
				"chenColumnSimilarity",
				"chenTableSimilarity",
				"pkDoesNotHaveMoreTokensThanFk",
				"avgWidthDiff",
				"violatesCardinalityConstraint",
				"isInRange",
				"satisfiesFKConstraint",
				"satisfiedFKRatio",
				"rangeCoverage",
				"histogramOverlap",
				"violatesSpecialization",
				"contains",
				"isForeignKey"
		);
	}

	public Column getFk() {
		return fk;
	}

	public void setFk(Column fk) {
		this.fk = fk;
	}

	public Column getPk() {
		return pk;
	}

	public void setPk(Column pk) {
		this.pk = pk;
	}

	public String getFkTable() {
		return fkTable;
	}

	public void setFkTable(Table fkTable) {
		this.fkTable = fkTable.getName();
		fkLowerCaseTrimmedTable = fkTable.getLowerCaseTrimmedName();
		fkTableTokenizedLowerCaseTrimmedName = fkTable.getTokenizedLowerCaseTrimmedName();
	}

	public String getPkTable() {
		return pkTable;
	}

	public void setPkTable(Table pkTable) {
		this.pkTable = pkTable.getName();
		pkLowerCaseTrimmedTable = pkTable.getLowerCaseTrimmedName();
		pkTableTokenizedLowerCaseTrimmedName = pkTable.getTokenizedLowerCaseTrimmedName();
	}

	public Double getForeignKeyProbability() {
		return foreignKeyProbability;
	}

	public void setForeignKeyProbability(Double foreignKeyProbability) {
		this.foreignKeyProbability = foreignKeyProbability;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public Boolean getDataTypeCategoryAgree() {
		return dataTypeCategoryAgree;
	}

	public Boolean isTheSameColumn() {
		return isTheSameColumn;
	}

	public Boolean isForeignKey() {
		return isForeignKey;
	}

	public void setForeignKey(Boolean foreignKey) {
		isForeignKey = foreignKey;
	}

	public Boolean isEstimatedFk() {
		return isEstimatedFk;
	}

	public void setEstimatedFk(Boolean estimatedForeignKey) {
		isEstimatedFk = estimatedForeignKey;
	}


	// The only reasonable FK constraint between different data types is between char <--> varchar,
	// as it is the only cross-type constraint observed in real-world databases.
	// Nevertheless, PostgreSQL permits numeric --> float, int --> float, int --> numeric.
	// But reverse directions are not permitted.
	// Timestamp <--> date also works!
	private String getDataTypeCategory(String dataTypeName) {
		if ("CHAR".equals(dataTypeName)) return "CHAR";
		if ("VARCHAR".equals(dataTypeName)) return "CHAR";
		if ("LONGVARCHAR".equals(dataTypeName)) return "CHAR";

		if ("INTEGER".equals(dataTypeName)) return "INTEGER";
		if ("BIGINT".equals(dataTypeName)) return "INTEGER";
		if ("SMALLINT".equals(dataTypeName)) return "INTEGER";

		if ("DOUBLE".equals(dataTypeName)) return "DOUBLE";
		if ("REAL".equals(dataTypeName)) return "DOUBLE";

		return dataTypeName;
	}


	// Features are divided into three categories based on their runtime
	public void setFastFeatures(String schemaName) {
		schema = schemaName;
		dataTypeAgree = (pk.getDataType() == fk.getDataType());
		dataTypeCategoryAgree = getDataTypeCategory(pk.getDataTypeName()).equals(getDataTypeCategory(fk.getDataTypeName()));
		dataLengthAgree = (pk.getColumnSize() == fk.getColumnSize());
		decimalAgree = (pk.getDecimalDigits() == fk.getDecimalDigits());
		isTheSameColumn = (pkTable.equals(fkTable) && pk.getName().equals(fk.getName()));
		isTheSameTable = (pkTable.equals(fkTable));
		violatesSpecialization = fk.getName().equals(pk.getName()) && fk.getRowCount()>(1.125*pk.getRowCount()) && fk.isBestAttemptPk() && !fk.hasMultiplePK(); // If the row counts are similar, the inequality comparison gets unreliable -> we increase the limit by 12.5% to be sure. It would be great if we could check that the FkTable contains at least one PK (sometimes there is no PK in the database AND semantically there should be a compound PK).
		avgWidthDiff = getAvgWidthDiff();
		violatesCardinalityConstraint = violatesCardinalityConstraint();
		isInRange = isInRange();
		rangeCoverage = getRangeCoverage();
		histogramSimilarity = getHistogramSimilarity();
		nameAgree = (pk.getName().equals(fk.getName()));
	}

	// It is known that OpenML_2016 violates constraint: data_quality.implementation_id --> implementation.id.
	// Carcinogenesis:	sbond_2.atomid --> atom.atomid.
	// medical: Examination.ID --> Patient.ID.
	// These are "bugs" of the schemas, not the code.
	public boolean isInRange() {
		// First by a numerical comparison, if possible
		if (fk.getValueMax() != null && pk.getValueMax() != null) {
			return fk.getValueMin()>=pk.getValueMin() && fk.getValueMax()<=pk.getValueMax();
		}

		// Then by string comparison, if possible (e.g. if the row_count==0, textMin is null)
		if (fk.getTextMax() != null && pk.getTextMax() != null) {
			return (fk.getTextMin().compareTo(pk.getTextMin())>=0 && fk.getTextMax().compareTo(pk.getTextMax())<=0);
		}

		// Not all data types have minimum and maximum. Known exceptions are ignored.
		if (STAT_LESS_DATA_TYPE.contains(fk.getDataTypeName()) || STAT_LESS_DATA_TYPE.contains(pk.getDataTypeName())) {
			return false; // We return false, because these columns are unlikely to be a PK or FK.
		}

		// If the FK table is empty, we can just assume it is ok.
		if (fk.getRowCount() == 0) {
			return true;
		}

		// If FK table is not empty but PK table is empty, we have a violation of the FK constraint -> we return false.
		// Example is in AdventureWorks2014: AWBuildVersion.SystemInformationID --> ErrorLog.ErrorLogID
		if (pk.getRowCount() == 0) {
			return false;
		}

		// If the FK column contains only nulls, assume true
		if (fk.getNullRatio() != null && fk.getNullRatio() == 1.0) {
			return true;
		}

		// Fail-safe
		// Possible reason for this: missing statistics for the table
		System.out.println("We failed to compute 'inRange' feature for: " + this);
		return false;
	}

	// Check cardinality of PK and FK. The count of unique values in FK should be ≤ count of unique values in PK.
	private double violatesCardinalityConstraint() {
		// We expect nulls for binary attributes (uniqueRatio is not available for them), empty tables and empty columns
		if (fk.getNullRatio() == null) {
			return  0.958; // We replace missing values with the average computed over 40 databases
		}

		// We have to take into account possible nulls in FK
		double fkUniqueCount =  fk.getRowCount()*(1.0-fk.getNullRatio())*fk.getUniqueRatio();
		double pkUniqueCount =  pk.getRowCount()*pk.getUniqueRatio();

		// We are using a soft threshold because we are using merely estimated values.
		// We log the estimate to dampen the high values. It helps the regression model.
		double result = log(1.0+ max(0.0, (fkUniqueCount-pkUniqueCount)/pkUniqueCount));

		if (Double.isNaN(result) || Double.isInfinite(result)) {
			result = 0.958; // We replace missing values with the average computed over 40 databases
		}

		return result;
	}

	// Note: Whenever we are comparing string/number we will get an unspecified result.
	// Whenever we are comparing string/string, we may get a wrong result due to mismatch of collations in the database
	// and java. We could theoretically perform ordering in the sql (and a proof of concept is in an external sql file).
	// However, the produced table is going to be quite big to download (tuple_count ~ column_count^2).
	public Double getRangeCoverage() {

		// When one of the tables is empty, return the average (that is good for regression).
		if (fk.getRowCount()==0 || pk.getRowCount()==0) return 0.412;

		// If one of the columns is binary...
		if (fk.getValueMax() == null || pk.getValueMax() == null) return 0.0;

		// We cover the scenario where FK contains values out of PK range.
		// To avoid division by zero (because PK contains only one value), we increment the denominator by one.
		// To deal with the situation where the FK contains only one unique value, we also increment the nominator.
		double result = (max(pk.getValueMin(), min(fk.getValueMax(), pk.getValueMax())) - min(max(fk.getValueMin(), pk.getValueMin()), pk.getValueMax())+1.0) / (pk.getValueMax() - pk.getValueMin()+1.0);

		if (Double.isNaN(result) || result<0.0) {
			result = 0.412; // We replace missing values with the average computed over 40 databases
		}

		return result;
	}

	private Double getHistogramSimilarity() {
//		System.out.println(fk + " ---> " + pk);
		try {
			return Histogram.jaccard(fk.getHistogramBounds(), pk.getHistogramBounds());
		} catch (RuntimeException ignored) {

		}

		return null;
	}

	private double getAvgWidthDiff() {
		double result = Double.NaN;

		// We could also multiply the value by sqrt(min(pk.getRowCount(), fk.getRowCount())) to take into account the sample size.
		if (pk.getWidthAvg() != null && fk.getWidthAvg() != null) {  // Null if the table is empty
			result = abs(pk.getWidthAvg() - fk.getWidthAvg())/ max(pk.getWidthAvg(), fk.getWidthAvg()); // Is it beneficial to normalize the diff by max(width1, width2)
		}

		if (Double.isNaN(result)) {
			result = 0.357; // We replace missing values with the average computed over 40 databases
		}

		return result;
	}

	public void setMediumFeatures(Chen chen) {
		containsFKName = utility.Tokenization.contains(fk.getTokenizedLowerCaseTrimmedName(), KEYWORDS_FK);
		levenshteinColumns = Levenshtein.getDistance(fk.getLowerCaseTrimmedName(), pk.getLowerCaseTrimmedName());
		levenshteinToTable = Levenshtein.getDistance(fk.getLowerCaseTrimmedName(), pkLowerCaseTrimmedTable);
		levenshteinFromTable = Levenshtein.getDistance(fkLowerCaseTrimmedTable, pk.getLowerCaseTrimmedName());  // Does not help. Included for completeness.
		tokenShareRatioLd = TokenShareRatio.setTokenShareRatioFkLD(fk.getTokenizedLowerCaseTrimmedName(), pk.getTokenizedLowerCaseTrimmedName());
		tpcSimilarity = Tpc.similarity(fkTableTokenizedLowerCaseTrimmedName, fk.getTokenizedLowerCaseTrimmedName(), pk.getTokenizedLowerCaseTrimmedName(), pkTableTokenizedLowerCaseTrimmedName);
		chenColumnSimilarity = chen.getChenSimilarity(fk, pk);
		chenTableSimilarity = chen.getTableChenSimilarity(fk.getTokenizedLowerCaseTrimmedName(), pkTableTokenizedLowerCaseTrimmedName);
		setFirstCharAgree();
	}

	public void setSlowFeatures(Connection connection) throws SQLException {
		setSatisfiesFKConstraint(connection);
	}



	private void setFirstCharAgree() {
		boolean abbreviationMatches = false;

		for (String token : fk.getTokenizedLowerCaseTrimmedName()) {
			if (token.equals(pkLowerCaseTrimmedTable.substring(0,1))) abbreviationMatches = true;
		}

		firstCharAgree = (abbreviationMatches && !Collections.disjoint(fk.getTokenizedLowerCaseTrimmedName(), Column.KEYWORDS));
	}

	public void estimateForeignKeyProbability() {
		foreignKeyProbability = Logistic.classify(toArray(), WEIGHTS, BIAS);
	}

	private void setSatisfiesFKConstraint(Connection conn) throws SQLException {
		// Are all FK values present in pkTable.pk?
		// The query works in MySQL and PostgreSQL, but fails on MSSQL and Oracle because of exist clause in select.
		String query = "SELECT not EXISTS (" +
				"select * " +
				"from `" + schema + "`.`" + fkTable + "` t1 " +
				"left join `" + schema + "`.`" + pkTable + "` t2  " +
				"on  t1.`" + fk.getName() + "` = t2.`" + pk.getName() + "` " +
				"where t1.`" + fk.getName() + "` is not null and t2.`" + pk.getName() + "` is null " +
				") as satisfiesFKConstraint";

		try (Statement stmt = conn.createStatement()) {
			stmt.setQueryTimeout(20);
			try (ResultSet rs = stmt.executeQuery(query)) {
				while (rs.next()) {
					if (rs.getBoolean(1)) {
						satisfiesFKConstraint = "true";
					} else {
						satisfiesFKConstraint = "false";
					}
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				satisfiesFKConstraint = "timeout";
			}
		}
	}

	public void setRatioSatisfiedFKConstraint(Connection conn) throws SQLException {
		// Are all FK values present in pkTable.pk?
		// The query works in MySQL and PostgreSQL, but fails on MSSQL and Oracle because of exist clause in select.
		String query = "EXPLAIN SELECT 1.0*t2.cnt/t3.cnt " +
			"FROM (" +
				"SELECT count(*) AS cnt " +
				"FROM `" + schema + "`.`" + fkTable + "` " +
			") t3," +
			"(" +
				"SELECT count(*) AS cnt " +
				"FROM (" +
					"SELECT gammagt.arg1 " +
					"FROM `" + schema + "`.`" + fkTable + "` a " +
					"LEFT JOIN `" + schema + "`.`" + pkTable + "` b " +
					"ON  a.`" + fk.getName() + "` = b.`" + pk.getName() + "` " +
					"WHERE a.`" + fk.getName() + "` IS NOT NULL" +
				") t1" +
			") t2";

		try (Statement stmt = conn.createStatement()) {
			stmt.setQueryTimeout(2);
			try (ResultSet rs = stmt.executeQuery(query)) {
				while (rs.next()) {
					satisfiedFKRatio = rs.getDouble(1);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				satisfiesFKConstraint = "timeout";
			}
		}
	}


	private double[] toArray() {
		return new double[]{
				fk.isPrimaryKey() ? 1 : 0,
				fk.getContains() ? 1 : 0,
				fk.getLD(),                 // Low importance
				fk.getOrdinalPosition(),    // Low importance
				fk.isKeywordSingleton() ? 1 : 0,
				fk.getTableContainsLob() ? 1 : 0,
				fk.isDoppelganger() ? 1 : 0,
				pk.isDoppelganger() ? 1 : 0,
				pk.hasMultiplePK() ? 1 : 0,
				dataTypeCategoryAgree ? 1 : 0,
				dataLengthAgree ? 1 : 0,
				tokenShareRatioLd,
				tpcSimilarity,
				levenshteinToTable,
				pk.getTokenizedName().size() <= fk.getTokenizedName().size() ? 1 : 0,
				violatesSpecialization ? 1 : 0,
				isInRange ? 1 : 0,
				avgWidthDiff,
				violatesCardinalityConstraint,
				rangeCoverage,
				isTheSameColumn ? 1 : 0,
				isTheSameTable ? 1 : 0,
				isForeignKey ? 1 : 0,       // pk_suffixSchemaCount, fk_prefixSchemaCount, fk_isDecimal, chenColumnSimilarity, fk_minLDOtherTable, fk_uniqueRatio, histogramOverlap, isInRange, avgWidthDiff, pk_isKeywordSingleton
		};
	}

	public String toQuery(char leftQuote, char rightQuote) {
		String fk = this.fk.getName();
		String pk = this.pk.getName();
		return "ALTER TABLE " + leftQuote + fkTable + rightQuote + " ADD FOREIGN KEY (" + leftQuote + fk + rightQuote + ") REFERENCES " + leftQuote + pkTable + rightQuote + "(" + leftQuote + pk + rightQuote + ");";
	}

	public String toFeature() {
		return String.join(Setting.CSV_SEPARATOR,
				Setting.CSV_QUOTE + schema + Setting.CSV_QUOTE,
				Setting.CSV_QUOTE + pkTable + Setting.CSV_QUOTE,
				pk.toFeature(),
				Setting.CSV_QUOTE + fkTable + Setting.CSV_QUOTE,
				fk.toFeature(),
				dataTypeAgree ? "true" : "false",
				dataTypeCategoryAgree ? "true" : "false",
				dataLengthAgree ? "true" : "false",
				decimalAgree ? "true" : "false",
				isTheSameColumn.toString(),
				isTheSameTable.toString(),
				firstCharAgree ? "true" : "false",
				nameAgree ? "true" : "false",
				levenshteinColumns.toString(),
				levenshteinToTable.toString(),
				levenshteinFromTable.toString(),
				Double.toString(tpcSimilarity),
				Double.toString(tokenShareRatioLd),
				Double.toString(chenColumnSimilarity),
				Double.toString(chenTableSimilarity),
				(pk.getTokenizedName().size() <= fk.getTokenizedName().size()) ? "true" : "false",
				Double.toString(avgWidthDiff),
				Double.toString(violatesCardinalityConstraint),
				isInRange ? "true" : "false",
				satisfiesFKConstraint,
				String.format(Locale.ROOT, "%.6f", satisfiedFKRatio),
				rangeCoverage != null ? Double.toString(rangeCoverage) : "",
				histogramSimilarity != null ? Double.toString(histogramSimilarity) : "",
				violatesSpecialization.toString(),
				containsFKName ? "true" : "false",
				isForeignKey.toString()
		);
	}

	public String toProbability() {
		return toFeature() + Setting.CSV_SEPARATOR + String.format(Locale.ROOT, "%.6f", getForeignKeyProbability());
	}

	public String toString() {
		return fk + " --> " + pk;
	}

	// Needed for optimization.
	// Should also implement equals.
	@Override
	public int compareTo(Relationship that) {
		if (foreignKeyProbability > that.foreignKeyProbability) return -1;
		if (foreignKeyProbability < that.foreignKeyProbability) return 1;
		return 0;
	}
}
