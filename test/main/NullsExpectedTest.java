package main;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NullsExpectedTest {
    @Test
    public void containsKeyword_insensitiveToPrefixesAndSuffixes() throws Exception {
        List<String> tokens = new ArrayList<>();

        tokens.add("apple");
        Assert.assertFalse(NullsExpected.containsKeyword(tokens));

        tokens.add("banana");
        Assert.assertFalse(NullsExpected.containsKeyword(tokens));

        tokens.add("enclosed");
        Assert.assertTrue(NullsExpected.containsKeyword(tokens)); // Because of "close" keyword
    }

}