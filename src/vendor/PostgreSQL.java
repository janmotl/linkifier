package vendor;

import main.Column;
import main.Table;

import javax.annotation.Nullable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class PostgreSQL implements Vendor {

	private final static Logger LOGGER = Logger.getLogger(PostgreSQL.class.getName());

	// It could be a good idea to first update the statistics in the database. But we should calculate a sample
	// statistics only if there is no statistics at all (we do not want to overwrite e.g. statistics calculated
	// on all the data).
	public void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		String query = "SELECT relname as table_name" +
				"      , c.reltuples::bigint AS row_count " +
				"FROM   pg_class c " +
				"JOIN   pg_namespace n " +
				"ON n.oid = c.relnamespace " +
				"WHERE nspname ='" + schemaName + "' AND relkind = 'r'";

		Map<String, Table> map = new HashMap<>();
		for (Table table : tables) {
			map.put(table.getName(), table);
		}

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = map.get(rs.getString(1));
				if (table == null) continue; // The table is blacklisted -> skip it
				for (Column column : table.getColumnList()) {
					column.setEstimatedRowCount(rs.getInt(2));
				}
			}
		}
	}

	public void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		String query = "SELECT tablename as table_name" +
				"     , attname as column_name" +
				"     , null_frac" +
				"     , n_distinct" +
				"     , avg_width " +
				"     , coalesce((histogram_bounds::varchar::varchar[])[1], (most_common_vals::varchar::varchar[])[1]) as min_value " +
				"     , coalesce((histogram_bounds::varchar::varchar[])[array_length(histogram_bounds::varchar::varchar[], 1)], (most_common_vals::varchar::varchar[])[array_length(most_common_vals::varchar::varchar[], 1)]) as max_value " +
				"FROM pg_stats " +
				"WHERE schemaname ='" + schemaName + "'";

		Map<String, Table> tableMap = new HashMap<>();
		for (Table table : tables) {
			tableMap.put(table.getName(), table);
		}

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = tableMap.get(rs.getString(1));
				if (table == null) continue; // The table is blacklisted -> skip it
				@Nullable Column column = table.getColumn(rs.getString(2));
				if (column == null) {
					LOGGER.fine("The database returned a column name that was not previously observed with getColumns() JDBC call");
					continue;
				}
				column.setNullRatio(rs.getDouble(3));
				double distinctCount = rs.getDouble(4);
				if (distinctCount < 0) column.setUniqueRatio(-distinctCount);
				else if (column.getRowCount()==null || column.getRowCount()==0) column.setUniqueRatio(null);
				else column.setUniqueRatio(distinctCount / column.getRowCount());
				column.setWidthAvg(rs.getDouble(5));
				column.setTextMin(rs.getString(6));
				column.setTextMax(rs.getString(7));
			}
		}

		// Output quality control (if something turns sour, we want to know about that)
		QualityControl.qcNumericalValues(tables);
	}

}
