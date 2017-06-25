import org.junit.Test;

import static main.Column.KEYWORDS;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utility.Tokenization.contains;
import static utility.Tokenization.lowercaseSplit;

public class ContainsTest {

	@Test
	public void testBattery() {
		assertTrue(contains(lowercaseSplit("personId"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("person_id"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("PERSON_ID"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("id"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("ID"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("IdP"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("id_person"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("ID_PERSON"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("IDPerson"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("person_id2"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("personID2"), KEYWORDS));
		assertTrue(contains(lowercaseSplit("personId2"), KEYWORDS));

		assertFalse(contains(lowercaseSplit("personid"), KEYWORDS));
		assertFalse(contains(lowercaseSplit("PERSONID"), KEYWORDS));
		assertFalse(contains(lowercaseSplit("idperson"), KEYWORDS));
		assertFalse(contains(lowercaseSplit("IDPERSON"), KEYWORDS));
		assertFalse(contains(lowercaseSplit("x"), KEYWORDS));
		assertFalse(contains(lowercaseSplit("prefix_personid"), KEYWORDS));
		assertFalse(contains(lowercaseSplit("IDPERSON"), KEYWORDS));
	}
}
