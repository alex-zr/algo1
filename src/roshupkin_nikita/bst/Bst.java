package roshupkin_nikita.bst;

import java.util.LinkedList;
import java.util.Queue;

public class Bst {
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
            if (this.root == null) {
                return false;
            }
            TreeNode current = this.root;
            while (current != null) {
                if (value > current.value ) {
                    current = current.right;
                }
                if(value < current.value) {
                    current = current.left;
                }
                return true;
            }
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
        public int size() {
            return size;
        }


        public void insert(int value) {
            TreeNode newNode = new TreeNode(value, null, null);
            if (this.root == null) {
                this.root = newNode;
                size++;
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

 }


