package utility;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utility.Tokenization.lowercaseSplit;

public class TpcTest {
	@Test
	public void similarity() {
		// We do not expect crisp 1 or 0 (because a continuous range 0..1 provide much more information).
		assertTrue(Tpc.similarity(lowercaseSplit("matches"), lowercaseSplit("tid"), lowercaseSplit("tid"), lowercaseSplit("teams")) == 1);  // Trivial
		assertTrue(Tpc.similarity(lowercaseSplit("TransactionHistoryArchive"), lowercaseSplit("ActualCost"), lowercaseSplit("UnitMeasureCode"), lowercaseSplit("UnitMeasure")) < 0.8);  // Different
		assertTrue(Tpc.similarity(lowercaseSplit("CountryLanguage"), lowercaseSplit("Language"), lowercaseSplit("Code"), lowercaseSplit("Country")) < 0.8);  // Different

		assertTrue(Tpc.similarity(lowercaseSplit("Stock"), lowercaseSplit("i_id"), lowercaseSplit("id"), lowercaseSplit("Item")) == 1);   // Abbreviations
		assertTrue(Tpc.similarity(lowercaseSplit("Stock"), lowercaseSplit("w_id"), lowercaseSplit("id"), lowercaseSplit("Item")) < 0.8);

		assertTrue(Tpc.similarity(lowercaseSplit("TRADE_REQUEST"), lowercaseSplit("CA_ID"), lowercaseSplit("ID"), lowercaseSplit("CUSTOMER_ACCOUNT")) == 1); // Two word abbreviations
		assertTrue(Tpc.similarity(lowercaseSplit("NEWS_XREF"), lowercaseSplit("NI_ID"), lowercaseSplit("ID"), lowercaseSplit("NEWS_ITEM")) == 1);
		assertTrue(Tpc.similarity(lowercaseSplit("NEWS_XREF"), lowercaseSplit("CO_ID"), lowercaseSplit("ID"), lowercaseSplit("NEWS_ITEM")) < 0.8);

		assertTrue(Tpc.similarity(lowercaseSplit("HOLDING_SUMMARY"), lowercaseSplit("AD_ID"), lowercaseSplit("ID"), lowercaseSplit("ADDRESS")) > 0.95);  // One word abbreviation to two letters
		assertTrue(Tpc.similarity(lowercaseSplit("INDUSTRY"), lowercaseSplit("SC_ID"), lowercaseSplit("ID"), lowercaseSplit("SECTOR")) > 0.95);

		assertTrue(Tpc.similarity(lowercaseSplit("connected"), lowercaseSplit("atom_id2"), lowercaseSplit("atom_id"), lowercaseSplit("atom")) > 0.95);      // Joker card
		assertTrue(Tpc.similarity(lowercaseSplit("connected"), lowercaseSplit("atom_id2_to"), lowercaseSplit("atom_id"), lowercaseSplit("atom")) < 1);
	}


	@Test(expected = IllegalArgumentException.class)
	public void emptyLists() throws Throwable {
		List<String> list = new ArrayList<>();

		Tpc.similarity(list, list, list, list);
	}

	@Test
	public void emptyStrings() throws Throwable {
		List<String> list = new ArrayList<>();
		list.add("");

		assertEquals(1.0, Tpc.similarity(list, list, list, list), 0.01);
	}

}
