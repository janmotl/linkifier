package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Converts a set of simple foreign key constraints to compound foreign key constraints.
public class CompoundRelationship {

	private final List<Relationship> relationships;
	private final List<String> fkColumns = new ArrayList<>();
	private final List<String> pkColumns = new ArrayList<>();
	private final String fkTable;
	private final String pkTable;

	private CompoundRelationship(List<Relationship> relationships) {
		this.relationships = relationships;
		fkTable = relationships.get(0).getFkTableName();
		pkTable = relationships.get(0).getPkTableName();
		relationships.forEach(w -> fkColumns.add(w.getFk().getName()));
		relationships.forEach(w -> pkColumns.add(w.getPk().getName()));
	}

	private CompoundRelationship(Relationship relationship) {
		relationships = new ArrayList<>();
		relationships.add(relationship);
		fkTable = relationship.getFkTableName();
		pkTable = relationship.getPkTableName();
		fkColumns.add(relationship.getFk().getName());
		pkColumns.add(relationship.getPk().getName());
	}

	public static List<CompoundRelationship> buildFrom(List<Relationship> relationships) {
		List<Relationship> compound = new ArrayList<>();
		List<CompoundRelationship> result = new ArrayList<>();

		// If the PK is compound, build a compound FK constraint. Otherwise build a simple FK constraint.
		for (Relationship relationship : relationships) {
			if (relationship.isEstimatedFk()) {
				if (relationship.getPk().getTable().getBestAttemptPk().size() > 1) {
					compound.add(relationship);
				} else {
					result.add(new CompoundRelationship(relationship));
				}
			}
		}
		result.addAll(getCompound(compound));

		return result;
	}


	private static List<CompoundRelationship> getCompound(List<Relationship> relationships) {
		List<CompoundRelationship> result = new ArrayList<>();

		// Sort by FK and PK table names
		relationships.sort(Comparator.comparing(Relationship::getPkTableName).thenComparing(Relationship::getFkTableName));

		// Loop
		String previousPkTable = "";
		String previousFkTable = "";
		List<Relationship> relationshipList = new ArrayList<>();
		for (Relationship relationship : relationships) {
			if (!previousFkTable.isEmpty() && !(relationship.getFkTableName().equals(previousFkTable) && relationship.getPkTableName().equals(previousPkTable))) {
				result.add(new CompoundRelationship(relationshipList));
				relationshipList.clear();
			}

			// Update
			relationshipList.add(relationship);
			previousPkTable = relationship.getPkTableName();
			previousFkTable = relationship.getFkTableName();
		}

		// Add the last item
		if (!previousFkTable.isEmpty()) {
			result.add(new CompoundRelationship(relationshipList));
		}

		return result;
	}

	public boolean isEstimatedFk() {
		return relationships.stream().allMatch(w -> w.isEstimatedFk());
	}

	public boolean isForeignKey() {
		return relationships.stream().allMatch(w -> w.isForeignKey());
	}


	////// Boring getters
	public String getFkTable() {
		return fkTable;
	}

	public String getPkTable() {
		return pkTable;
	}

	public List<String> getFkColumns() {
		return fkColumns;
	}

	public List<String> getPkColumns() {
		return pkColumns;
	}
}
