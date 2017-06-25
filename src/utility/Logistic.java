package utility;

public class Logistic {
	public static double classify(double[] x, double[] weights, double bias) {
		double logit = bias;
		for (int i = 0; i < weights.length; i++) {
			logit += weights[i] * x[i];
		}

//		if (Double.isNaN(logit)) {
//			System.out.println("BAD");
//		}


		return sigmoid(logit);
	}

	private static double sigmoid(double z) {
		return 1.0 / (1.0 + Math.exp(-z));
	}
}