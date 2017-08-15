package utility;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

// Returns a datasource for the selected vendor.
// We do it in a factory function because we exploit unique method calls of the datasources (e.g. )
// Will also provide vendor specific functionality.
public class DataSourceFactory {

	public static DataSource getConfiguredDataSource(Properties properties, String password) throws SQLException {
		String vendor = properties.getProperty("vendor");

		switch (vendor) {
			case "MySQL": {
				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setConnectionAttributes("program_name:Linkifier");
				dataSource.setServerName(properties.getProperty("host"));
				dataSource.setDatabaseName(properties.getProperty("database"));
				dataSource.setPortNumber(Integer.valueOf(properties.getProperty("port")));
				dataSource.setUser(properties.getProperty("username"));
				dataSource.setPassword(password);
				return dataSource;
			}
			case "Oracle": {
				OracleDataSource dataSource = new OracleDataSource();
				dataSource.setDescription("Linkifier");
				dataSource.setServerName(properties.getProperty("host"));
				dataSource.setDatabaseName(properties.getProperty("database"));
				dataSource.setPortNumber(Integer.valueOf(properties.getProperty("port")));
				dataSource.setUser(properties.getProperty("username"));
				dataSource.setPassword(password);
				return dataSource;
			}
			case "PostgreSQL": {
				Jdbc3PoolingDataSource dataSource = new Jdbc3PoolingDataSource();
				dataSource.setApplicationName("Linkifier");
				dataSource.setServerName(properties.getProperty("host"));
				dataSource.setDatabaseName(properties.getProperty("database"));
				dataSource.setCurrentSchema(properties.getProperty("schema"));
				dataSource.setPortNumber(Integer.valueOf(properties.getProperty("port")));
				dataSource.setUser(properties.getProperty("username"));
				dataSource.setPassword(password);
				return dataSource;
			}
			case "Microsoft SQL Server": {
				SQLServerDataSource dataSource = new SQLServerDataSource();
				dataSource.setApplicationName("Linkifier");
				dataSource.setServerName(properties.getProperty("host"));
				dataSource.setDatabaseName(properties.getProperty("database"));
				dataSource.setPortNumber(Integer.valueOf(properties.getProperty("port")));
				dataSource.setUser(properties.getProperty("username"));
				dataSource.setPassword(password);
				return dataSource;
			}
			default:
				System.out.println("invalid db type");
				return null;
		}
	}
}
