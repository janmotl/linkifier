package utility;

public class String2Num {

	// Converts a string into a numerical value. The used representation is accurate up to the first 8 chars.
	// NOTE: We do not use the database collation -> the numeric representation can be totally wrong!
	//      Example: Yelp	Checkins.business_id --> Business.business_id
	public static Double getNumericValue(String stringValue) {
		if (stringValue == null) return null;

		double result = 0;

		for (int i = 0; i < stringValue.length(); i++) {
			result += (Character.getNumericValue(stringValue.charAt(i)) / Math.pow(100,i));
		}

		return result;
	}
}
