package main;

import java.util.ArrayList;
import java.util.List;

public class Doppelganger {

	// Identify doppelganger columns like {atom_id1 & atom_id2} or {atom_id & atom_id2} or {atomIdA & atomIdB} or {atom1_id & atom2_id} or {atom & atom_2}.
	// We do not identify columns like {A1, A2, A3, A4,..., A12} as doppelgangers as they are likely a part of an un-normalized table.
	// And as such they are not part of a foreign key constraint.
	// If too many columns in the table are doppelgangers, we should return false.
	public static boolean isDoppelganger(Table table, Column column) {
		String a = column.getName();
		boolean hasDoppelganger;
		List<Column> candidates = new ArrayList<>();

		for (Column column2 : table.getColumnList()) {
			String b = column2.getName();
			boolean diffContainsGood = false;
			boolean diffContainsBad = false;
			int diffCount = 0;
			int diffAscii = 0;
			int numberCount = 0;
			int lengthDifference = Math.abs(a.length() - b.length());
			int length = Math.min(a.length(), b.length());

			// Collect statistics
			for (int i = 0; i < length; i++) {
				numberCount += (Character.isDigit(a.charAt(i)) ? 1:0);
				if (a.charAt(i) != b.charAt(i)) {
					diffCount++;
					diffAscii += Math.abs(a.charAt(i)-b.charAt(i));
					diffContainsGood = (a.charAt(i) == 'b' || a.charAt(i) == 'B' || a.charAt(i) == '2' || b.charAt(i) == 'b' || b.charAt(i) == 'B' || b.charAt(i) == '2');
					diffContainsBad = (a.charAt(i) == 'c' || a.charAt(i) == 'C' || a.charAt(i) == '3' || b.charAt(i) == 'c' || b.charAt(i) == 'C' || b.charAt(i) == '3');
				}
			}

			// It is likely a column of a denormalized table. We can immediately terminate the search.
			if (numberCount>1) return false;
			if (lengthDifference == 0 && diffCount == 1 && diffContainsBad) return false;

			// It could be a doppelganger.
			if (lengthDifference == 0 && diffCount == 1 && diffAscii == 1 && diffContainsGood) candidates.add(column2);
			if (lengthDifference == 1 && diffCount == 0) {
				if (a.length() > b.length()) {
					hasDoppelganger = (a.charAt(length) == 'b' || a.charAt(length) == 'B' || a.charAt(length) == '2');
				} else {
					hasDoppelganger = (b.charAt(length) == 'b' || b.charAt(length) == 'B' || b.charAt(length) == '2');
				}
				if (hasDoppelganger) candidates.add(column2);
			}
			if (lengthDifference == 2 && diffCount == 0) {
				hasDoppelganger = false;
				if (a.length() > b.length() && a.charAt(length)=='_') {
					hasDoppelganger = (a.charAt(length+1) == 'b' || a.charAt(length+1) == 'B' || a.charAt(length+1) == '2');
				} else if (b.length() > a.length() && b.charAt(length)=='_') {
					hasDoppelganger = (b.charAt(length+1) == 'b' || b.charAt(length+1) == 'B' || b.charAt(length+1) == '2');
				}
				if (hasDoppelganger) candidates.add(column2);
			}
		}

		if (candidates.size()==1) column.setDoppelgangerName(candidates.get(0).getName());

		// Asses the count of the candidates
		return (candidates.size()==1);
	}

}
