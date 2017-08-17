package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Optimization {


	// If there are PK columns in the table, setPrimaryKey=database PK.
	// Otherwise, setPrimaryKey=predicted PK.
	public static List<Table> optimize(List<Table> tables) {
		for (Table table : tables) {
			List<Column> truePK = new ArrayList<>();
			for (Column column : table.getColumnList()) {
				if (column.isPrimaryKey()) truePK.add(column);
			}
			setEstimatedPk(table);
			setBestAttemptPk(table, truePK);
		}

		return tables;
	}

	// Set the single most likely PK as the PK.
	private static void setEstimatedPk(Table table) {
		if (table.getColumnList().isEmpty()) return;    // Nothing to optimize

		// Sort columns in descending order of getPkProbability()
		Collections.sort(table.getColumnList(), (a, b) -> a.getPkProbability() > b.getPkProbability() ? -1 : a.getPkProbability() == b.getPkProbability() ? 0 : 1 );

		// Set the single most likely column as PK
		Column maxCol = table.getColumnList().get(0);
		maxCol.setEstimatedPk(true);

		// If the most likely column has a doppelganger, add the doppelganger into the PK
		if (maxCol.isDoppelganger()) {
			table.getColumn(maxCol.getDoppelgangerName()).setEstimatedPk(true);
		}

		// If the top candidate is known to not be unique and no doppelganger was found, add the second candidate into the PK.
		// Note: The threshold for uniqueRatio was set arbitrarily (we work with estimates -> do not make it too tight).
		// Note: We ignore the estimated probabilities. That is not nice.
		// Note: We do not handle scenarios where the PK is composed of more than 2 columns.
		else if (maxCol.getUniqueRatio() != null && maxCol.getUniqueRatio() < 0.9 && table.getColumnList().size() >= 2) {
			table.getColumnList().get(1).setEstimatedPk(true);
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


}
