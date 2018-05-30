package utility;

// Order preserving encoding of strings to numbers.
public class String2Num {
	// We ignore differences above the 2nd byte (e.g. in emoticons) in order to differentiate between the first 3 chars.
	private static final int BASE = 65536;

	// Converts a string into a numerical value. The used representation is accurate up to the first 3 chars.
	// NOTE: We do not use the database collation -> the numeric representation can be totally wrong!
	//      Example: Yelp	Checkins.business_id --> Business.business_id
	// Note: We read strings char by char, not by code point by code point -> emoticons are read as 2 chars.
	public static double getNumericValue(String stringValue) {
		double result = 0;

		for (int i = 0; i < stringValue.length(); i++) {
			result += ((int)stringValue.charAt(i) / Math.pow(BASE, i));
		}

		return result;
	}
}
