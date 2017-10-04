package main;

import utility.MultiMap;

import java.util.*;
import java.util.logging.Logger;

public class OptimizationRelationship {

	private final static Logger LOGGER = Logger.getLogger(OptimizationRelationship.class.getName());
	private static final int MAX_FK_COUNT = 1000;   // With a higher limit the algorithm could choke
	public static double expectedCount; // Note: static non-final variables are difficult to test - not nice
	public static double lowerEstimate;
	public static double upperEstimate;


	// Returns the same amount of relationships as is at the input.
	// This is required for accuracy evaluation.
	public static int optimize(List<Relationship> relationships, List<Table> tables) {
		List<Relationship> selected = optimizeInternal(relationships, tables);

		for (Relationship relationship : selected) {
			for (Relationship relationship2 : relationships) {
				if (relationship.equals(relationship2)) {
					relationship2.setEstimatedFk(true);
					break;
				}
			}
		}

		Collections.sort(relationships);

		return selected.size();
	}

	// Input: Set of relationship candidates.
	// Output: Set of selected relationships.
	private static List<Relationship> optimizeInternal(List<Relationship> relationships, List<Table> tables) {
		getExpectedRelationshipCount(tables.size());
		PriorityQueue<Relationship> input = new PriorityQueue<>(relationships); // Sorted by probability in descending order
		Stack<Relationship> output = new Stack<>();    // LIFO
		Set<String> doppelgangers = new HashSet<>();   // Set of partially matched doppelgangers
		MultiMap compounds = new MultiMap();           // Set of partially matched compound FK constraints
		double oldLoss = Double.MAX_VALUE;
		double newLoss;
		boolean doppelgangersAreUnmatched;
		boolean oldDoppelgangersAreUnmatched = false;
		boolean compoundPksAreUnmatched;
		boolean oldCompoundPksAreUnmatched = false;
		Map<String, Table> tableMap = new HashMap<>();  // Map of tables
		for (Table table : tables) {
			tableMap.put(table.getName(), table);
		}

		while (!input.isEmpty() && output.size()< MAX_FK_COUNT) {   // The current implementation is too slow for more FK constraints...
			output.add(input.remove());
			if (isAcyclic(output) && satisfiesUnity(output)) {
				doppelgangersAreUnmatched = updateDoppelgangers(output.peek(), doppelgangers);
				compoundPksAreUnmatched = updateCompound(output.peek(), compounds, tableMap.get(output.peek().getPkTableName()));
				newLoss = getLoss(output, doppelgangers.size(), compounds.size());
				if (newLoss <= oldLoss) {
					oldLoss = newLoss;
					oldDoppelgangersAreUnmatched = doppelgangersAreUnmatched;
					oldCompoundPksAreUnmatched = compoundPksAreUnmatched;
				} else {
					if (oldDoppelgangersAreUnmatched || oldCompoundPksAreUnmatched) continue;
					output.pop();
					return output;
				}
			} else {
				output.pop();
			}
		}

		return output;
	}

	// If one of the doppelgangers is part of a FK constraint, the complementary doppelganger must be part of some
	// FK constraint as well. This prevents premature stopping of the algorithm.
	// Note: doppelgangers should refer the same PK. But this is not currently enforced.
	private static boolean updateDoppelgangers(Relationship relationship, Set<String> doppelgangers) {
		if (relationship.getFk().isDoppelganger()) {
			String name = relationship.getFkTableName() + "." + relationship.getFk().getName();
			if (doppelgangers.contains(name)) doppelgangers.remove(name);
			else doppelgangers.add(relationship.getFkTableName() + "." + relationship.getFk().getDoppelgangerName());
		}
		return !doppelgangers.isEmpty();
	}

	// If a FK in table t1 references compound PK, we have to add FKs from t1 to saturate the compound PK.
	// This prevents premature stopping of the algorithm.
	// The map logic: String "FKTable.PkTable" ---> List<String>(PKLongName)
	private static boolean updateCompound(Relationship relationship, MultiMap compounds, Table table) {
		String FkPk = relationship.getFkTableName() + " --> " + relationship.getPkTableName();
		String PkLongName = relationship.getPk().getLongName();

		// Add the PK into "compounds"
		compounds.put(FkPk, PkLongName);

		// If the (potentially) compound PK is now completed, remove all the hanging relationships from "compounds".
		// Otherwise return.
		for (Column column : table.getBestAttemptPk()) {
			if (!compounds.get(FkPk).contains(column.getLongName())) return true;  // Evidently, not all PKs are covered.
		}
		compounds.remove(FkPk);  // Ok, all the PKs from the FkTable are covered. Remove the FkPk.

		//
		return !compounds.isEmpty();
	}

