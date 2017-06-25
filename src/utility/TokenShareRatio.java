package utility;

import main.Column;
import main.Setting;

import java.util.Collections;
import java.util.List;

public class TokenShareRatio {

	// LCS works better than LD
	public static double setTokenShareRatioFkLD(List<String> tokensFk, List<String> tokensPk) {
		double shared = 0;
		double count = 0;

		for (String token : tokensPk) {
			if (tokensFk.contains(token) || Column.KEYWORDS.contains(token)) shared++;
			else if (Setting.SYNONYM_PERSON.contains(token) && !Collections.disjoint(Setting.SYNONYM_PERSON, tokensFk)) shared++;
			else if (Setting.SYNONYM_PRODUCT.contains(token) && !Collections.disjoint(Setting.SYNONYM_PRODUCT, tokensFk)) shared++;
			else {
				double maxSim = Integer.MIN_VALUE;
				for (String tokenFk : tokensFk) {
					double sim = 1.0*LCS.getLongestCommonSubsequence(token, tokenFk)/token.length();
					maxSim = Math.max(maxSim, sim);
				}
				shared += maxSim;
			}
			count++;
		}

		return shared / count;
	}

}
