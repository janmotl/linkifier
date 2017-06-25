package main;

import java.util.List;

public class Accuracy {

	public static double getPkPrecision(List<Table> tables) {
		double tp = 0.0;
		double fp = 0.0;

		for (Table table : tables) {
			for (Column column : table.getColumnList()) {
				if (column.isPrimaryKey() && column.isEstimatedPk()) tp++;
				if (!column.isPrimaryKey() && column.isEstimatedPk()) fp++;
			}
		}

		return tp/(tp+fp);
	}

	public static double getPkRecall(List<Table> tables) {
		double tp = 0.0;
		double fn = 0.0;

		for (Table table : tables) {
			for (Column column : table.getColumnList()) {
				if (column.isPrimaryKey() && column.isEstimatedPk()) tp++;
				if (column.isPrimaryKey() && !column.isEstimatedPk()) fn++;
			}
		}

		return tp/(tp+fn);
	}

	public static double getFkPrecision(List<Relationship> relationships) {
		double tp = 0.0;
		double fp = 0.0;

		for (Relationship relationship : relationships) {
			if (relationship.isForeignKey() && relationship.isEstimatedFk()) tp++;
			if (!relationship.isForeignKey() && relationship.isEstimatedFk()) fp++;
		}

		return tp/(tp+fp);
	}

	public static double getFkRecall(List<Relationship> relationships) {
		double tp = 0.0;
		double fn = 0.0;

		for (Relationship relationship : relationships) {
			if (relationship.isForeignKey() && relationship.isEstimatedFk()) tp++;
			if (relationship.isForeignKey() && !relationship.isEstimatedFk()) fn++;
		}

		return tp/(tp+fn);
	}
}
