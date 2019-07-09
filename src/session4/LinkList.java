package session4;

public class LinkList {
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

    public void addTail(int el) {
        final Node newNode = new Node(el, null);
        if (head == null) {
            head = newNode;
        } else {
            // TODO add to tail
            Node nextEl = head;
            while (nextEl.next != null) {
                nextEl = nextEl.next;
            }
            nextEl.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextEl = head;
        while (nextEl != null) {
            stringBuilder.append(nextEl.value);
            stringBuilder.append("->");
            nextEl = nextEl.next;
        }
        return stringBuilder.toString();
    }

}
