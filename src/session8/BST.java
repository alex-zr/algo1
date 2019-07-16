package session8;

public class BST {
    TreeNode root;
    int size;

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }

    public boolean contains(int value) {
        return false;
    }

    public void print(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        print(root.left);
        print(root.right);
    }


    public void insert(int value) {
        TreeNode newNode = new TreeNode(value, null, null);
        if (this.root == null) {
            this.root = newNode;
        } else {
            TreeNode current = this.root;
            while (true) {
                if (current != null && value > current.value ) {
                    if (current.right == null) {
                        current.right = newNode;
                        size++;
                        return;
                    }
                    current = current.right;
                }
                if (current != null && value < current.value) {
                    if (current.left == null) {
                        current.left = newNode;
                        size++;
                        return;
                    }
                    current = current.left;
                }
            }
        }
    }
}

