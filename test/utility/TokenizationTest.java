package utility;

import org.junit.Test;

import java.util.Arrays;

import static main.Column.KEYWORDS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utility.Tokenization.contains;
import static utility.Tokenization.lowercaseSplit;


public class TokenizationTest {

	@Test
	public void testCamelCased() {
		assertEquals(Arrays.asList("I", "Some", "Camel", "Cased", "String"), Tokenization.split("ISomeCamelCasedString"));
	}

	@Test
	public void testSnakeCased() {
		assertEquals(Arrays.asList("UNDERSCORED", "STRING"), Tokenization.split("UNDERSCORED_STRING"));
	}

	@Test
	public void testSnakeCasedSmall() {
		assertEquals(Arrays.asList("underscored", "string"), Tokenization.split("underscored_string"));
	}

	@Test
	public void testMixed() {
		assertEquals(Arrays.asList("camel", "Cased", "and", "UNDERSCORED"), Tokenization.split("camelCased_and_UNDERSCORED"));
	}

	@Test
	public void testSymbol() {
		assertEquals(Arrays.asList("_"), Tokenization.split("_"));
	}

	@Test
	public void testBattery() {
		assertEquals(Arrays.asList("lowercase"), Tokenization.split("lowercase"));
		assertEquals(Arrays.asList("Class"), Tokenization.split("Class"));
		assertEquals(Arrays.asList("My","Class"), Tokenization.split("MyClass"));
		assertEquals(Arrays.asList("HTML"), Tokenization.split("HTML"));
		assertEquals(Arrays.asList("PDF", "Loader"), Tokenization.split("PDFLoader"));
		assertEquals(Arrays.asList("A", "String"), Tokenization.split("AString"));
		assertEquals(Arrays.asList("Simple", "XML", "Parser"), Tokenization.split("SimpleXMLParser"));
		assertEquals(Arrays.asList("lower", "hyphen"), Tokenization.split("lower-hyphen"));
		assertEquals(Arrays.asList("99", "Bottles"), Tokenization.split("99Bottles"));
		assertEquals(Arrays.asList("GL", "11", "Version"), Tokenization.split("GL11Version"));
		assertEquals(Arrays.asList("May", "5"), Tokenization.split("May5"));
		assertEquals(Arrays.asList("BFG", "9000"), Tokenization.split("BFG9000"));
		assertEquals(Arrays.asList("Žluťoučký", "Kůň"), Tokenization.split("ŽluťoučkýKůň"));
		assertEquals(Arrays.asList("."), Tokenization.split("."));
		assertEquals(Arrays.asList(" "), Tokenization.split(" "));
		assertEquals(Arrays.asList("324", "A"), Tokenization.split(" 324A "));
	}

		@Test
	public void containsBatteryTest() {
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
