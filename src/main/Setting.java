package main;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

// The credentials to relational.fit.cvut.cz are used for demonstration/testing purposes.
// The credentials give read-only access and they are publicly known.
// The rest of the credentials are to local databases for compatibility testing.
public class Setting {
	public static final String CSV_SEPARATOR = ",";
	public static final String CSV_QUOTE = "\"";
	public static final List<String> SYNONYM_PERSON = Arrays.asList("employee", "manager", "person", "people", "user", "follower", "player", "goalie", "entity", "owner");
	public static final List<String> SYNONYM_PRODUCT = Arrays.asList("product", "component");
	public static final List<String> SYNONYM_COUNTRY = Arrays.asList("country", "nation");
	public static final List<String> SYNONYM_CITY = Arrays.asList("city", "capitol");
	public static final List<String> KEYWORD_RELATIONSHIP = Arrays.asList("to", "from", "1", "2", "3", "4", "a", "b", "x", "y", "origin", "dest", "div", "departure", "arrival", "winner", "loser", "via", "original", "sales", "opp", "home", "away", "draft", "other", "bill", "ship", "shipto", "assembly", "unit", "close", "open", "creation", "excerpt", "parent", "child", "returning", "start", "end", "sold", "draft", "refunded", "current", "access", "reports", "cited", "citing", "last", "first", "related"); // E.g. creation_date, open_date...

	public static DataSource getDataSource() throws SQLException {
		MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
		dataSource.setUrl("jdbc:mysql://relational.fit.cvut.cz");
		dataSource.setUser("guest");
		dataSource.setPassword("relational");

		// MSSQL
//		SQLServerDataSource dataSource = new SQLServerDataSource();
//		dataSource.setURL("jdbc:sqlserver://localhost:1433;DatabaseName=PredictorFactory");
//		dataSource.setUser("sa");
//		dataSource.setPassword("");

		// Oracle
		// Oracle does not return number length and count of digits always in the expected format.
		// We use a following workaround (not perfect but good enough):
//		System.getProperties().setProperty("oracle.jdbc.J2EE13Compliant", "true");
//		OracleConnectionPoolDataSource dataSource = new OracleConnectionPoolDataSource();
//		dataSource.setURL("jdbc:oracle:thin:@localhost:1521:XE");
//		dataSource.setUser("SYSTEM");
//		dataSource.setPassword("******");

		// PostgreSQL
//		org.postgresql.jdbc3.Jdbc3PoolingDataSource dataSource = new Jdbc3PoolingDataSource();
//		dataSource.setUrl("jdbc:postgresql://localhost:5432/PredictorFactory");
//		dataSource.setUser("jan");
//		dataSource.setPassword("");

		return dataSource;
	}
}
