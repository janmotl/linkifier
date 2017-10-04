package example;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import main.Accuracy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import java.sql.Connection;

import static org.junit.Assert.assertTrue;

public class LinkifierTest {

	static private MysqlDataSource dataSource;

	@BeforeClass
	static public void setUp() {
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

			assertTrue(Accuracy.getPkRecall(linkifier.getTables()) > 0.99);
			assertTrue(Accuracy.getPkPrecision(linkifier.getTables()) > 0.99);
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

			assertTrue(Accuracy.getPkRecall(linkifier.getTables()) > 0.99);
			assertTrue(Accuracy.getPkPrecision(linkifier.getTables()) > 0.99);
			assertTrue(Accuracy.getFkRecall(linkifier.getRelationships()) > 0.99);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) > 0.99);
		}
	}

	@Test
	public void pk_uni() throws Exception {
		dataSource.setDatabaseName("UW_std");
		try (Connection connection = dataSource.getConnection()){
			Linkifier linkifier = new Linkifier(connection, "");
			linkifier.estimatePk();
			linkifier.estimateFk();

			assertTrue(Accuracy.getPkRecall(linkifier.getTables()) > 0.99);
			assertTrue(Accuracy.getPkPrecision(linkifier.getTables()) > 0.99);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) > 0.99);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) > 0.99);
		}
	}

	@Test
	public void tpcc() throws Exception {
		dataSource.setDatabaseName("tpcc");
		try (Connection connection = dataSource.getConnection()){
			Linkifier linkifier = new Linkifier(connection, "");
			linkifier.estimatePk();
			linkifier.estimateFk();

			assertTrue(Accuracy.getPkPrecision(linkifier.getTables()) >= 0.875);    // History table does not have a defined PK (as the TPCC benchmark definition specifies)
			assertTrue(Accuracy.getPkRecall(linkifier.getTables()) >= 0.736);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) >= 0.205);
			assertTrue(Accuracy.getFkRecall(linkifier.getRelationships()) >= 0.4);
		}
	}

	@Test
	public void sat() throws Exception {
		dataSource.setDatabaseName("SAT");
		try (Connection connection = dataSource.getConnection()){
			Linkifier linkifier = new Linkifier(connection, "");
			linkifier.estimatePk();
			linkifier.estimateFk();

			assertTrue(Accuracy.getPkPrecision(linkifier.getTables()) >= 0.875);
			assertTrue(Accuracy.getPkRecall(linkifier.getTables()) >= 0.53);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) > 0.999);
			assertTrue(Accuracy.getFkRecall(linkifier.getRelationships()) >= 0.97);
		}
	}

	@Test
	public void firefox() throws Exception {
		Jdbc3PoolingDataSource dataSource = new Jdbc3PoolingDataSource();
		dataSource.setServerName("localhost");     // Private with sensitive data. Tested because it is used in published articles by the 3rd parties.
		dataSource.setUser("jan");

		dataSource.setDatabaseName("PredictorFactory");
		dataSource.setCurrentSchema("ctu_firefox");
		try (Connection connection = dataSource.getConnection()){
			Linkifier linkifier = new Linkifier(connection, "ctu_firefox");
			linkifier.estimatePk();
			linkifier.estimateFk();

			assertTrue(Accuracy.getPkPrecision(linkifier.getTables()) > 0.99);
			assertTrue(Accuracy.getPkRecall(linkifier.getTables()) > 0.99);
			assertTrue(Accuracy.getFkPrecision(linkifier.getRelationships()) > 0.99);
			assertTrue(Accuracy.getFkRecall(linkifier.getRelationships()) >= 0.7); // Misses: moz_bookmarks.fk --> moz_places.id, moz_items_annos.item_id --> moz_bookmarks.id
		}
	}
}