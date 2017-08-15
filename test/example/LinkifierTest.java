package example;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import main.Accuracy;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.assertTrue;

public class LinkifierTest {

	static private MysqlDataSource dataSource;

	@BeforeClass
	static public void setUp() throws Exception {
		dataSource = new MysqlDataSource();
		dataSource.setServerName("relational.fit.cvut.cz");     // Public read-only database for testing
		dataSource.setUser("guest");
		dataSource.setPassword("relational");
	}

	@Test
	public void mutagenesis() throws Exception {
		dataSource.setDatabaseName("mutagenesis");
		try (Connection connection = dataSource.getConnection()){
			Linkifier linkifier = new Linkifier(connection, "");
			linkifier.estimatePk();
			linkifier.estimateFk();

			assertTrue(Accuracy.getFkRecall(linkifier.getRelationships()) > 0.99);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) > 0.99);
		}
	}

	@Test
	public void financial() throws Exception {
		dataSource.setDatabaseName("financial");
		try (Connection connection = dataSource.getConnection()){
			Linkifier linkifier = new Linkifier(connection, "");
			linkifier.estimatePk();
			linkifier.estimateFk();

			assertTrue(Accuracy.getFkRecall(linkifier.getRelationships()) > 0.99);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) > 0.99);
		}
	}
}