	private static double getLoss(Stack<Relationship> selected, int unmatchedDoppelgangerCount, int unmatchedCompoundCount) {
		double sizeLoss = piecewise(selected.size());   // Penalize for having more than the expected FK constraint count
		double misclassificationLoss = 0.0;
		for (Relationship relationship : selected) {
			misclassificationLoss += (1.0 - relationship.getForeignKeyProbability());
		}
		LOGGER.fine(String.format(Locale.ROOT, " Size: %3d  loss: %7.3f  sizeLoss: %7.3f  misclassificationLoss: %5.3f  doppelCount: %d  compoundCount: %d  prob: %.3f  label: %d  name: %s" , selected.size(), sizeLoss+misclassificationLoss, sizeLoss, misclassificationLoss, unmatchedDoppelgangerCount, unmatchedCompoundCount, selected.peek().getForeignKeyProbability(), selected.peek().isForeignKey() ? 1 : 0, selected.peek()));

		return sizeLoss + misclassificationLoss;
	}

	// Motivate the optimizer to return the expected count of FK constraints.
	// The "relationshipCount" parameter is double to work properly with double estimates.
	public static double piecewise(double relationshipCount) {
		double accumulator = Math.min(lowerEstimate, relationshipCount)*(-0.9);
		relationshipCount -= Math.min(lowerEstimate, relationshipCount);
		accumulator += Math.min(expectedCount-lowerEstimate, relationshipCount)*(-0.7);
		relationshipCount -= Math.min(expectedCount-lowerEstimate, relationshipCount);
		accumulator += Math.min(upperEstimate-expectedCount, relationshipCount)*(-0.6);
		relationshipCount -= Math.min(upperEstimate-expectedCount, relationshipCount);
		accumulator += relationshipCount*(-0.1);

		return accumulator;
	}

	// The expected count of FK constraints is linear to column count in log-log space.
	private static void getExpectedRelationshipCount(int tableCount) {
		lowerEstimate = 0.2968 * Math.pow(tableCount, 1.2737);
		expectedCount = 0.5962 * Math.pow(tableCount, 1.2737);
		upperEstimate = 1.1978 * Math.pow(tableCount, 1.2737);

		LOGGER.info(String.format(Locale.ROOT, "Expected foreign key constraint count: %.1f (%.1f..%.1f)", expectedCount, lowerEstimate, upperEstimate));
	}

	// A FK may reference only one PK
	private static boolean satisfiesUnity(Stack<Relationship> selected) {
		Relationship candidate = selected.pop();
		for (Relationship relationship : selected) {
			if (relationship.getFkTableName().equals(candidate.getFkTableName()) && relationship.getFk().getName().equals(candidate.getFk().getName())) {
				selected.push(candidate);
				return false;
			}
		}
		selected.push(candidate);
		return true;
	}

	// No directed cycles are permitted
	public static boolean isAcyclic(Stack<Relationship> selected) {
		Relationship relationship = selected.pop();

		// Check self-reference
		if (relationship.getFk().equals(relationship.getPk())) {
			selected.push(relationship);
			return false;
		}

		// Depth First Search from the newly added PK to the newly added PK.
		// If the path does not exist and the graph did not contain any loop
		// before adding the FK constraint, there can't be a loop in the graph.
		boolean result = isAcyclic(selected, relationship, relationship.getFk());

		selected.push(relationship);
		return result;
	}

	// Very slow implementation.
	// There is a data type conversion Stack -> List. But it should be ok because stack is a linkedList.
	private static boolean isAcyclic(List<Relationship> unvisited, Relationship start, Column destinationFk) {
		for (Relationship relationship : unvisited) {
			if (relationship.getFk().equals(start.getPk())) {                   // Is a neighbour
				if (relationship.getPk().equals(destinationFk)) return false;   // The termination condition - we found a loop
				List<Relationship> unvisited2 = new LinkedList<>(unvisited);    // We do not want to change the original list
				unvisited2.remove(relationship);
				isAcyclic(unvisited2, relationship, destinationFk);
			}
		}

		return true;    // We traversed through all the relationships. But no (directed) path to destinationFk was found.
	}

}
