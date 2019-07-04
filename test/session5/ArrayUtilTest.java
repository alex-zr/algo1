package session5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {
    private ArrayUtil module;

    @Before
    public void setUp() {
        module = new ArrayUtil();
    }

    @Test
    public void sum() {
        assertEquals(6, module.sum(new Integer[]{1,2,3}));
    }

    @Test
    public void testSumSingle() {
        assertEquals(1, module.sum(new Integer[]{1}));
    }

    @Test
    public void testSumEmpty() {
        assertEquals(0, module.sum(new Integer[]{}));
    }

    @Test
    public void testSumContainsNull() {
        assertEquals(5, module.sum(new Integer[]{null, 5}));
    }

    @Test
    public void testSumVectorNull() {
        assertEquals(0, module.sum(null));
    }
}