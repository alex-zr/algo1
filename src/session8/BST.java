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

    public TreeNode deleteRec(TreeNode node, int value) {
        // Основной случай рекурсии, когда поддерево пустое
        if (node == null) {
            return node;
        }

        /* Otherwise, recur down the tree */
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
            node.value = minValue(node.right);

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

    public TreeNode delete(TreeNode root, int value) {
        if (root == null)
            return null;
        if (root.value > value) {
            root.left = delete(root.left, value);
        } else if (root.value < value) {
            root.right = delete(root.right, value);
        } else {
            // у узла оба потомков
            if (root.left != null && root.right != null) {
                // находим минимальный элемент (самый левый) у правого потомка
                // заменяем текущий элемент минимальным элементом в правом поддереве
                root.value = minimumValue(root.right);
                // удаляем минимальный элемент из правого поддерева
                delete(root.right, root.value);
            }
            // у узла только левый потомок
            else if (root.right == null) {
                root = root.left;
            }
            // у узла только правый потомок
            else if (root.left == null) {
                root = root.right;
            }
            // у узла нет потомков
            else
                root = null;
        }
        return root;
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
        tree.deleteRec(tree.root, 3);
        tree.printByLevel(tree.root, 6);
        System.out.println(tree.across(tree.root));
    }
}

