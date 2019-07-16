package session8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {
    private BST tree;

    @Before
    public void setUp() throws Exception {
        this.tree = new BST();
    }

    @Test
    public void testInsert() {
        tree.insert(3);
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(0);
        tree.print(tree.root);
    }

    @Test
    public void testContainsSingle() {
        tree.insert(3);
        assertTrue(tree.contains(3));
        assertFalse(tree.contains(5));
        assertEquals(1, tree.size);
    }
}