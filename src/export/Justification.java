package export;

import main.Column;
import main.Relationship;
import main.Table;
import utility.Multiplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class Justification {
	// Constants fragile to changes....
	// Beware of commas in the names.
	// The format is: fk pk f1 f2 f3 probability estimated isFKC
	private final static String fkHeader = "fk, pk, fk_isPrimaryKey (this helps to get the direction from FK to PK right but it does not always hold), fk_contains (FKs generally contains tokens like 'ID' or 'code'), fk_levenshteinDistance (FK should be named differently from it's own table name), fk_ordinalPosition (FKs are generally somewhere at the beginning of the table), fk_isKeywordSingleton ('id' name is commonly the name of the PK not FK), fk_suspiciousNullRatio (nulls in columns like 'cancellationReason' are to be expected but in the remaining FK columns they are suspicious), fk_isDoppelganger (common in relationship tables), pk_isDoppelganger (entity tables do not generally contain doppelgangers), pk_isEmptyTable (empty tables are frequently singletons like log table -> no fk constraint), pk_hasMultiplePK (multiple PK columns are a sign of a junction table), dataTypeCategoryAgree (should hold but can be violated between char and varchar), dataLengthAgree (desirable but can be violated in case of varchar), tokenShareRatioLD (FK should be similar to PK's name; works better than levenshteinColumns and tpcSimilarity), tpcSimilarity (FK name should be composed of {fkTable; pkTable; pk; typical keywords}), levenshteinToTable (FK column should be similar to PK's table name), pkDoesNotHaveMoreTokensThanFk (PK names are generally shorter than FK names), violatesSpecialization (FK in is-a relationship should not have more columns than PK), violatesRange (FK values should be in the range of PK values), avgWidthDiff (the average length of the values in FK should be close to average in PK), violatesCardinalityConstraint (the count of unique values in FK should be <= count in PK), rangeCoverage (values in FK should cover a wide range of values in PK), specializationTightness (prefer parents with the smallest count of rows), isTheSameColumn (self referencing should never happen), isTheSameTable (hierarchies are relatively rare in the databases), probability (from logistic regression based on the weights on the left), estimated (after application of of the constraints in the optimization phase), isFKC (as reported by the database)";
	private final static String pkHeader = "column, BigInt, Integer, Date, SmallInt, Decimal (number data type is commonly used for PKs on Oracle), TinyInt, Varchar (if all data types are zero char is assumed), Timestamp (current timestamp does not guarantee uniqueness), Binary, Double, Time, Real, Bit, LongVarBinary, LongVarChar, isDecimal (important for decimal data type), ordinalPosition (the first columns are more likely to be part of a PK), levenshteinDistance (the id should be named after the table), minLDOtherTable (the column should be named after some table), isDoppelganger (common in relationship tables), isKeywordSingleton (ID and Code are a sign of a PK), isJunctionTable (junction tables commonly have a compound PK), tableColumnCount (with the increasing count of columns the likelihood of being PK decreases), avgWidthBigger10 (columns longer than 10 bytes are less likely to be PK), nullRatio (by definition a PK is not null), uniqueRatio (surrogate PKs must be unique but compound PKs not), contains (some common token like ID or NO), probability (as estimated with logistic regression based on the weights on the left), estimated (after application of the constraints in the optimization phase), isPK (as reported by the database)";

	public static void writePk(File file, List<Table> tables) throws FileNotFoundException, UnsupportedEncodingException {
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			writer.println(pkHeader);
			for (Table table : tables) {
				for (Column column : table.getColumnList()) {
					writer.println(
							column + ", " +
							Arrays.toString(Multiplication.elementWise(column.toArray(), Column.WEIGHTS)).replace("[", "").replace("]", "") + ", " +
							column.getPkProbability() + ", " +
							column.isEstimatedPk() + ", " +
							column.isPrimaryKey()
					);
				}
			}
		}
	}

	public static void writeFk(File file, List<Relationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			writer.println(fkHeader);
			for (Relationship relationship : relationships) {
				writer.println(
						relationship.getFkTableName() + "." + relationship.getFk().getName() + ", " +
						relationship.getPkTableName() + "." + relationship.getPk().getName() + ", " +
						Arrays.toString(Multiplication.elementWise(relationship.toArray(), Relationship.WEIGHTS)).replace("[", "").replace("]", "") + ", " +
						relationship.getForeignKeyProbability() + ", " +
						relationship.isEstimatedFk() + ", " +
						relationship.isForeignKey()
				);
			}
		}
	}
}
