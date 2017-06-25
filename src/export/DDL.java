package export;

import main.Column;
import main.CompoundRelationship;
import main.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;


// Export into SQL data definition language (DDL), which can be loaded with Oracle SQL Data Modeler.
// The export is using Oracle syntax (e.g. the quotes are "",...)
public class DDL {
	public static void writeGraph(File file, List<Table> tables, List<CompoundRelationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {

		// Rewrite the old file
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			// Print nodes
			for (Table table : tables) {
				writer.println(getNode(table));
			}

			// Print edges
			writer.println(SQL.getAllFkQuery(relationships, '"', '"'));
		}
	}

	public static void writeGraph(List<Table> tables, List<CompoundRelationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("graph.ddl");
		writeGraph(file, tables, relationships);
	}

	private static String getNode(Table table) {
		String result = "CREATE TABLE " + table.getName() + " ("+ System.lineSeparator();
		for (Column column : table.getColumnList()) {
			String pk = column.isPrimaryKey() ? " PRIMARY KEY" : "";
			result += "\t\"" + column.getName() + "\" " + column.getDataTypeName() + pk + "," + System.lineSeparator();
		}
		result = result.substring(0, result.length()-2);
		result += System.lineSeparator() + ");" + System.lineSeparator();
		return result;
	}
}
