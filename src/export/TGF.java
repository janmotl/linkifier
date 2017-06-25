package export;

import main.CompoundRelationship;
import main.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// Export into .tgf (trivial graph format, which can be opened with yEd and other graph layouting applications).
// Note that the edges are directed -> you can change their appearance to arrows.
// The format is described at:
//  https://en.wikipedia.org/wiki/Trivial_Graph_Format
public class TGF {
	public static void writeGraph(File file, List<Table> tables, List<CompoundRelationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {

		// Create a unique integer identifier for each table
		SortedMap<String, Integer> tableMap = new TreeMap<>();
		for (int i = 0; i < tables.size(); i++) {
			tableMap.put(tables.get(i).getName(), i+1);
		}

		// Rewrite the old file
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			// Print nodes
			for (Map.Entry<String, Integer> entry : tableMap.entrySet()) {
				writer.println(entry.getValue() + " " + entry.getKey());
			}

			// Print separator
			writer.println("#");

			// Print edges
			for (CompoundRelationship relationship : relationships) {
				writer.println(tableMap.get(relationship.getFkTable()) + " " + tableMap.get(relationship.getPkTable()));
			}
		}
	}

	public static void writeGraph(List<Table> tables, List<CompoundRelationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("graph.tgf");
		writeGraph(file, tables, relationships);
	}
}
