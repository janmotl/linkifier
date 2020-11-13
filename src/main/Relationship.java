package main;

import utility.*;

import javax.annotation.Nullable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import static java.lang.Math.*;

public class Relationship implements Comparable<Relationship> {
	private final static Logger LOGGER = Logger.getLogger(Relationship.class.getName());
	private static final List<String> KEYWORDS_FK = Arrays.asList("fk", "type", "eid");
	private static final List<String> STAT_LESS_DATA_TYPE = Arrays.asList("BINARY", "LONGVARBINARY", "LONGVARCHAR");
	public static final double[] WEIGHTS = new double[]{   // Coefficients from H2O. The coefficients must NOT be standardized. Beware of changing att=false to att=true as it changes not only the sign, but also bias.
			-0.9051092393103701,    // fk_isPrimaryKey (this helps to get the direction from FK to PK right, but it does not always hold)
			1.4800963756732868,     // fk_contains (FKs generally contains tokens like "ID", "code",...)
			0.1121816844016589,    // fk_levenshteinDistance (FK should be named differently from it's own table name)
			-0.003360204542325813,  // fk_ordinalPosition (FKs are generally somewhere at the beginning of the table)
			-2.4185131888467026,    // fk_isKeywordSingleton ("id" name is commonly the name of the PK, not FK)
			-0.7966380124498442,    // fk_suspiciousNullRatio (nulls in "cancellationReason" are to be expected, but in the remaining FK columns it is suspicious)
			1.9988684844900322,     // fk_isDoppelganger (common in relationship tables)
			-5.936077562897998,     // pk_isDoppelganger (entity tables do not contain doppelgangers, which are identified by their names)
			0.8128636915023133,     // pk_isEmptyTable (if the table is empty, it is likely just a log table -> no fk constraint)
			-2.4692816625571132,     // pk_hasMultiplePK (multiple PK columns are a sign of a junction table)
			6.808168246120176,      // dataTypeCategoryAgree (should hold, but can be violated between char and varchar) MOVE TO dataTypeAgree
			4.332770141018438,     // dataLengthAgree (desirable, but can be violated in case of varchar)
			7.2578982511490775,     // tokenShareRatioLD (FK should be similar to PK's name; works better than levenshteinColumns and tpcSimilarity)
			4.705476118049105,      // tpcSimilarity (FK name should be composed of {fkTableName, pkTableName, pk, typical keywords})
			-0.39375989011425677,    // levenshteinToTable (FK column should be similar to PK's table name)
			0.6301783595908211,     // pkDoesNotHaveMoreTokensThanFk (PK names are generally shorter than FK names)
			-13.388762100412785,     // violatesSpecialization (FK in is-a relationship should not have more columns than PK)
			-16.256910657715604,  	// violatesRange (FK values should be in the range of PK values)
			-0.5605913300905464, 	// avgWidthDiff (the average length of the values in FK should be close to average in PK)
			-1.50284433068921,    // violatesCardinalityConstraint (the count of unique values in FK should be ≤ count in PK)
			1.6644792054307205,    // rangeCoverage (values in FK should cover a wide range of values in PK)
			-0.2649660921894703,    // specializationTightness (when we have a deep hierarchy, prefer a parent with the lowest row count)
			-15.620701582762347,    // isTheSameColumn (self referencing should never happen)
			-2.6708125941481073};   // isTheSameTable (hierarchies are relatively rare in the databases)
	private static final double BIAS = -23.896451168064164;

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
	private boolean dataTypeAgree;
	private boolean dataTypeCategoryAgree;
	private boolean dataLengthAgree;
	private boolean decimalAgree;
	private boolean isTheSameColumn;
	private boolean isTheSameTable;
	private boolean firstCharAgree;
	private boolean nameAgree;          // Naive feature for comparison with Oracle Data Modeller
	private int levenshteinColumns;
	private int levenshteinToTable;
	private int levenshteinFromTable;
	private double tokenShareRatioLd;
	private double chenColumnSimilarity;
	private double chenTableSimilarity;
	private double tpcSimilarity;
	private double satisfiedFKRatio;
	private double violatesCardinalityConstraint;
	private String satisfiesFKConstraint = "untested";
	private double violatesRange;
	private boolean isSpecialization;
	private @Nullable Double specializationTightness;	// These values are from database statistics -> nullable
	private @Nullable Double rangeCoverage;
	private @Nullable Double histogramSimilarity;
	private Boolean violatesSpecialization = false;
	private boolean containsFKName;
	private double avgWidthDiff;
	private Column fk;                   // We model composite fk constraints by defining the individual relationships
	private Column pk;
	private Table fkTable;
	private Table pkTable;
	private String fkTableName;
	private String pkTableName;
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
		fkTableName = other.fkTableName;
		pkTableName = other.pkTableName;
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
				"violatesRange",
				"isSpecialization",
				"specializationTightness",
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

