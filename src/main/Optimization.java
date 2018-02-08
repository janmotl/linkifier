package main;

import java.util.ArrayList;
import java.util.List;

public class Optimization {


	// If there are PK columns in the table, setPrimaryKey=database PK.
	// Otherwise, setPrimaryKey=predicted PK.
	public static void optimize(List<Table> tables) {
		for (Table table : tables) {
			List<Column> truePK = new ArrayList<>();
			for (Column column : table.getColumnList()) {
				if (column.isPrimaryKey()) truePK.add(column);
			}
			setEstimatedPk(table);
			setBestAttemptPk(table, truePK);
		}
	}

	// Set the single most likely PK as the PK.
	private static void setEstimatedPk(Table table) {
		if (table.getColumnList().isEmpty()) return;    // Nothing to optimize

		// Sort columns in descending order of getPkProbability()
		table.getColumnList().sort((a, b) -> a.getPkProbability() > b.getPkProbability() ? -1 : a.getPkProbability() == b.getPkProbability() ? 0 : 1);

		// Set the single most likely column as PK
		Column maxCol = table.getColumnList().get(0);
		maxCol.setEstimatedPk(true);

		// If the most likely column has a doppelganger, add the doppelganger into the PK
		if (maxCol.isDoppelganger()) {
			table.getColumn(maxCol.getDoppelgangerName()).setEstimatedPk(true);
		}

		// Else if the top candidate is known to not be unique, keep adding the candidate into the PK, until
		// we get a combination, which in theory could be unique.
		// Note: We ignore the absolute values of estimated probabilities (we look only at the ranking). That is not nice.
		else {
			keepAddingAttributes(table);
		}

	}

	// If the database says that the table has a PK, trust the database. Otherwise estimate the PK for the table.
	private static void setBestAttemptPk(Table table, List<Column> truePK) {
		if (truePK.isEmpty()) {
			for (Column column : table.getColumnList()) {
				if (column.isEstimatedPk()) column.setBestAttemptPk(true);
			}
		} else {
			for (Column column : truePK) {
				column.setBestAttemptPk(true);
			}
		}
	}

	// The optimistic estimate of the unique values in the PK should be ≥ than the row count.
	private static void keepAddingAttributes(Table table) {
		double optimisticUniqueEstimate = 1;
		double rowCount = table.getColumnList().get(0).getRowCount();

		for (Column column : table.getColumnList()) {
			if (column.getUniqueRatio() != null) {
				column.setEstimatedPk(true);
				optimisticUniqueEstimate = optimisticUniqueEstimate * column.getUniqueRatio() * rowCount;
				if (optimisticUniqueEstimate/rowCount > 0.995) {    // We work with estimates -> we are biased toward smaller count of columns in the PK. The threshold is based on tpcc database.
					return;
				}
			}
		}
	}

}
