package utility;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import javax.sql.DataSource;
import java.security.InvalidParameterException;
import java.sql.SQLException;
import java.util.Properties;

// Returns a datasource for the selected vendor.
// We do it in a factory function because we exploit unique method calls of the dataSources.
// The code could be distributed into files in src.vendor package.
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
				// Oracle does not return number length and count of digits always in the expected format.
				// We use a following workaround (it is not perfect but good enough):
				System.getProperties().setProperty("oracle.jdbc.J2EE13Compliant", "true");

				OracleDataSource dataSource = new OracleDataSource();
				dataSource.setDescription("Linkifier");
				dataSource.setServerName(properties.getProperty("host"));
				dataSource.setDatabaseName(properties.getProperty("database"));
				dataSource.setPortNumber(Integer.valueOf(properties.getProperty("port")));
				dataSource.setServiceName(properties.getProperty("serviceName"));
				dataSource.setUser(properties.getProperty("username"));
				dataSource.setPassword(password);
				dataSource.setDriverType("thin"); // Use "thin" (Java based driver) even when "oci" (C based driver) is available
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
				dataSource.setIntegratedSecurity(Boolean.valueOf(properties.getProperty("windowsAuthentication")));
				dataSource.setUser(properties.getProperty("username"));
				dataSource.setPassword(password);
				return dataSource;
			}
			default:
				throw new InvalidParameterException("Invalid db type was defined");
		}
	}
}
