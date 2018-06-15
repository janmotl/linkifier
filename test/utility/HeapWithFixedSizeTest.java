package utility;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeapWithFixedSizeTest {

    @Test
    public void batteryTest() throws Exception {
        HeapWithFixedSize<Integer> h = new HeapWithFixedSize<>(3);
        assertEquals(0, h.size());

        assertTrue(h.add(10));
        assertEquals(1, h.size());
        assertTrue(10 == h.peek());

        assertTrue(h.add(12));
        assertEquals(2, h.size());
        assertTrue(10 == h.peek());

        assertTrue(h.add(8));
        assertEquals(3, h.size());
        assertTrue(8 == h.peek());

        assertFalse(h.add(7));
        assertEquals(3, h.size());
        assertTrue(8 == h.peek());

        assertTrue(h.add(11));
        assertEquals(3, h.size());
        assertTrue(10 == h.peek());

        assertTrue(10 == h.remove());
        assertTrue(11 == h.remove());
        assertTrue(12 == h.remove());
    }

    @Test
    public void theSameValues() throws Exception {
        HeapWithFixedSize<Integer> h = new HeapWithFixedSize<>(3);

        h.add(10);
        h.add(10);

        assertEquals(2, h.size());
    }

    @Test
    public void theSameValuesWithEviction() throws Exception {
        HeapWithFixedSize<Integer> h = new HeapWithFixedSize<>(3);
        Integer a = 10;
        Integer b = 10;
        Integer c = 10;
        Integer d = 10;

        assertTrue(h.add(a));
        assertTrue(h.add(b));
        assertTrue(h.add(c));
        assertFalse(h.add(d));

        //noinspection NumberEquality - we check for the object equality, not the value equality
        assertTrue(c==h.poll());
    }
}