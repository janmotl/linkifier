package export;

import main.Relationship;
import main.Setting;
import main.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class CSV {

	public static void writePk(File file, List<Table> tables) throws FileNotFoundException, UnsupportedEncodingException {
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			writer.println(Table.getHeader() + Setting.CSV_SEPARATOR + "primaryKeyProbability");
			for (Table table : tables) {
				writer.print(table.toProbability());
			}
		}
	}

	public static void writeFk(File file, List<Relationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			writer.println(Relationship.getHeader() + Setting.CSV_SEPARATOR + "foreignKeyConstraintProbability");
			for (Relationship relationship : relationships) {
				writer.println(relationship.toProbability());
			}
		}
	}

	public static void writePk(List<Table> tables) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("probability_pk.csv");
		writePk(file, tables);
	}

	public static void writeFk(List<Relationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("probability_fk.csv");
		writeFk(file, relationships);
	}
}
