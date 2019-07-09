package session6;

import session4.LinkList;

public class LinkedListRecur {
    private class Node {
        int value;
        Node next;
        public Node(int value, Node next) { this.value = value;this.next = next; }
        public void setNext(Node next) { this.next = next;}
        @Override public String toString() {return String.valueOf(value);}
    }

    private Node head = null;
    private int length = 0;

    public int get(int index) {

        return 0;
    }

    public void addHead(int el) {
        final Node newNode = new Node(el, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(int el) {

    }

    private void add(int el, Node node) {

    }

    @Override
    public String toString() {
        return toString(head);
    }

    private String toString(Node node) {
        if (node.next == null) {
            return String.valueOf(node.value);
        }

        return node.value + "->" + toString(node.next);
    }
}
