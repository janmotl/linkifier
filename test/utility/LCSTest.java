package utility;

import org.junit.Test;
import utility.LCS;

import static org.junit.Assert.assertEquals;

public class LCSTest {

	@Test
	public void lcs() {
		assertEquals(4, LCS.getLongestCommonSubsequence("abcde", "bcdef"));
		assertEquals(5, LCS.getLongestCommonSubsequence("a bcd e", "x bcd x"));
		assertEquals(3, LCS.getLongestCommonSubsequence("bcd", "abcd"));
	}

}
