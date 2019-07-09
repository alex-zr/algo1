package roshupkin_nikita.linkList;

public class LinkList {
    private class Node {
        int value;
        Node next;
        public Node(int value,Node next) { this.value = value;this.next = next; }
        public void setNext(Node next) { this.next = next;}
        @Override public String toString() {return String.valueOf(value);}
    }

    Node head = null;


    public int get(int index) {
        int indexCounter=0;
        Node next = head;
        while (indexCounter != index){
            indexCounter++;
            next = next.next;
        }
        return next.value;
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
