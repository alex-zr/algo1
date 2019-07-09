package roshupkin_nikita.vectorList;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class VectorListTest {
    VectorList<Integer> module;
    @Before
    public void setUp() throws Exception {
        module = new VectorList<>();
        module.add(2);
        module.add(3);
        module.add(5);
        module.add(10);
    }
    @Test
    public void get() {
        assertEquals(2,module.get(0).intValue());
        assertEquals(10,module.get(3).intValue());
    }



    @Test
    public void testItetatorHasNextSuccess() {
       Iterator<Integer> iterator = module.iterator();
       assertTrue(iterator.hasNext());
       iterator.next();
       assertTrue(iterator.hasNext());
        iterator.next();
       assertTrue(iterator.hasNext());
        iterator.next();
       assertTrue(iterator.hasNext());
        iterator.next();
       assertFalse(iterator.hasNext());

    }


}