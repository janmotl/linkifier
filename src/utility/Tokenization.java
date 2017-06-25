package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

// See:
//  http://codereview.stackexchange.com/questions/62500/split-camel-cased-snake-cased-string
//  http://stackoverflow.com/questions/2559759/how-do-i-convert-camelcase-into-human-readable-names-in-java
public class Tokenization {
	private static final Pattern PUNCTSPACE = Pattern.compile("[ \\p{Punct}]+");
	private static final Pattern TRANSITION = Pattern.compile(
			String.format("%s|%s|%s",
					"(?<=[\\p{javaUpperCase}])(?=[\\p{javaUpperCase}][\\p{javaLowerCase}])",
					"(?<=[^\\p{javaUpperCase}])(?=[\\p{javaUpperCase}])",
					"(?<=[\\p{javaLowerCase}\\p{javaUpperCase}}])(?=[^\\p{javaLowerCase}\\p{javaUpperCase}])"
			)
	);

	public static List<String> split(String text) {
		List<String> result = new ArrayList<>();
		for (String word : PUNCTSPACE.split(text)) {
			if (word.isEmpty()) {
				continue;
			}
			Collections.addAll(result, TRANSITION.split(word));
		}
		return result.isEmpty() ? Collections.singletonList(text) : result;
	}

	public static List<String> lowercaseSplit(String text) {
		List<String> result = new ArrayList<>();
		for (String token : split(text)) {
			result.add(token.toLowerCase());
		}
		return result;
	}

	public static Boolean contains(List<String> lowerCaseTokens, List<String> keywords) {
		for (String keyword : keywords) {
			for (String token : lowerCaseTokens) {
				if (token.equals(keyword)) return true;
			}
		}
		return false;
	}
}
