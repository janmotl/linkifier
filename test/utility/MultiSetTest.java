package utility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiSetTest {

	@Test
	public void batteryTest() {
		MultiSet<String> multiSet = new MultiSet<>();

		assertEquals(0, multiSet.totalCount());
		assertEquals(0, multiSet.count("a"));
		multiSet.add("a");
		assertEquals(1, multiSet.count("a"));
		multiSet.add("a");
		assertEquals(2, multiSet.count("a"));
		multiSet.add("b");
		assertEquals(1, multiSet.count("b"));
		assertEquals(2, multiSet.count("a"));
		multiSet.add("a");
		assertEquals(3, multiSet.count("a"));
		assertEquals(4, multiSet.totalCount());
	}

}
