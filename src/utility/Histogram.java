package utility;

import javax.annotation.Nullable;
import java.util.*;

public class Histogram {

	// Get generalized Jaccard similarity between two equal-height histograms.
	//
	@Nullable public static Double jaccard(@Nullable double[] hist_1, @Nullable double[] hist_2) {
		// Input parameter validation
		if (hist_1 == null || hist_2 == null) return null;

		// Bin height calculation. We assume that the total area of the histogram=1. Repeated values are permitted.
		List<Double> counts_1 = getHeight(hist_1);
		List<Double> counts_2 = getHeight(hist_2);

		// Histogram with breaks from both histograms
		SortedSet<Double> temp = new TreeSet<>();
		for (double v : hist_1) {
			temp.add(v);
		}
		for (double v : hist_2) {
			temp.add(v);
		}
		List<Double> hist_extended  = new ArrayList<>(temp);

		// Computing of histogram heights for both histograms
		List<Double> counts_1_extended = getExtendedHeight(hist_1, counts_1, hist_extended);
		List<Double> counts_2_extended = getExtendedHeight(hist_2, counts_2, hist_extended);

		// Computing of min and max
		// NOTE: We cheat an convert erroneously negative values to zero!
		return Math.max(0, getJaccard(counts_1_extended, counts_2_extended, hist_extended));
	}

	// Converts relatively defined histogram (e.g. as used by MariaDB) to absolutely defined histogram
	// (e.g. as used by PostgreSQL).
	public static double[] rel2abs(double[] hist, double minValue, double maxValue) {
		double MINIMAL_INCREMENT = 1.0/255; // hist[] may contain zeros due to low precision -> regularization
		double MAXIMAL_INCREMENT = 1-MINIMAL_INCREMENT*(hist.length-1);
		double diff = maxValue - minValue;
		double[] edges = new double[hist.length + 1];

		edges[0] = minValue;
		for (int i = 1; i < hist.length; i++) {
			edges[i] = edges[i - 1] + diff * Math.min(Math.max(hist[i - 1], MINIMAL_INCREMENT), MAXIMAL_INCREMENT);
		}
		edges[hist.length] = maxValue; // To avoid rounding problems, we use the true maxValue

		return edges;
	}


	// Subroutines
	// Note: If we wanted to utilize this feature, it would be better to move from List<Double> to double[]
	// due to memory and runtime savings.
	private static List<Double> getHeight(double[] hist) {
		int multiplier = 1;                         // To deal with duplicate values in the histogram - tall bins
		List<Double> height = new ArrayList<>();    // Output

		for (int i = 0; i < hist.length - 1; i++) {
			double diff = (hist[i + 1] - hist[i]);  // Bin width
			if (diff == 0) {
				multiplier++;                       // The bin height is incremented
			} else {
				if (!height.isEmpty()) {
					height.set(height.size() - 1, height.get(height.size() - 1) * multiplier); // Adjust previous bin height
					multiplier = 1;
				}
				height.add(1.0 / (hist.length - 1) / diff);    // We assume uniform distribution in bins
			}
		}

		height.add(0.0);
		return height;
	}

	private static List<Double> getExtendedHeight(double[] hist, List<Double> counts, List<Double> hist_extended) {
		List<Double> counts_extended = new ArrayList<>();
		int hist_index = 0;

		for (int i = 0; i < hist_extended.size()-1; i++) {
			double bound = hist_extended.get(i);
			if (hist_index >= hist.length || bound < hist[hist_index]) {
				if (hist_index == 0) counts_extended.add(0.0);
				else counts_extended.add(counts_extended.get(counts_extended.size() - 1));
			} else {
				counts_extended.add(counts.get(hist_index));
				hist_index += 1;
			}
		}

		return counts_extended;
	}

	private static double getJaccard(List<Double> counts_1_extended, List<Double> counts_2_extended, List<Double> hist_extended) {
		double min_sum = 0;
		double max_sum = 0;

		for (int i = 0; i < counts_1_extended.size(); i++) {
			min_sum += Math.min(counts_1_extended.get(i), counts_2_extended.get(i)) * (hist_extended.get(i+1) - hist_extended.get(i));
			max_sum += Math.max(counts_1_extended.get(i), counts_2_extended.get(i)) * (hist_extended.get(i+1) - hist_extended.get(i));
		}

		return min_sum / max_sum;
	}

}
