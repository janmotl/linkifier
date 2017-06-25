package vendor;

import main.Table;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

// Returns statistics.
// Since database statistics cannot be efficiently collected agnostic way, we have an implementation for each database
// vendor. The implementation is expected to only fill in known stats - we do not expect invocation of statistics
// calculation.
public interface Vendor {

	void getTableStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException;

	void getColumnStatistics(String databaseName, String schemaName, List<Table> tables, Connection connection) throws SQLException;
}
