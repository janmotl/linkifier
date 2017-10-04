package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TrainingRelationship {

	// Designed for MySQL.
	public static void main(String[] args) throws IOException {
		Logger.getLogger("").setLevel(Level.OFF);
		String query = "SELECT DISTINCT TABLE_SCHEMA FROM information_schema.columns"
				+ " WHERE TABLE_SCHEMA NOT IN ('information_schema', 'performance_schema', 'predictor_factory', 'mysql', 'meta', 'Phishing', 'fairytale', 'KRK', 'genes', 'Mesh', 'YelpDataset3', 'Seznam', 'TalkingData', 'lahman_2014', 'Hockey', 'Bench')"
				+ " AND TABLE_SCHEMA NOT LIKE 'arnaud_%' AND TABLE_SCHEMA NOT LIKE 'ctu_%' ";
//				+ " AND TABLE_SCHEMA  IN ('Yelp', 'mutagenesis', 'financial', 'tpcd', 'tpce')";
//				+ " AND TABLE_SCHEMA  IN ('AdventureWorks2014')";
//				+ " AND BINARY TABLE_SCHEMA  = 'mutagenesis'";


		// Quirky DBs:
		// genes does not have a PK on Genes table
		// KRK it contains only 1 table
		// Lahman - has strangely set up FK for hallOfFame
		// Mesh does not have a correct PK on element table
		// Accidents is missing a primary key in oseba table (the potential compound PK contains nulls)
		// Hockey is missing PKs
		// Talking data do not have correctly set up PK, FK
		// TubePricing contains duplicate records -> it is not possible to set primary keys
		// geneea is missing primary keys (duplicate records and nulls)
		// OpenML_2016 violates FK constraints in data_quality.implementation_id --> implementation.id and in evaluation.did --> task_type_inout.ttid
		// OpenML_2016 is missing a primary key in evaluation table (duplicate records)
		// YelpDataset3 does not have set up FK
		// Carcinogenesis: violate FK constraint -> use them to prove that metadata approach is useful
		// Toxicology: violate FK constraint -> use them to prove that metadata approach is useful

		try (Connection connection = Setting.getDataSource().getConnection();
		     Statement stmt = connection.createStatement();
			 ResultSet result = stmt.executeQuery(query)) {

			try (PrintWriter writer = new PrintWriter("estimateFK_proof.csv", "UTF-8")) {
				writer.println(Relationship.getHeader());

				while (result.next()) {
					String schemaName = result.getString(1);
					System.out.println(schemaName);

					// Get tables
					List<Table> tables = Schema.getPrimaryKeys(connection, schemaName, null);
					tables = Optimization.optimize(tables);

					// Get relations
					List<Relationship> relationships = Schema.getRelationships(connection, schemaName, schemaName, tables, true);

					// Print
					for (Relationship relationship : relationships) {
						writer.println(relationship.toFeature());
					}
					writer.flush();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
