package vendor;

import main.Column;
import main.Table;
import utility.Histogram;

import javax.annotation.Nullable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class MySQL implements Vendor {

	private final static Logger LOGGER = Logger.getLogger(MySQL.class.getName());

	public void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {
		// INFORMATION_SCHEMA.TABLES table provides a rough estimate, which is, nevertheless, always up to date.
		// But we prefer to use MYSQL.TABLE_STATS table, which provides the actual value,
		// as measured at time of statistics collection. Hence, the estimate can be terribly outdated.
		// But we still prefer MYSQL.TABLE_STATS to INFORMATION_SCHEMA.TABLES because it is in sync with MYSQL.COLUMN_STATS
		// and that is critical for features, where data from MYSQL.COLUMN_STATS and MYSQL.TABLE_STATS are combined.

		// Note that MYSQL.TABLE_STATS (and MYSQL.COLUMNM_STATS) was added to MariaDB in version 10.0.1:
		//	https://mariadb.com/kb/en/library/mysqlindex_stats-table/
		// And in MySQL version 8.0 the table is hidden:
		//	http://datacharmer.blogspot.cz/2016/09/showing-hidden-tables-in-mysql-8-data.html
		// Hence, we provide fallback to INFORMATION_SCHEMA.TABLES if necessary (better something than nothing).
		Map<String, Table> tableMap = new HashMap<>();
		for (Table table : tables) {
			tableMap.put(table.getName(), table);
		}

		// Try MYSQL.TABLE_STATS first. But it may crash (e.g. the table does not exist) or the resultSet may not
		// contain the desired record (e.g. stats was not calculated).
		try {
			useTableStats(databaseName, connection, tableMap);
		} catch(SQLException e) {
			LOGGER.fine("Attempt to read from MYSQL.TABLE_STATS failed:" + e.getMessage());
		}

		// Fill in the missing info with INFORMATION_SCHEMA.TABLES.
		useTables(databaseName, connection, tableMap);
	}

	private void useTableStats(String databaseName, Connection connection, Map<String, Table> map) throws SQLException {
		String query = "select table_name, cardinality from mysql.table_stats where db_name = '" + databaseName + "'";

		try (Statement stmt = connection.createStatement();
			 ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = map.get(rs.getString(1));
				if (table == null) continue; // The table is blacklisted in Linkifier by the regex -> skip it
				for (Column column : table.getColumnList()) {
					column.setEstimatedRowCount(rs.getLong(2));
				}
			}
		}
	}

	// Fill in as much information as possible without overwriting anything
	private void useTables(String databaseName, Connection connection, Map<String, Table> map) throws SQLException {
		String query = "select TABLE_NAME, TABLE_ROWS from INFORMATION_SCHEMA.TABLES where TABLE_SCHEMA = '" + databaseName + "' AND TABLE_TYPE = 'BASE TABLE'";

		try (Statement stmt = connection.createStatement();
			 ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Table table = map.get(rs.getString(1));
				if (table == null) continue; // The table is blacklisted in Linkifier by the regex -> skip it
				for (Column column : table.getColumnList()) {
					if (column.getRowCount()==null || column.getRowCount()==0) column.setEstimatedRowCount(rs.getLong(2));
				}
			}
		}
	}

	public void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

		String query = "SELECT table_name " +
				", column_name " +
				", nulls_ratio " +
				", avg_frequency " +
				", avg_length " +
				", min_value " +
				", max_value " +
				", decode_histogram(hist_type,histogram) " +
				"FROM mysql.column_stats " +
				"WHERE db_name='" + databaseName + "'";

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
				column.setUniqueRatio(1.0 / rs.getDouble(4));
				if (column.getUniqueRatio() != null && column.getUniqueRatio().isInfinite()) column.setUniqueRatio(null); // We can get infinity if the column contains only nulls...
				// Note: We should store distinctCount, not nullRatio, because everywhere in the code we use
				// distinctCountIn, not nullRatio. Nevertheless, the code we assumes that distinctRatio is over all
				// rows in the table, no matter whether they contain null or not.
				// uniqueRatioForWholeColumn = uniqueRatioForNonNull * (1-nullRatio)
				if (column.getNullRatio() != null) column.setUniqueRatio(column.getUniqueRatio() * (1-column.getNullRatio()));
				column.setWidthAvg(rs.getDouble(5));
				column.setTextMin(rs.getString(6));
				column.setTextMax(rs.getString(7));
				String rawHistogram = (rs.getString(8));
				try {
					column.setHistogramBounds(Histogram.rel2abs(parse(rawHistogram), Double.valueOf(column.getTextMin()), Double.valueOf(column.getTextMax())));
				} catch (Exception ignored) {} // The table can be empty, the statistics may not be calculated,...
			}
		}

		// Output quality control (if something turns sour, we want to know about that)
		QualityControl.qcNumericalValues(tables);
	}

	// Parse array into doubles
	private static double[] parse(String histogram) {
		String[] strings = histogram.split(",");
		double[] doubles = new double[strings.length];
		for (int i = 0; i < strings.length; i++) {
			doubles[i] = Double.valueOf(strings[i]);
		}
		return doubles;
	}
}