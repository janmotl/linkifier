package utility;

public class Logistic {
	public static double classify(double[] x, double[] weights, double bias) {
		if (x.length != weights.length) throw new RuntimeException("Vectors have different lengths: " + x.length + " and " + weights.length);

		double logit = bias;
		for (int i = 0; i < weights.length; i++) {
			logit += weights[i] * x[i];
		}

		double result = sigmoid(logit);

		if (Double.isNaN(result) || Double.isInfinite(result)) throw new RuntimeException("The result is not a number: " + result);

		return result;
	}

	private static double sigmoid(double z) {
		return 1.0 / (1.0 + Math.exp(-z));
	}
}