package session9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AVLTreeTest {
    private AVLTree tree;

    @Before
    public void setUp() throws Exception {
        tree = new AVLTree();
    }

    @Test
    public void delete() {
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 5);
        tree.delete(tree.root, 5);
        assertTrue(tree.contains(3));
        assertFalse(tree.contains(5));
    }
}