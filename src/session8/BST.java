package session8;

import java.util.LinkedList;
import java.util.Queue;

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

    public void print(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
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
                if (current != null && value > current.value) {
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

    public boolean contains(int value) {
        TreeNode current = root;
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

    public boolean delete(int id){
        TreeNode parent = root;
        TreeNode current = root;
        boolean isLeftChild = false;
        while(current.value!=id){
            parent = current;
            if(current.value>id){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if(current ==null){
                return false;
            }
        }
        //if i am here that means we have found the node
        //Case 1: if node to be deleted has no children
        if(current.left==null && current.right==null){
            if(current==root){
                root = null;
            }
            if(isLeftChild ==true){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }
        //Case 2 : if node to be deleted has only one child
        else if(current.right==null){
            if(current==root){
                root = current.left;
            }else if(isLeftChild){
                parent.left = current.left;
            }else{
                parent.right = current.left;
            }
        }
        else if(current.left==null){
            if(current==root){
                root = current.right;
            }else if(isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            }
        }else if(current.left!=null && current.right!=null){

            //now we have found the minimum element in the right sub tree
            TreeNode successor	 = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else{
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public TreeNode getSuccessor(TreeNode deleleNode){
        TreeNode successsor =null;
        TreeNode successsorParent =null;
        TreeNode current = deleleNode.right;
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
        //check if successor has the right child, it cannot have left child for sure
        // if it does have the right child, add it to the left of successorParent.
//		successsorParent
        if(successsor!=deleleNode.right){
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        return successsor;
    }

    public TreeNode deleteRec(TreeNode node, int value) {
        // Основной случай рекурсии, когда поддерево пустое
        if (node == null) {
            return node;
        }

        if (value < node.value) {
            node.left = deleteRec(node.left, value);
        } else if (value > node.value) {
            node.right = deleteRec(node.right, value);
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
            node.right = deleteRec(node.right, node.value);
        }

        return node;
    }

    private int minimumValue(TreeNode node) {
        if (node.left == null) {
            return node.value;
        }
        return minimumValue(node.left);
    }

    int minValue(TreeNode root) {
        int minv = root.value;
        while (root.left != null) {
            minv = root.left.value;
            root = root.left;
        }
        return minv;
    }


    public void printByLevel(TreeNode root, int maxLevel) {
        Queue<TreeNode> prev = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();
        Queue<TreeNode> tmp;
        boolean isLevelNull = false;
        int gap = (int) Math.pow(2, maxLevel);
        prev.add(root);

        while (maxLevel > 0 && !isLevelNull && !prev.isEmpty()) {
            isLevelNull = true;
            System.out.print(String.format("%" + gap + "s", " "));
            while (!prev.isEmpty()) {
                TreeNode node = prev.poll();
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

    private String across(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>(); // создать новую очередь
        queue.offer(node); // поместить в очередь первый уровень
        while (queue.size() != 0) { // пока очередь не пуста
            //если у текущей ветви есть листья, их тоже добавить в очередь
            final TreeNode current = queue.peek();
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
            //извлечь из очереди последний элемент
            sb.append(current.value + " ");
            queue.poll();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(3);
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(0);

        System.out.println("By Level");
        tree.printByLevel(tree.root, 6);
        tree.delete(3);
        tree.printByLevel(tree.root, 6);
        System.out.println(tree.across(tree.root));
    }
}

