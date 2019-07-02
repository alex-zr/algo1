package session4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class VectorListGeneric<E> implements List<E> {
    private E[] vector; // основной массив
    public static final int SIZE = 16; // размер массива
    private int length = 0; // виртуальная длинна
    public VectorListGeneric() {
        this.vector = (E[]) new Object[SIZE]; // создание реального массива
    }
    public E get(int index) {
        checkIndex(index); // проверка на выход за границы
        return vector[index];
    }

    @Override
    public E set(int index, E element) {
        // TODO
        return null;
    }

    @Override
    public void add(int index, E element) {
        // TODO
    }

    @Override
    public E remove(int index) {
        // TODO
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // TODO
        return false;
    }

    @Override
    public int indexOf(Object o) {
        // TODO
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int size() {
        // TODO
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // TODO
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E el) {
        length++;
        ensureCapacity();
        vector[length - 1] = el;
        return true;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        // TODO
    }

/*    public void remove(E el) {
        length--;
        ensureCapacity();
        vector[length] = el;
    }*/

    @Override
    public String toString() {
        // TODO
        return Arrays.toString(vector);
    }

    private void ensureCapacity() {
        if (length >= vector.length) {
            E[] newVector = (E[]) new Object[vector.length + SIZE];
            System.arraycopy(vector, 0, newVector, 0, vector.length);
            vector = newVector;
        }
    }

    private void checkIndex(int index) { if (index < 0 || index > length) {
        throw new IndexOutOfBoundsException(String.valueOf(index)); }
    }


}