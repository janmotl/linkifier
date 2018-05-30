package utility;

import org.junit.Test;

import static org.junit.Assert.*;
import static utility.String2Num.getNumericValue;

public class String2NumTest {

    @Test
    public void battery() throws Exception {
        assertEquals(35.0, getNumericValue("#"), 0.00001);
        assertTrue(getNumericValue("á") < getNumericValue("í"));
        assertTrue(getNumericValue("aaa") < getNumericValue("aab"));
        assertTrue(getNumericValue("aaŽ") < getNumericValue("aba"));
        assertTrue(getNumericValue("aa\uffff") < getNumericValue("ab\u0000"));
        assertTrue(getNumericValue("a\uffff") < getNumericValue("b\u0000"));
        assertTrue(getNumericValue("12") < getNumericValue("13"));
        assertTrue(getNumericValue("1234") < getNumericValue("1239"));

        // When it comes to 4-byte long UTF-16 symbols, like MATHEMATICAL_FRAKTUR_CAPITAL_G,
        // all we want is that the algorithm does not crash.
        getNumericValue("\uD835\uDD0A");
    }
}