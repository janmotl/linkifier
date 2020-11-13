package vendor;

import main.Relationship;
import main.Table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Logger;

// Returns statistics.
// Since database statistics cannot be efficiently collected agnostic way, we have an implementation for each database
// vendor. The implementation is expected to only fill in known stats - we do not expect invocation of statistics
// calculation.
public interface Vendor {
	final static Logger LOGGER = Logger.getLogger(Vendor.class.getName());

	void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException;

	void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException;

	// Are all FK values present in pkTableName.pk?
	default void validateFkConstraint(Relationship relationship, Connection connection, char leftQuote, char rightQuote, int timeOut) throws SQLException {
		relationship.setSatisfiesFKConstraint("true");

		String query =
				"select 1 " +
				"from " + leftQuote + relationship.getSchema() + rightQuote + "." + leftQuote + relationship.getFkTableName() + rightQuote + " t1 " +
				"left join " + leftQuote + relationship.getSchema() + rightQuote + "." + leftQuote + relationship.getPkTableName() + rightQuote + " t2 " +
				"on t1." + leftQuote + relationship.getFk().getName() + rightQuote + " = t2."  + leftQuote + relationship.getPk().getName() + rightQuote + " " +
				"where t2." +  leftQuote + relationship.getPk().getName() + rightQuote + " is null " +
				"and t1." + leftQuote + relationship.getFk().getName() + rightQuote + " is not null " +
				"limit 1";

		try (Statement stmt = connection.createStatement()) {
			stmt.setQueryTimeout(timeOut);
			try (ResultSet rs = stmt.executeQuery(query)) {
				if (rs.next()) relationship.setSatisfiesFKConstraint("false");
			} catch (SQLException e) {
				LOGGER.fine(e.getMessage());
				relationship.setSatisfiesFKConstraint("timeout");
			}
		}
	}
}
