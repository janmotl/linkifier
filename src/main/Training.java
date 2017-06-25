package main;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Training {

	// Designed for MySQL.
	public static void main(String[] args) {
		Logger.getLogger("").setLevel(Level.OFF);
		String query = "SELECT DISTINCT TABLE_SCHEMA FROM information_schema.columns"
				+ " WHERE TABLE_SCHEMA NOT IN ('mutagenesisTest', 'information_schema', 'performance_schema', 'predictor_factory', 'mysql', 'meta', 'Phishing', 'fairytale', 'KRK', 'genes', 'Mesh', 'YelpDataset3', 'Seznam', 'TalkingData', 'lahman_2014')"
				+ " AND TABLE_SCHEMA NOT LIKE 'arnaud_%' AND TABLE_SCHEMA NOT LIKE 'ctu_%' ";
//				+ " and TABLE_SCHEMA  in ('mutagenesis', 'financial', 'tpcd', 'tpce')";
//				+ " and BINARY TABLE_SCHEMA  = 'FINANCIAL'";

		try (Connection connection = Setting.getDataSource().getConnection();
		     Statement stmt = connection.createStatement();
		     ResultSet result = stmt.executeQuery(query)) {
			
			try (PrintWriter writer = new PrintWriter("estimatePK_proof.csv", "UTF-8")) {
				writer.println(Table.getHeader());
				while (result.next()) {
					String schemaName = result.getString(1);
					System.out.println(schemaName);
					List<Table> tables = Schema.getPrimaryKeys(connection, schemaName, null);
//					tables = Schema.getExpensiveFeatures(tables, connection, schemaName);

					for (Table table : tables) {
						writer.print(table.toFeature());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
