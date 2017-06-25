package utility;

public class Levenshtein {

	// Source: https://rosettacode.org/wiki/Levenshtein_distance#Java
	// We avoid lower case transformation in this place because the
	// transformation, repeated million times, is time consuming -> use cached names.
	// Disadvantage: The result is a distance, not a similarity.
	// Speed: Jaro-Winkler is ~10 times faster than Levenshtein.
	// See: https://www.ncbi.nlm.nih.gov/pmc/articles/PMC4086698/pdf/1471-2105-15-187.pdf
	public static int getDistance(String a, String b) {
		int[] costs = new int[b.length() + 1];
		for (int j = 0; j < costs.length; j++)
			costs[j] = j;
		for (int i = 1; i <= a.length(); i++) {
			costs[0] = i;
			int nw = i - 1;
			for (int j = 1; j <= b.length(); j++) {
				int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
				nw = costs[j];
				costs[j] = cj;
			}
		}
		return costs[b.length()];
	}
}
