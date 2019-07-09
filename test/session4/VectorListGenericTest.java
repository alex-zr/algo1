package session4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorListGenericTest {
    private VectorListGeneric1 module;

    @Before
    public void setUp() {
        module = new VectorListGeneric1();
    }

    @Test
    public void get() {
        module.add(0);
        assertEquals(0, module.get(0));
    }
}