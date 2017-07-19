package export;

import main.CompoundRelationship;
import main.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

// Returns alter queries for PK and FK constraints.
// If a PK or FK is already in the database, the alter query is commented out (for QC purposes).
public class SQL {

	public static String getPkQuery(List<Table> tables, char leftQuote, char rightQuote) {
		String queries = "";
		for (Table table : tables) {
			String comment = table.getPk().isEmpty() ? "" : "-- ";
			queries = queries + comment + table.toQuery(leftQuote, rightQuote) + System.lineSeparator();
		}
		return queries;
	}

	public static String getFkQuery(List<CompoundRelationship> relationships, char leftQuote, char rightQuote) {
		String queries = "";

		for (CompoundRelationship relationship : relationships) {
			String comment = relationship.isForeignKey() ? "-- " : "";
			queries += comment + "ALTER TABLE " + leftQuote + relationship.getFkTable() + rightQuote + " ADD FOREIGN KEY (" + escapeList(relationship.getFkColumns(), leftQuote, rightQuote) + ") REFERENCES " + leftQuote + relationship.getPkTable() + rightQuote + "(" + escapeList(relationship.getPkColumns(), leftQuote, rightQuote) + ");" + System.lineSeparator();
		}

		return queries;
	}

	public static String getAllFkQuery(List<CompoundRelationship> relationships, char leftQuote, char rightQuote) {
		String queries = "";

		for (CompoundRelationship relationship : relationships) {
			queries += "ALTER TABLE " + leftQuote + relationship.getFkTable() + rightQuote + " ADD FOREIGN KEY (" + escapeList(relationship.getFkColumns(), leftQuote, rightQuote) + ") REFERENCES " + leftQuote + relationship.getPkTable() + rightQuote + "(" + escapeList(relationship.getPkColumns(), leftQuote, rightQuote) + ");" + System.lineSeparator();
		}

		return queries;
	}

	private static String escapeList(List<String> strings, char leftQuote, char rightQuote) {
		String result = "";
		for (String columnName : strings) {
			result += leftQuote + columnName + rightQuote + ", ";
		}
		result = result.substring(0,result.length() -2);
		return result;
	}



	public static void writeGraph(File file, List<Table> tables, List<CompoundRelationship> relationships, char leftQuote, char rightQuote) throws FileNotFoundException, UnsupportedEncodingException {

		// Rewrite the old file
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			// Print nodes
			writer.println(getPkQuery(tables, leftQuote, rightQuote));

			// Print edges
			writer.println(SQL.getFkQuery(relationships, leftQuote, rightQuote));
		}
	}
}
