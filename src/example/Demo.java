package example;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import export.SQL;
import main.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

public class Demo {

	// Example of prediction of primary keys (PK) and foreign key constraints (FK) in the demo database.
	public static void main(String[] args) {

		// Define connection to the server
		MysqlDataSource dataSource = new MysqlDataSource(); // If you are not using MySQL, use different DataSource
		dataSource.setUrl("jdbc:mysql://relational.fit.cvut.cz"); // Public read-only database for testing
		dataSource.setUser("guest");
		dataSource.setPassword("relational");

		// Which database to analyse
		String databaseName = "mutagenesis"; // Another database to try: financial
		String schemaName = ""; // Always empty for MySQL databases

		// Connect to the database
		try (Connection connection = dataSource.getConnection()){

			// Estimate the PK and FK
			List<Table> tables = Schema.getPrimaryKeys(connection, databaseName, schemaName, Pattern.compile(""));
			Optimization.optimize(tables);
			List<Relationship> relationships = Schema.getRelationships(connection, databaseName, schemaName, tables, true, false);
			OptimizationRelationship.optimize(relationships, tables);
			List<CompoundRelationship> compoundRelationships = CompoundRelationship.buildFrom(relationships);

			// Print the estimated PK and FK with the defined quote characters
			System.out.println("Estimated primary keys follow: ");
			System.out.println(SQL.getPkQuery(tables, '`', '`'));
			System.out.println("Estimated foreign key constraints follow: ");
			System.out.println(SQL.getFkQuery(compoundRelationships, '`', '`'));
		} catch (SQLException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
