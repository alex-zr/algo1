package session9;


import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    private class Node {
        int value;
        int height;
        Node left, right;

        Node(int d) {
            value = d;
            height = 1;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    Node root;

    // A utility function to get the height of the tree
    public int height(Node N) {
        if (N == null)
            return 0;

        return N.height;
    }

    // A utility function to get maximum of two integers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // A utility function to right rotate subtree rooted with y
    // See the diagram given above.
    public Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // A utility function to left rotate subtree rooted with x
    // See the diagram given above.
    public Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //  Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Get Balance factor of node N
    public int getBalance(Node N) {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    public Node insert(Node node, int key) {

        /* 1.  Perform the normal BST insertion */
        if (node == null)
            return (new Node(key));

        if (key < node.value)
            node.left = insert(node.left, key);
        else if (key > node.value)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;

        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left),
                height(node.right));

        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key < node.left.value)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.value)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.value) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.value) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        /* return the (unchanged) node pointer */
        return node;
    }

    public Node delete(Node node, int value) {
        // Основной случай рекурсии, когда поддерево пустое
        if (node == null) {
            return node;
        }

        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
            // Если у узла искомое значение, то удаляем этот узел
        } else {
            // у узла только правый потомок или нет потомков
            if (node.left == null) {
                return node.right;
                // у узла только левый потомок или нет потомков
            } else if (node.right == null) {
                return node.left;
            }

            // заменяем значение текущего элемента минимальным элементом в правом поддереве
            node.value = minimumValue(node.right);

            // удаляем минимальный элемент из правого поддерева
            node.right = delete(node.right, node.value);
        }

        return node;
    }

    private int minimumValue(Node node) {
        if (node.left == null) {
            return node.value;
        }
        return minimumValue(node.left);
    }

    public boolean contains(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            if (value > current.value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    public int isAVL(Node n) {
        if (n == null)
            return 0;
        int l = height(n.left);
        int r = height(n.right);

        return l - r;
    }

    public void printByLevel(Node root, int maxLevel) {
        Queue<Node> prev = new LinkedList<>();
        Queue<Node> next = new LinkedList<>();
        Queue<Node> tmp;
        boolean isLevelNull = false;
        int gap = (int) Math.pow(2, maxLevel);
        prev.add(root);

        while (maxLevel > 0 && !isLevelNull && !prev.isEmpty()) {
            isLevelNull = true;
            System.out.print(String.format("%" + gap + "s", " "));
            while (!prev.isEmpty()) {
                Node node = prev.poll();
                System.out.print(node == null ? "--" : node);
                if (node != null && node.left != null) {
                    next.add(node.left);
                    isLevelNull = false;
                } else {
                    next.add(null);
                }
                System.out.print(String.format("%" + (gap * 2 - 2) + "s", " "));
                if (node != null && node.right != null) {
                    next.add(node.right);
                    isLevelNull = false;
                } else {
                    next.add(null);
                }
            }
            System.out.println();
            gap /= 2;
            maxLevel--;
            tmp = prev;
            prev = next;
            next = tmp;
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        /* The constructed AVL Tree would be
             30
            /  \
          20   40
         /  \     \
        10  25    50
        */
        tree.printByLevel(tree.root, 5);
    }
}