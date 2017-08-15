package main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RelationshipTest {
	private Relationship relationship;

	@Before
	public void init() {
		Column fk = new Column("fkTable", "fkColumn");
		Column pk = new Column("pkTable", "pkColumn");
		relationship = new Relationship();
		relationship.setPk(pk);
		relationship.setFk(fk);
	}

	@Test
	public void setIsInRangeTextIn() {
		relationship.getFk().setTextMin("2");
		relationship.getFk().setTextMax("11362");

		relationship.getPk().setTextMin("1");
		relationship.getPk().setTextMax("11382");

		assertTrue(relationship.isInRange());
	}

	@Test
	public void setIsInRangeTextEdge() {
		relationship.getFk().setTextMin("1");
		relationship.getFk().setTextMax("10");

		relationship.getPk().setTextMin("1");
		relationship.getPk().setTextMax("10");

		assertTrue(relationship.isInRange());
	}

	@Test
	public void setIsInRangeTextMin() {
		relationship.getFk().setTextMin("1");
		relationship.getFk().setTextMax("10");

		relationship.getPk().setTextMin("2");
		relationship.getPk().setTextMax("10");

		assertFalse(relationship.isInRange());
	}

	@Test
	public void setIsInRangeTextMax() {
		relationship.getFk().setTextMin("1");
		relationship.getFk().setTextMax("11");

		relationship.getPk().setTextMin("1");
		relationship.getPk().setTextMax("10");

		assertFalse(relationship.isInRange());
	}

	@Test
	public void nullPointerResistance() {
		// Following attributes are not nullable
		Table fkTable = new Table("mutagenesis", "t1");
		Table pkTable = new Table("mutagenesis", "t1");
		relationship.setFkTable(fkTable);
		relationship.setPkTable(pkTable);
		relationship.getFk().setDataType(1);
		relationship.getPk().setDataType(1);
		relationship.getFk().setDataTypeName("Integer");
		relationship.getPk().setDataTypeName("Integer");
		relationship.getFk().setColumnSize(4);
		relationship.getPk().setColumnSize(4);
		relationship.getFk().setDecimalDigits(0);
		relationship.getPk().setDecimalDigits(0);

		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.958, relationship.violatesCardinalityConstraint(), 0.0001);   // All null -> returns average

		relationship.getFk().setUniqueRatio(0.5);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.958, relationship.violatesCardinalityConstraint(), 0.0001);     // Pk is empty or stats is unavailable -> returns average

		relationship.getPk().setUniqueRatio(1.0);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.958, relationship.violatesCardinalityConstraint(), 0.0001);   // Strange -> returns average

		relationship.getPk().setEstimatedRowCount(1000);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.0, relationship.violatesCardinalityConstraint(), 0.0001);     // Valid -> returns low value

		relationship.getFk().setEstimatedRowCount(100);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.0, relationship.violatesCardinalityConstraint(), 0.0001);     // Valid -> returns low value

		relationship.getFk().setEstimatedRowCount(2000);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.0, relationship.violatesCardinalityConstraint(), 0.0001);     // Good (nullRatio=0.12, uniqueRatio=0.5)

		relationship.getFk().setNullRatio(0.5);
		relationship.getFk().setEstimatedRowCount(4000);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.0, relationship.violatesCardinalityConstraint(), 0.0001);     // Borderline good (nullRatio=0.5, uniqueRatio=0.5)

		relationship.getFk().setEstimatedRowCount(4001);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.0002, relationship.violatesCardinalityConstraint(), 0.0001);  // Borderline bad (nullRatio=0.5, uniqueRatio=0.5)

		relationship.getFk().setNullRatio(0.0);
		relationship.getFk().setUniqueRatio(1.0);
		relationship.getFk().setEstimatedRowCount(1000);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.0, relationship.violatesCardinalityConstraint(), 0.0001);     // Borderline good -> returns low value

		relationship.getFk().setEstimatedRowCount(1001);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(0.001, relationship.violatesCardinalityConstraint(), 0.0001);   // Borderline bad -> non-zero return value

		relationship.getFk().setEstimatedRowCount(10000);
		relationship.setFastFeatures("mutagenesis");
		assertEquals(2.3025, relationship.violatesCardinalityConstraint(), 0.0001);   // Bad -> return high value
	}
}
