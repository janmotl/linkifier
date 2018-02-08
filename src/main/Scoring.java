package main;

import export.*;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Scoring {
	private final static Logger LOGGER = Logger.getLogger(Scoring.class.getName());

	public static void main(String[] arg) throws IOException {
		LogManager.getLogManager().readConfiguration(Scoring.class.getResourceAsStream("/logging.properties"));
		long startTime = System.nanoTime();

		// Parameters
		String databaseName = "UW_std";		// For MySQL set only databaseName and set schemaName="".
		String schemaName = "";                         // For other databases, set both databaseName and schemaName.

		// Collect metadata
		String identifierQuote = "\"\"";
		List<Table> tables = new ArrayList<>();
		List<Relationship> relationships = new ArrayList<>();
		try (Connection connection = Setting.getDataSource().getConnection()) {
			LOGGER.info("Successfully connected to the database.");
			identifierQuote = connection.getMetaData().getIdentifierQuoteString();
			tables = Schema.getPrimaryKeys(connection, databaseName, schemaName, Pattern.compile(""));
			Optimization.optimize(tables);
			relationships = Schema.getRelationships(connection, databaseName, schemaName, tables, false);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Optimize FK
		int fkCount = OptimizationRelationship.optimize(relationships, tables);
		LOGGER.info("Foreign key constraint count: " + fkCount + System.lineSeparator());


		// Export the result to the console & CSV files
		char leftQuote = identifierQuote.charAt(0);
		char rightQuote = identifierQuote.charAt(0);
		if (identifierQuote.length()>1) {
			rightQuote = identifierQuote.charAt(1);
		}
		List<CompoundRelationship> compoundRelationships = CompoundRelationship.buildFrom(relationships);

		System.out.println("Estimated primary keys follow: ");
		System.out.println(SQL.getPkQuery(tables, leftQuote, rightQuote));
		System.out.println("Estimated foreign key constraints follow: ");
		System.out.println(SQL.getFkQuery(compoundRelationships, leftQuote, rightQuote));

		CSV.writePk(tables);
		CSV.writeFk(relationships);
		TGF.writeGraph(tables, compoundRelationships);
		DDL.writeGraph(tables, compoundRelationships);
		GraphML.writeGraph(tables, relationships);

		// Bye!
		LOGGER.info("The primary key identification precision is: " + Accuracy.getPkPrecision(tables) + " (if the PKs are set correctly in the database, we expect a value >0.93)");
		LOGGER.info("The primary key identification recall is: " + Accuracy.getPkRecall(tables) + " (if the PKs are set correctly in the database, we expect a value >0.94)");
		LOGGER.info("The foreign key constraint identification precision for the top " + relationships.size() + " candidates is: " + Accuracy.getFkPrecision(relationships) + " (if the FK constraints are set correctly in the database, we expect a value >0.78)");
		LOGGER.info("The foreign key constraint identification recall for the top " + relationships.size() + " candidates is: " + Accuracy.getFkRecall(relationships) + " (if the FK constraints are set correctly in the database, we expect a value >0.79)");

		long elapsedTime = System.nanoTime() - startTime;
		LOGGER.info("The processing took " + TimeUnit.NANOSECONDS.toMillis(elapsedTime) + " ms.");
	}
}
