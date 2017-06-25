package utility;

import main.Setting;
import org.simmetrics.metrics.StringMetrics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tpc {

	private static final org.simmetrics.StringMetric metric = StringMetrics.jaroWinkler(); // In this case, jaroWinkler works better than levenshtein, lcs (by a tiny part), jaro, smithWaterman, overlapCoefficient or qGramsDistance (not so bad)

	// FK name generally composes of following token types:
	//  1) PK table name
	//  2) PK column name
	//  3) FK table name
	//  4) Relationship name (e.g. "working", "studying", "to", "from",...)
	//  5) Keyword saying that it is a key (e.g. "id", "fk",...)
	// We just attempt to match the tokens in the FK column name to tokens enlisted above.
	// Note however, that each single token can be used maximally once -> use Hungarian algorithm.
	public static Double similarity(List<String> fkTable, List<String> fk, List<String> pk, List<String> pkTable) {
		// Initialize two lists of tokens
		List<String> fkTokens = fk;
		List<String> otherTokens = new ArrayList<>();
		//      otherTokens.add(getAbbreviation(fkTable));  // Only in the abbreviated form for fkTable!
		otherTokens.addAll(pk);
		otherTokens.addAll(pkTable);
		otherTokens.add(getAbbreviation(pkTable));

		// Add KEYWORD - a single joker card, which can represent any single token from KEYWORDS list
		otherTokens.add("KEYWORD");

		// Get cost matrix between each token in fkTokens and each token in otherTokens
		double[][] cost = new double[fkTokens.size()][otherTokens.size()];
		for (int i = 0; i < fkTokens.size(); i++) {
			for (int j = 0; j < otherTokens.size(); j++) {
				cost[i][j] = 1 - similarity(fkTokens.get(i), otherTokens.get(j), otherTokens);
			}
		}

		// Get optimal matching
		Hungarian hungarian = new Hungarian(cost);
		int[] result = hungarian.execute();

		// Calculate similarity
		double similarity = solutionSimilarity(fkTokens, otherTokens, result);

		// Print solution
//      System.out.print("Other tokens: ");
//      for (String token : otherTokens) {
//          System.out.print(token + " ");
//      }
//      System.out.print("\nMatch cost: ");
//      printArray(cost);
//      System.out.println("Foreign column tokens: " + fk);
//      System.out.print("Matched tokens: ");
//      for (int i : result) {
//          System.out.print(otherTokens.get(i) + " ");
//      }
//      System.out.println();
//      System.out.println("Similarity is: " + similarity);
//      System.out.println();

		return similarity;
	}

	private static double similarity(String a, String b, List<String> otherTokens) {
		double sim = metric.compare(a, b);
		double sim2 = asymmetricAbbreviationSimilarity(a, b, otherTokens);
		double result = Math.max(sim, sim2);
		return result;
	}

	// Returns concatenated initial letters from tokens.
	// This is used frequently in tpc schemas.
	private static String getAbbreviation(List<String> tokens) {
		String result = "";
		for (String token : tokens) {
			result += token.substring(0, 1);
		}

		return result;
	}

	// We are interested only in the abbreviation/joker card in the FK
	private static double asymmetricAbbreviationSimilarity(String a, String b, List<String> otherTokens) {
		// Joker card
		if ("KEYWORD".equals(b) && Setting.KEYWORD_RELATIONSHIP.contains(a) && !otherTokens.contains(a)) return 0.95;

		// Abbreviation to two letters (e.g. address -> ad)
		if (a.length() == 2 && b.length() >= 2 && a.charAt(0) == b.charAt(0) && a.charAt(1) == b.charAt(1)) {
			return 0.95;    // We penalize that a bit
		}

		// Another abbreviation to two letters (e.g. sector -> sc)
		if (a.length() == 2 && b.length() >= 3 && a.charAt(0) == b.charAt(0) && a.charAt(1) == b.charAt(2)) {
			return 0.95;
		}

		// Employ related terms (synonyms, hypernyms and hyponyms). Unfortunately, it is a hard match/mismatch
		if (Setting.SYNONYM_PERSON.contains(a) && Setting.SYNONYM_PERSON.contains(b)) {
			return 0.95;
		}

		if (Setting.SYNONYM_COUNTRY.contains(a) && Setting.SYNONYM_COUNTRY.contains(b)) {
			return 0.95;
		}

		if (Setting.SYNONYM_PRODUCT.contains(a) && Setting.SYNONYM_PRODUCT.contains(b)) {
			return 0.95;
		}

		if (Setting.SYNONYM_CITY.contains(a) && Setting.SYNONYM_CITY.contains(b)) {
			return 0.95;
		}

		return 0.0;
	}

	private static void printArray(double matrix[][]) {
		for (double[] row : matrix)
			System.out.println(Arrays.toString(row));
	}

	private static double solutionSimilarity(List<String> fkTokens, List<String> otherTokens, int[] matching) {
		double similarity = 0;
		double tokenCount = fkTokens.size();

		for (int i = 0; i < matching.length; i++) {
			if (matching[i] >= 0) { // If unmatched, we "increment" similarity by 0
				similarity += similarity(fkTokens.get(i), otherTokens.get(matching[i]), otherTokens);
			}
		}

		return similarity / tokenCount;
	}
}
