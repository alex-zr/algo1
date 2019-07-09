package session6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListRecurTest {
    private LinkedListRecur unit;
    @Before
    public void setUp() throws Exception {
        unit = new LinkedListRecur();
    }

    @Test
    public void testToStringSuccess() {
        unit.addHead(1);
        unit.add(2);
        assertEquals("1->2", unit.toString());
    }

    @Test
    public void testAddSuccess() {
        unit.add(1);
        unit.add(2);
        assertEquals("1->2", unit.toString());
    }
}