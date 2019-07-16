package roshupkin_nikita.recurLinkList;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class RecurLinkListTest {

    private RecurLinkList unit;
    @Before
    public void setUp() throws Exception {
        unit = new RecurLinkList();
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
        unit.add(3);
        assertEquals("1->2->3", unit.toString());
    }
}