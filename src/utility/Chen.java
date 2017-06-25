package utility;

import main.Column;
import main.Table;
import org.simmetrics.metrics.StringMetrics;

import java.util.*;

// Source: Fast Foreign-Key Detection in Microsoft SQL Server PowerPivot for Excel
public class Chen {
	private static final org.simmetrics.StringMetric metric = StringMetrics.jaroWinkler();
	private MultiSet<String> columnTokenCount;
	private MultiSet<String> tableTokenCount;

	public Chen(List<Table> tables) {
		columnTokenCount = getColumnTokenCounts(tables);
		tableTokenCount = getTableTokenCounts(tables);
	}

	public double getChenSimilarity(Column fk, Column pk) {
		List<Float> similarities = new ArrayList<>();   // Maximal similarities for each token in FK
		List<Double> frequencies = new ArrayList<>();    // Occurrence frequency for each token in FK

		for (String token1 : fk.getTokenizedLowerCaseTrimmedName()) {
			// Get the maximum similarity for token1
			// Note: we do not use Hungarian algorithm
			float similarityMax = -1;
			String bestMatch = "";
			for (String token2 : pk.getTokenizedLowerCaseTrimmedName()) {
				float similarity = metric.compare(token1, token2);
				if (similarity>similarityMax) {
					similarityMax = similarity;
					bestMatch = token2;
				}
			}
			similarities.add(similarityMax);

			// Get the occurrence frequency for the best matching token
			frequencies.add(1.0*columnTokenCount.count(bestMatch)/columnTokenCount.totalCount());
		}

		double nominator = 0.0;
		for (int i = 0; i < similarities.size(); i++) {
			nominator += (similarities.get(i) * Math.log(1.0 / frequencies.get(i)));
		}

		double denominator = 0.0;
		for (int i = 0; i < similarities.size(); i++) {
			denominator += Math.log(1.0 / frequencies.get(i));
		}

		return nominator / denominator;
	}

	public double getTableChenSimilarity(List<String> fkTokens, List<String> pkTokens) {
		List<Float> similarities = new ArrayList<>();   // Maximal similarities for each token in FK
		List<Double> frequencies = new ArrayList<>();    // Occurrence frequency for each token in FK

		for (String token1 : fkTokens) {
			// Get the maximum similarity for token1
			float similarity = 0;
			for (String token2 : pkTokens) {
				similarity = Math.max(similarity, metric.compare(token1, token2));
			}
			similarities.add(similarity);

			// Get the occurrence frequency for token1
			for (String token : fkTokens) {
				frequencies.add((tableTokenCount.count(token)+1.0)/(tableTokenCount.totalCount()+1.0)); // We always add 1 to avoid zeros in the denominator
			}
		}

		double nominator = 0.0;
		for (int i = 0; i < similarities.size(); i++) {
			nominator += (similarities.get(i) * Math.log(1.0 / frequencies.get(i)));
		}

		double denominator = 0.0;
		for (int i = 0; i < similarities.size(); i++) {
			denominator += Math.log(1.0 / frequencies.get(i));
		}

		return nominator / denominator;
	}

	// Pre-calculates the fraction of columns whose name contains token i.
	private MultiSet<String> getColumnTokenCounts(List<Table> tables) {
		MultiSet<String> multiSet = new MultiSet<>();
		Set<String> deduplicated = new HashSet<>();

		for (Table table : tables) {
			for (Column column : table.getColumnList()) {
				deduplicated.clear();
				deduplicated.addAll(column.getTokenizedLowerCaseTrimmedName());
				for (String token : deduplicated) {
					multiSet.add(token);
				}
			}
		}

		return multiSet;
	}

	// Pre-calculates the fraction of tables whose name contains token i.
	private MultiSet<String> getTableTokenCounts(List<Table> tables) {
		MultiSet<String> multiSet = new MultiSet<>();
		Set<String> deduplicated = new HashSet<>();

		for (Table table : tables) {
			deduplicated.clear();
			deduplicated.addAll(table.getTokenizedLowerCaseTrimmedName());
			for (String token : deduplicated) {
				multiSet.add(token);
			}
		}

		return multiSet;
	}

}
