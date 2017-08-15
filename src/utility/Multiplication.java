package utility;

public class Multiplication {

  public static double[] elementWise(double[] vec1, double[] vec2) {
	  // Input parameter control
	  if (vec1.length != vec2.length) throw new RuntimeException("Vectors have different lengths: " + vec1.length + " and " + vec2.length);

	  double[] result = new double[vec1.length];
	  for (int i = 0; i < vec1.length; i++) {
		  result[i] = vec1[i] * vec2[i];
	  }

	  return result;
  }
}
