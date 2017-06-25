package utility;


import java.util.Arrays;

public class Otsu {


	public static void main(String[] args) {
		double[] histogram = {0,0,0,0,0.1,0.9,1,1,1,1};
		float[] result = otsuThreshold(histogram);
		System.out.println(Arrays.toString(result));
	}

	// See: http://www.labbookpages.co.uk/software/imgProc/otsuThreshold.html
	// We are using it to estimate the threshold between FK/non-FK constraints.
	// The method does not return a single threshold but a (pseudo) probability distribution.
	public static float[] otsuThreshold(double[] probabilities) {

		// Calculate equal-width histogram for values in range <0,1>
		int[] histogram = new int[256];
		for (double probability : probabilities) {
			int h = (int) Math.ceil(probability*255);
			histogram[h]++;
		}

		int total = probabilities.length;   // Total number of probabilities

		float sum = 0;
		for (int i = 0; i < 256; i++) sum += i * histogram[i];

		float sumB = 0;
		int wB = 0;
		int wF = 0;

		float[] varBetween = new float[256];

		for (int i = 0; i < 256; i++) {
			wB += histogram[i];             // Weight Background
			if (wB == 0) continue;

			wF = total - wB;                // Weight Foreground
			if (wF == 0) break;

			sumB += (float) (i * histogram[i]);

			float mB = sumB / wB;           // Mean Background
			float mF = (sum - sumB) / wF;   // Mean Foreground

			varBetween[i] = (float) wB * (float) wF * (mB - mF) * (mB - mF); // Between Class Variance


		}

		// Normalize double[] varBetween to have sum=1 (to turn it into a probability).
		double sumNorm = 0.0;
		for (int i = 0; i < varBetween.length; i++) {
			sumNorm += varBetween[i];
		}

		for (int i = 0; i < varBetween.length; i++) {
			varBetween[i] /= sumNorm;
		}

		return varBetween;



	}


}
