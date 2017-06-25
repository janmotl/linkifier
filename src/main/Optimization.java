package main;

import java.util.ArrayList;
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
		double maximum = 0.0;
		Column maxCol = null;
		for (Column column : table.getColumnList()) {
			if (column.getPkProbability() > maximum) {
				maximum = column.getPkProbability();
				maxCol = column;
			}
		}
		if (maxCol!=null) maxCol.setEstimatedPk(true);

		// If the most likely column has a doppelganger, add the doppelganger in to the PK
		if (maxCol!=null && maxCol.isDoppelganger()) {
			table.getColumn(maxCol.getDoppelgangerName()).setEstimatedPk(true);
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
