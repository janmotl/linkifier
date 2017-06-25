package vendor;

import main.Column;
import main.Table;
import utility.Histogram;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySQL implements Vendor {

	public void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {
		// This provides a rough estimate, which is, nevertheless, always up to date.
		// String query = "select TABLE_NAME, TABLE_ROWS from INFORMATION_SCHEMA.TABLES where TABLE_SCHEMA = '" + schemaName + "' AND TABLE_TYPE = 'BASE TABLE'";

		// This provides the actual value, as measured at time of statistics collection.
		// Hence, the estimate can be terribly outdated.
		// Nevertheless, we prefer this (possibly outdated) data source because it is in sync with mysql.column_stats
		// and that is critical for features, where data from mysql.column_stats and mysql.table_stats are combined.
		String query = "select table_name, cardinality from mysql.table_stats where db_name = '" + databaseName + "'";

		Map<String, Table> map = new HashMap<>();
		for (Table table : tables) {
			map.put(table.getName(), table);
		}

		try (Statement stmt = connection.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				for (Column column : map.get(rs.getString(1)).getColumnList()) {
					column.setEstimatedRowCount(rs.getInt(2));
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
				Column column = table.getColumn(rs.getString(2));
				column.setNullRatio(rs.getDouble(3));
				column.setUniqueRatio(1.0 / rs.getDouble(4));
				column.setWidthAvg(rs.getDouble(5));
				column.setTextMin(rs.getString(6));
				column.setTextMax(rs.getString(7));
				String rawHistogram = (rs.getString(8));
				try {
					column.setHistogramBounds(Histogram.rel2abs(parse(rawHistogram), Double.valueOf(column.getTextMin()), Double.valueOf(column.getTextMax())));
				} catch (Exception ignored) {} // The table can be empty, the statistics may not be calculated,...
			}
		}
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