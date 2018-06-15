
package main;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import oracle.jdbc.pool.OracleConnectionPoolDataSource;
import org.junit.Before;
import org.junit.Test;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;
import vendor.*;

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
	public void MariaDB() throws Exception {
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
        // Even though this column contains nulls, nulls have to be excluded from the range estimate
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
	public void Azure_differentCollations() throws Exception {
        SQLServerDataSource dataSource = new SQLServerDataSource();
		dataSource.setServerName("hlt3qa7608.database.windows.net");     // Only for whitelisted IPs
		dataSource.setUser("customer");
		dataSource.setPassword("There is only one boss.");
		dataSource.setDatabaseName("test"); // This database has a different collation from the server

		try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new MSSQL();
            vendor.getTableStatistics("PredictorFactory", "mutagenesis", tables, connection);
            vendor.getColumnStatistics("PredictorFactory", "mutagenesis", tables, connection);
		}

        // All we want is to not get an exception
	}

    @Test
    public void Oracle() throws Exception {
        // Oracle does not return number length and count of digits always in the expected format.
        // We use a following workaround (not perfect but good enough):
		System.getProperties().setProperty("oracle.jdbc.J2EE13Compliant", "true");
		OracleConnectionPoolDataSource dataSource = new OracleConnectionPoolDataSource();
		dataSource.setURL("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUser("SYSTEM");
		dataSource.setPassword("******");

        try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new Oracle();
            vendor.getTableStatistics("XE", "FINANCIAL", tables, connection);
            vendor.getColumnStatistics("XE", "FINANCIAL", tables, connection);
        }

        // There are 481881 null records
        assertEquals(481881/1056320.0, tables.get(0).getColumn("k_symbol").getNullRatio(), 0.0000001);
        // There are 8 different non-null records
        assertEquals(8/1056320.0, tables.get(0).getColumn("k_symbol").getUniqueRatio(), 0.000001);
        // We used nvarchar2, not varchar2 -> it takes twice as much space.
        // Note that the statistics value is always rounded (the rules of rounding are unknown).
        assertEquals(2*4.5172, tables.get(0).getColumn("k_symbol").getWidthAvg(), 0.2);
        assertEquals(" ", tables.get(0).getColumn("k_symbol").getTextMin());
        assertEquals("UVER", tables.get(0).getColumn("k_symbol").getTextMax());
    }


    @Test
	public void MariaDB_numbers() throws Exception {
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

    @Test
    public void Oracle_number() throws Exception {
        // Oracle does not return number length and count of digits always in the expected format.
        // We use a following workaround (not perfect but good enough):
        System.getProperties().setProperty("oracle.jdbc.J2EE13Compliant", "true");
        OracleConnectionPoolDataSource dataSource = new OracleConnectionPoolDataSource();
        dataSource.setURL("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setUser("SYSTEM");
        dataSource.setPassword("******");

        try (Connection connection = dataSource.getConnection()){
            Vendor vendor = new Oracle();
            vendor.getTableStatistics("XE", "FINANCIAL", tables, connection);
            vendor.getColumnStatistics("XE", "FINANCIAL", tables, connection);
        }

        // There are 760931 null records
        assertEquals(760931.0/1056320.0, tables.get(0).getColumn("account").getNullRatio(), 0.0001);
        // There are 7665 non-null unique records from all records
        assertEquals(7665.0/1056320.0, tables.get(0).getColumn("account").getUniqueRatio(), 0.000001);
        // Value as returned with: select avg(lengthb("account")) from "trans"
        // Oracle uses a variable length NUMBER data type -> the returned value is not a whole number.
        // Note that the statistics value is always rounded (the rules of rounding are unknown).
        assertEquals(7.37469912555985, tables.get(0).getColumn("account").getWidthAvg(), 0.5);
        assertEquals(0, tables.get(0).getColumn("account").getValueMin(), 0.00001);
        assertEquals(99994199, tables.get(0).getColumn("account").getValueMax(), 0.00001);
    }
}
