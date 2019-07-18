package roshupkin_nikita.bst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BstTest {
    private Bst tree;

    @Before
    public void setUp() throws Exception {
        this.tree = new Bst();
    }

    @Test
    public void testInsert() {
        tree.insert(3);
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(0);
        tree.printByLevel(tree.root, 5);
        System.out.println(tree.size);
    }

    @Test
    public void testContainsSingle() {
        tree.insert(3);
        tree.printByLevel(tree.root, 5);
        assertTrue(tree.contains(3));
        assertFalse(tree.contains(5));
        assertEquals(1, tree.size());


    }

}