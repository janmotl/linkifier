
package main;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.junit.Before;
import org.junit.Test;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;
import vendor.MSSQL;
import vendor.MySQL;
import vendor.PostgreSQL;
import vendor.Vendor;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VendorTest {

    // Since database statistics is vendor specific and JDBC does not provide unified interface for it,
    // we have to make sure that we are getting at least approximately the same results regardless of the
    // database vendor.
    // Common hiccups:
    //      different treatment of nulls (e.g. are nulls included/excluded from the avg_width?),
    //      different estimates in sample statistics (e.g. sample statistics can provide really bad estimates),
    //      different treatment of numbers and characters (e.g. in PostgreSQL)
    //      most_common_values are ignored in the stats and histograms (test on financial.order.amount)
    // Remember: The statistics must exist on the db, otherwise we get null pointer exception.

    private List<Table> tables;

    @Before
    public void init() {
         // Prepare a table with tables
        Table t1 = new Table("financial", "trans");
        Column col1 = new Column("trans", "k_symbol");
        t1.getColumnList().add(col1);
        Column col2 = new Column("trans", "account");
        t1.getColumnList().add(col2);
        tables = new ArrayList<>();
        tables.add(t1);
    }

	@Test
	public void MySQL() throws Exception {
        MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerName("relational.fit.cvut.cz");     // Public read-only database for testing
		dataSource.setUser("guest");
		dataSource.setPassword("relational");
		dataSource.setDatabaseName("financial");

		try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new MySQL();
            vendor.getTableStatistics("financial", "", tables, connection);
            vendor.getColumnStatistics("financial", "", tables, connection);
		}

        // There are 481881 null records
        assertEquals(481881/1056320.0, tables.get(0).getColumn("k_symbol").getNullRatio(), 0.001);
        // There are 8 different non-null records
        assertEquals(8/1056320.0, tables.get(0).getColumn("k_symbol").getUniqueRatio(), 0.000001);
        assertEquals(4.5172, tables.get(0).getColumn("k_symbol").getWidthAvg(), 0.000001);
        assertEquals(" ", tables.get(0).getColumn("k_symbol").getTextMin());
        assertEquals("UVER", tables.get(0).getColumn("k_symbol").getTextMax());
	}

    @Test
	public void PostgreSQL() throws Exception {
        Jdbc3PoolingDataSource dataSource = new Jdbc3PoolingDataSource();
		dataSource.setServerName("localhost");     // Local only, sorry
		dataSource.setUser("jan");
		dataSource.setPassword("");
		dataSource.setDatabaseName("PredictorFactory");

		try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new PostgreSQL();
            vendor.getTableStatistics("PredictorFactory", "financial", tables, connection);
            vendor.getColumnStatistics("PredictorFactory", "financial", tables, connection);
		}

        // There are 481881 null records
        assertEquals(481881/1056320.0, tables.get(0).getColumn("k_symbol").getNullRatio(), 0.01);
        // There are 8 different non-null records
        assertEquals(8/1056320.0, tables.get(0).getColumn("k_symbol").getUniqueRatio(), 0.000001);
        // On PostgreSQL, it is always an Integer -> we round it
        assertEquals(4.5172, tables.get(0).getColumn("k_symbol").getWidthAvg(), 1);
        assertEquals(" ", tables.get(0).getColumn("k_symbol").getTextMin());
        assertEquals("UVER", tables.get(0).getColumn("k_symbol").getTextMax());
	}

    @Test
	public void Azure() throws Exception {
        SQLServerDataSource dataSource = new SQLServerDataSource();
		dataSource.setServerName("hlt3qa7608.database.windows.net");     // Only for whitelisted IPs
		dataSource.setUser("customer");
		dataSource.setPassword("There is only one boss.");
		dataSource.setDatabaseName("PredictorFactory");

		try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new MSSQL();
            vendor.getTableStatistics("PredictorFactory", "financial", tables, connection);
            vendor.getColumnStatistics("PredictorFactory", "financial", tables, connection);
		}

        // There are 481881 null records
        assertEquals(481881/1056320.0, tables.get(0).getColumn("k_symbol").getNullRatio(), 0.0000001);
        // There are 8 different non-null records
        assertEquals(8/1056320.0, tables.get(0).getColumn("k_symbol").getUniqueRatio(), 0.000001);
        assertEquals(4.5172, tables.get(0).getColumn("k_symbol").getWidthAvg(), 0.0001);
        assertEquals(" ", tables.get(0).getColumn("k_symbol").getTextMin());
        assertEquals("UVER", tables.get(0).getColumn("k_symbol").getTextMax());
	}


    @Test
	public void MySQL_numbers() throws Exception {
        MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerName("relational.fit.cvut.cz");     // Public read-only database for testing
		dataSource.setUser("guest");
		dataSource.setPassword("relational");
		dataSource.setDatabaseName("financial");

		try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new MySQL();
            vendor.getTableStatistics("financial", "", tables, connection);
            vendor.getColumnStatistics("financial", "", tables, connection);
		}

        // There are 760931 null records
        assertEquals(760931.0/1056320.0, tables.get(0).getColumn("account").getNullRatio(), 0.0001);
        // There are 7665 non-null unique records
        assertEquals(7665.0/1056320.0, tables.get(0).getColumn("account").getUniqueRatio(), 0.00001);
        assertEquals(4, tables.get(0).getColumn("account").getWidthAvg(), 0.000001);
        assertEquals(0, tables.get(0).getColumn("account").getValueMin(), 0.00001);
        assertEquals(99994199, tables.get(0).getColumn("account").getValueMax(), 0.00001);
	}

    @Test
	public void PostgreSQL_number() throws Exception {
        Jdbc3PoolingDataSource dataSource = new Jdbc3PoolingDataSource();
		dataSource.setServerName("localhost");     // Local only, sorry
		dataSource.setUser("jan");
		dataSource.setPassword("");
		dataSource.setDatabaseName("PredictorFactory");

		try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new PostgreSQL();
            vendor.getTableStatistics("PredictorFactory", "financial", tables, connection);
            vendor.getColumnStatistics("PredictorFactory", "financial", tables, connection);
		}

        // There are 760931 null records
        assertEquals(760931.0/1056320.0, tables.get(0).getColumn("account").getNullRatio(), 0.01);
        // There are 7665 non-null unique records from all records
        assertEquals(7665.0/1056320.0, tables.get(0).getColumn("account").getUniqueRatio(), 0.01);
        assertEquals(4, tables.get(0).getColumn("account").getWidthAvg(), 0.000001);
        assertEquals(0, tables.get(0).getColumn("account").getValueMin(), 0.00001);
        assertEquals(99994199, tables.get(0).getColumn("account").getValueMax(), 0.00001);
	}

    @Test
	public void Azure_number() throws Exception {
        SQLServerDataSource dataSource = new SQLServerDataSource();
		dataSource.setServerName("hlt3qa7608.database.windows.net");     // Only for whitelisted IPs
		dataSource.setUser("customer");
		dataSource.setPassword("There is only one boss.");
		dataSource.setDatabaseName("PredictorFactory");

		try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new MSSQL();
            vendor.getTableStatistics("PredictorFactory", "financial", tables, connection);
            vendor.getColumnStatistics("PredictorFactory", "financial", tables, connection);
		}

       // There are 760931 null records
        assertEquals(760931.0/1056320.0, tables.get(0).getColumn("account").getNullRatio(), 0.0001);
        // There are 7665 non-null unique records from all records
        assertEquals(7665.0/1056320.0, tables.get(0).getColumn("account").getUniqueRatio(), 0.000001);
        assertEquals(4, tables.get(0).getColumn("account").getWidthAvg(), 0.000001);
        assertEquals(0, tables.get(0).getColumn("account").getValueMin(), 0.00001);
        assertEquals(99994199, tables.get(0).getColumn("account").getValueMax(), 0.00001);
	}
}