	public String getFkTableName() {
		return fkTableName;
	}

	public void setFkTable(Table fkTable) {
		this.fkTable = fkTable;
		fkTableName = fkTable.getName();
		fkLowerCaseTrimmedTable = fkTable.getLowerCaseTrimmedName();
		fkTableTokenizedLowerCaseTrimmedName = fkTable.getTokenizedLowerCaseTrimmedName();
	}

	public String getPkTableName() {
		return pkTableName;
	}

	public void setPkTable(Table pkTable) {
		this.pkTable = pkTable;
		pkTableName = pkTable.getName();
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

	public boolean getDataTypeCategoryAgree() {
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
		isTheSameColumn = (pkTableName.equals(fkTableName) && pk.getName().equals(fk.getName()));
		isTheSameTable = (pkTableName.equals(fkTableName));
		violatesSpecialization = fk.getName().equals(pk.getName()) && fk.getRowCount()>(1.125*pk.getRowCount()) && fk.isBestAttemptPk() && !fk.hasMultiplePK() && (fk.getUniqueRatio()==null || fk.getUniqueRatio()>0.95); // If the row counts are similar, the inequality comparison gets unreliable -> we increase the limit by 12.5% to be sure. Note that we currently rely on fk.hasMultiplePK(), which assumes the PKs are already set in the database. We deal with that by the requirement that the FK column is unique.
		avgWidthDiff = getAvgWidthDiff();
		violatesCardinalityConstraint = violatesCardinalityConstraint();
		violatesRange = violatesRange();
		rangeCoverage = getRangeCoverage();
		nameAgree = (pk.getName().equals(fk.getName()));
		isSpecialization = isSpecialization();
		violatesSpecialization = violatesSpecialization();
		specializationTightness = specializationTightness();
	}

	private boolean isSpecialization() {
		// The fkTable must have the same count of PKs as pkTable.
		int fkBestAttemptPkCount = 0;  // The count of isBestAttemptPk (PKs may still not be set in the database)
		for (Column column : fkTable.getColumnList()) {
			if (column.isBestAttemptPk()) fkBestAttemptPkCount++;
		}
		int pkBestAttemptPkCount = 0;
		for (Column column : pkTable.getColumnList()) {
			if (column.isBestAttemptPk()) pkBestAttemptPkCount++;
		}

		return fk.getName().equals(pk.getName()) && fk.isBestAttemptPk() && fkBestAttemptPkCount==pkBestAttemptPkCount;
	}

	// If it looks like a specialization relationship, validate that the specialized table does not contain
	// more rows than the more generic table.
	private boolean violatesSpecialization() {
		// If the row counts are similar, the inequality comparison gets unreliable -> we increase the limit by 12.5% to be sure.
		return isSpecialization && fk.getRowCount()>(1.125*pk.getRowCount());
	}

	// Whenever a subclass can reference multiple superclasses, the superclass with the lowest row count,
	// which still satisfies the FK constraint, should be selected.
	private @Nullable Double specializationTightness() {
		if (isSpecialization) {
			double result = (double)pk.getRowCount() / (double)fk.getRowCount();
			if (result<1.0 || Double.isNaN(result) || Double.isInfinite(result)) {
				return null;
			} else {
				return log(result);
			}
		} else {
			return null;
		}
	}

	// It is known that OpenML_2016 violates constraint: data_quality.implementation_id --> implementation.id.
	// Carcinogenesis:	sbond_2.atomid --> atom.atomid.
	// medical: Examination.ID --> Patient.ID.
	// These are "bugs" of the schemas, not the code.
	// Because the extrema are frequently based on sample and/or outdated statistics, we do not return
	// a binary decision but a continuous value.
	// Note: The current implementation neglects:
	//  1) the size of the sample used by the statistics to get the extrema
	//  2) row count of the table
	//  3) uniqueRatio
	// But all these data can be used to estimate the real extrema.
	public double violatesRange() {

		// Compare by numbers, if possible
		if (fk.getValueMin() != null && pk.getValueMin() != null && fk.getValueMax() != null && pk.getValueMax() != null) {

			// Avoid division by zero
			if (pk.getValueMin().equals(pk.getValueMax()) && (fk.getValueMin()<pk.getValueMin() || pk.getValueMax()<fk.getValueMax())) {
				return 1;
			}
			if (pk.getValueMin().equals(pk.getValueMax()) && (fk.getValueMin().equals(fk.getValueMax()))) {
				return 0;
			}

			// Deal with NaNs (appear in OpenML_2016.data_quality.value). Justification for always returning 1: What monster would use NaN as a key?
			if (pk.getValueMin().isNaN() || pk.getValueMax().isNaN() || fk.getValueMin().isNaN() || fk.getValueMax().isNaN()) return 1;

			// Deal with infinities (for example, inf/inf produces NaN). Justification for always returning 1: What monster would use infinity as a key?
			if (pk.getValueMin().isInfinite() || pk.getValueMax().isInfinite() || fk.getValueMin().isInfinite() || fk.getValueMax().isInfinite()) return 1;

			double range = pk.getValueMax() - pk.getValueMin();
			double lowerRelativeOvershoot = max(0, (pk.getValueMin()-fk.getValueMin()) / range);
			double upperRelativeOvershoot = max(0, (fk.getValueMax()-pk.getValueMax()) / range);

			// Since we are using logistic regression, we damp extremely large values with logarithm
			return log1p(lowerRelativeOvershoot+upperRelativeOvershoot);
		}

		// Not all data types have minimum and maximum. Known exceptions are ignored.
		if (STAT_LESS_DATA_TYPE.contains(fk.getDataTypeName()) || STAT_LESS_DATA_TYPE.contains(pk.getDataTypeName())) {
			return 1; // We return quite a large value, because these columns are unlikely to be a PK or FK.
		}

		// If the FK table is empty, we can just assume it is ok.
		if (fk.getRowCount() == 0) {
			return 0;
		}

		// If FK table is not empty but PK table is empty, we have a violation of the FK constraint -> we return a high value.
		// Example is in AdventureWorks2014: AWBuildVersion.SystemInformationID --> ErrorLog.ErrorLogID
		if (pk.getRowCount() == 0) {
			return 1;
		}

		// If the FK column contains only nulls, assume ok. Since we are using estimates, we use soft threshold.
		if (fk.getNullRatio() != null && fk.getNullRatio() > 0.99) {
			return 0;
		}

		// Fail-safe
		// Possible reason for this: missing statistics for the table
		LOGGER.fine("We failed to compute 'inRange' feature for: " + this + ". Was statistics collected on these columns?");
		return 0;    // I am optimistic...
	}

	// Check cardinality of PK and FK. The count of unique values in FK should be ≤ count of unique values in PK.
	public double violatesCardinalityConstraint() {
		// We expect nulls for binary attributes (uniqueRatio is not available for them), empty tables, empty columns or it the statistics was not calculated
		if (fk.getUniqueRatio() == null || pk.getUniqueRatio() == null) {
			return 0.958; // We replace missing values with the average computed over 40 databases
		}

		// NullRatio is nullable (e.g. because statistics is not available)
		double fkNullRatio = 0.13338692; // Average nullRatio computed over 40 databases
		if (fk.getNullRatio() != null) {
			fkNullRatio = fk.getNullRatio();
		}

		// We have to take into the account possible nulls in the FK during fkUniqueCount computation.
		// On the other end, pkUniqueCount should be non-null by primary key constraint -> no correction for the PK.
		double fkUniqueCount =  fk.getRowCount()*(1.0-fkNullRatio)*fk.getUniqueRatio();
		double pkUniqueCount =  pk.getRowCount()*pk.getUniqueRatio();

		// We are returning a continuous value (and not a binary decision) because we are using merely estimated values
		// (e.g. the nullRatios, uniqueRatios and rowCounts can be estimated from obsolete statistics).
		// We logarithm the estimate to dampen the high values. It helps the regression model.
		double result = log(1.0 + max(0.0, (fkUniqueCount-pkUniqueCount)/pkUniqueCount));

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
		if (pk.getValueMin() == null || fk.getValueMin() == null || fk.getValueMax() == null || pk.getValueMax() == null) return 0.0;

		// We cover the scenario where FK contains values out of PK range.
		// To avoid division by zero (because PK contains only one value), we increment the denominator by one.
		// To deal with the situation where the FK contains only one unique value, we also increment the nominator.
		double result = (max(pk.getValueMin(), min(fk.getValueMax(), pk.getValueMax())) - min(max(fk.getValueMin(), pk.getValueMin()), pk.getValueMax())+1.0) / (pk.getValueMax() - pk.getValueMin()+1.0);

		if (Double.isNaN(result) || Double.isInfinite(result) || result<0.0) {
			result = 0.412; // We replace missing values with the average computed over 40 databases
		}

		return result;
	}


	private double getAvgWidthDiff() {
		double result = Double.NaN;

		// We could also multiply the value by sqrt(min(pk.getRowCount(), fk.getRowCount())) to take into account the sample size.
		if (pk.getWidthAvg() != null && fk.getWidthAvg() != null) {  // Null if the table is empty
			result = abs(pk.getWidthAvg() - fk.getWidthAvg())/ max(pk.getWidthAvg(), fk.getWidthAvg()); // Is it beneficial to normalize the diff by max(width1, width2)
		}

		if (Double.isNaN(result) || Double.isInfinite(result)) {
			result = 0.357; // We replace missing values with the average computed over 40 databases
		}

		return result;
	}

	public void setMediumFeatures(Chen chen) {
		containsFKName = Tokenization.contains(fk.getTokenizedLowerCaseTrimmedName(), KEYWORDS_FK);
		levenshteinColumns = Levenshtein.getDistance(fk.getLowerCaseTrimmedName(), pk.getLowerCaseTrimmedName());
		levenshteinToTable = Levenshtein.getDistance(fk.getLowerCaseTrimmedName(), pkLowerCaseTrimmedTable);
		levenshteinFromTable = Levenshtein.getDistance(fkLowerCaseTrimmedTable, pk.getLowerCaseTrimmedName());  // Does not help. Included for completeness.
		tokenShareRatioLd = TokenShareRatio.setTokenShareRatioFkLD(fk.getTokenizedLowerCaseTrimmedName(), pk.getTokenizedLowerCaseTrimmedName());
		tpcSimilarity = Tpc.similarity(fkTableTokenizedLowerCaseTrimmedName, fk.getTokenizedLowerCaseTrimmedName(), pk.getTokenizedLowerCaseTrimmedName(), pkTableTokenizedLowerCaseTrimmedName);
		chenColumnSimilarity = chen.getChenSimilarity(fk, pk);
		chenTableSimilarity = chen.getTableChenSimilarity(fk.getTokenizedLowerCaseTrimmedName(), pkTableTokenizedLowerCaseTrimmedName);
		histogramSimilarity = getHistogramSimilarity();
		setFirstCharAgree();
	}

	private @Nullable Double getHistogramSimilarity() {
//		System.out.println(fk + " ---> " + pk);
		try {
			return Histogram.jaccard(fk.getHistogramBounds(), pk.getHistogramBounds());
		} catch (RuntimeException ignored) {

		}

		return null;
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

	public void setSatisfiesFKConstraint(String satisfiesFKConstraint) {
		this.satisfiesFKConstraint = satisfiesFKConstraint;
	}

	public String getSatisfiesFKConstraint() {
		return satisfiesFKConstraint;
	}

	public void setRatioSatisfiedFKConstraint(Connection conn) throws SQLException {
		// Are all FK values present in pkTableName.pk?
		// The query works in MySQL and PostgreSQL, but fails on MSSQL and Oracle because of exist clause in select.
		String query = "EXPLAIN SELECT 1.0*t2.cnt/t3.cnt " +
			"FROM (" +
				"SELECT count(*) AS cnt " +
				"FROM `" + schema + "`.`" + fkTableName + "` " +
			") t3," +
			"(" +
				"SELECT count(*) AS cnt " +
				"FROM (" +
					"SELECT gammagt.arg1 " +
					"FROM `" + schema + "`.`" + fkTableName + "` a " +
					"LEFT JOIN `" + schema + "`.`" + pkTableName + "` b " +
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


	public double[] toArray() {
//	Features known to flip their sign because of some interaction:
//		pk_columnSize
//		pk_uniqueRatio
//		pk_avgWidthBigger10
//		pk_isJunctionTable
//		fk_contains
//		fk_tableContainsLob
//		dataTypeAgree	(because of dataTypeCategoryAgree)
		return new double[]{
				fk.isPrimaryKey() ? 1 : 0,
				fk.getContains() ? 1 : 0,
				fk.getLD(),                 // Low importance
				fk.getOrdinalPosition(),    // Low importance
				fk.isKeywordSingleton() ? 1 : 0,
				fk.getSuspiciousNullRatio(),
				fk.isDoppelganger() ? 1 : 0,
				pk.isDoppelganger() ? 1 : 0,
				pk.isEmptyTable(),
				pk.hasMultiplePK() ? 1 : 0,
				dataTypeCategoryAgree ? 1 : 0,
				dataLengthAgree ? 1 : 0,
				tokenShareRatioLd,
				tpcSimilarity,
				levenshteinToTable,
				pk.getTokenizedName().size() <= fk.getTokenizedName().size() ? 1 : 0,
				violatesSpecialization ? 1 : 0,
				violatesRange,
				avgWidthDiff,
				violatesCardinalityConstraint,
				rangeCoverage,
				specializationTightness==null ? 0.45212446106465326 : specializationTightness,
				isTheSameColumn ? 1 : 0,
				isTheSameTable ? 1 : 0   // Other interesting features: pk_suffixSchemaCount, fk_prefixSchemaCount, fk_isDecimal, chenColumnSimilarity, fk_minLDOtherTable, fk_uniqueRatio, histogramOverlap, pk_isKeywordSingleton
		};
	}

	public String toFeature() {
		return String.join(Setting.CSV_SEPARATOR,
				Setting.CSV_QUOTE + schema + Setting.CSV_QUOTE,
				Setting.CSV_QUOTE + pkTableName + Setting.CSV_QUOTE,
				pk.toFeature(),
				Setting.CSV_QUOTE + fkTableName + Setting.CSV_QUOTE,
				fk.toFeature(),
				dataTypeAgree ? "true" : "false",
				dataTypeCategoryAgree ? "true" : "false",
				dataLengthAgree ? "true" : "false",
				decimalAgree ? "true" : "false",
				isTheSameColumn ? "true" : "false",
				isTheSameTable ? "true" : "false",
				firstCharAgree ? "true" : "false",
				nameAgree ? "true" : "false",
				Integer.toString(levenshteinColumns),
				Integer.toString(levenshteinToTable),
				Integer.toString(levenshteinFromTable),
				Double.toString(tpcSimilarity),
				Double.toString(tokenShareRatioLd),
				Double.toString(chenColumnSimilarity),
				Double.toString(chenTableSimilarity),
				(pk.getTokenizedName().size() <= fk.getTokenizedName().size()) ? "true" : "false",
				Double.toString(avgWidthDiff),
				Double.toString(violatesCardinalityConstraint),
				Double.toString(violatesRange),
				isSpecialization ? "true" : "false",
				specializationTightness != null ? specializationTightness.toString() : "",
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
	// As the contract requires, we return a negative int if this < that.
	// Beware: equals() method must still return true only if we are comparing a relationship to itself because
	// we use this property in the generation of meaningful relationship candidates (isTheSameColumn()) -> we violate
	// the recommended contract between equals() and compareTo().
	@Override
	public int compareTo(Relationship that) {
		if (foreignKeyProbability > that.foreignKeyProbability) return 1;
		if (foreignKeyProbability < that.foreignKeyProbability) return -1;
		return 0;
	}


}
