import main.Column;
import main.Relationship;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
}
