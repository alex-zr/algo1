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
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 6);
        tree.printByLevel(tree.root, 5);
        tree.root = tree.delete(tree.root, 4);
        tree.printByLevel(tree.root, 5);
        assertTrue(tree.contains(5));
        assertFalse(tree.contains(4));
    }
}