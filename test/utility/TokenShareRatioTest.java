package utility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static utility.TokenShareRatio.setTokenShareRatioFkLD;
import static utility.Tokenization.lowercaseSplit;

public class TokenShareRatioTest {

	@Test
	public void simEqualLength() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("car smile happy"), lowercaseSplit("cat smile happy"));

		assertEquals(0.888888888888889, similarity, 0.00001);
	}

	@Test
	public void simVariableLength() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("cat smile happy"), lowercaseSplit("cardio smile happy"));
		// Note that the similarity is intentionally asymmetric because FKs are frequently abbreviated PKs.
		// But reverse does not hold.

		assertEquals(0.7777777777777778, similarity, 0.00001);
	}

	@Test
	public void simPrefix() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("draftYear"), lowercaseSplit("year"));

		assertEquals(1, similarity, 0.00001);
	}

	@Test
	public void simPrefixSmooth() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("wteam"), lowercaseSplit("team_id"));

		assertEquals(1, similarity, 0.00001);
	}

	@Test
	public void simSuffix() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("tmIDWinner"), lowercaseSplit("tmID"));

		assertEquals(1, similarity, 0.00001);
	}

	@Test
	public void simCaseInsensitive() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("Indicator Code"), lowercaseSplit("INDICATOR_CODE"));

		assertEquals(1, similarity, 0.00001);
	}

	@Test
	public void simAbbreviation() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("Province"), lowercaseSplit("Prov_id"));

		assertEquals(1, similarity, 0.00001);
	}

	@Test
	public void simId() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("ref_id"), lowercaseSplit("id"));

		assertEquals(1, similarity, 0.00001);
	}

	@Test
	public void simSynonym() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("peopleId"), lowercaseSplit("personId"));

		assertEquals(1, similarity, 0.00001);
	}

	@Test
	public void simAbbreviation2() {
		double similarity = setTokenShareRatioFkLD(lowercaseSplit("ShipVia"), lowercaseSplit("ShipperID"));

		assertEquals(0.7857142857142857, similarity, 0.00001);
	}

}
