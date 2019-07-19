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
        tree.printByLevel(tree.root, 5);
    }

    @Test
    public void testContainsSingle() {
        tree.insert(3);
        tree.printByLevel(tree.root, 5);
        assertTrue(tree.contains(3));
        assertFalse(tree.contains(5));
        assertEquals(1, tree.size);
    }

    @Test
    public void testDelete() {
        tree.insert(6);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        tree.insert(8);
        tree.insert(7);
        tree.print(tree.root);
        tree.printByLevel(tree.root, 5);
        final BST.TreeNode delete = tree.deleteRec(tree.root, 2);
        tree.print(delete);
        tree.printByLevel(delete, 5);
        assertFalse(tree.contains(5));
    }
}