package utility;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMapTest {

    @Test
    public void batteryTest() throws Exception {
        MultiMap m = new MultiMap();
        assertEquals(0, m.size());
        assertTrue(m.get("k1").isEmpty());

        m.put("k1", "v1");
        assertEquals(1, m.size());
        assertTrue("v1".equals(m.get("k1").get(0)));
        assertTrue(m.get("k2").isEmpty());

        m.put("k1", "v2");
        assertTrue("v1".equals(m.get("k1").get(0)));
        assertTrue("v2".equals(m.get("k1").get(1)));
        assertTrue(m.get("k2").isEmpty());

        m.remove("k1");
        assertEquals(0, m.size());
        assertTrue(m.get("k1").isEmpty());
    }

}