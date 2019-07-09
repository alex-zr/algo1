package roshupkin_nikita.DoubleLinkList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoubleLinkList<E> implements List<E> {
    Node tail = null;
    Node head = null;
    int size = 0;

    private class Node {
        E element;
        Node next;
        Node prev;


        public Node( Node prev, E element, Node next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return String.valueOf(element);
        }
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        class MyIterator implements Iterator {
            private Node counter;

            public void setCounter(Node counter) {
                this.counter = counter;
            }

            @Override
            public boolean hasNext() {
                if (head !=null) {
                    Node nextEl = head;
                    while (nextEl.next != null) {
                        return true;
                    }
                }
                    return false;
            }

            @Override
            public Node next() {
                counter = head;
                if (hasNext()) {
                    counter = counter.next;

                }

                return counter;
            }

            @Override
            public void remove() {
                Node prev = counter.prev;
                Node next = counter.next;
                prev.next = next;
                next.prev = prev;
            }
        }
        return new  MyIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E element) {
        final Node newNode = new Node(null, element, null);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            Node nextEl = head;
            while (nextEl.next != null) {
                nextEl = nextEl.next;
            }
            nextEl.next = newNode;
            newNode.prev = nextEl;
            tail = newNode;
            size++;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        int indexCounter = 0;
        Node next = head;
        while (indexCounter != index) {
            indexCounter++;
            next = next.next;
        }
        return next.element;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {


    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextEl = head;
        while (nextEl != null) {
            stringBuilder.append(nextEl.element);
            stringBuilder.append("->");
            nextEl = nextEl.next;
        }
        return stringBuilder.toString();
    }

}