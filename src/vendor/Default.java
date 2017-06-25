package vendor;

import main.Table;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

// A fallback. If Linkifier is connected to some unsupported database, leave the statistics unfilled/filled with the defaults.
public class Default implements Vendor {

	public void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

	}

	public void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException {

	}
}
