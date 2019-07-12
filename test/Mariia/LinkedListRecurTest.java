package Mariia;

import org.junit.Before;
import org.junit.Test;
import session6.LinkedListRecur;

import static org.junit.Assert.assertEquals;

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