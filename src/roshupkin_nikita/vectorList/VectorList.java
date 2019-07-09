package roshupkin_nikita.vectorList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class VectorList<E> implements List<E> {
    private E[] vector;
    public static final int SIZE = 16;
    private int length = 0;

    public VectorList() {
        this.vector = (E[]) new Object[SIZE];
    }

    public E get(int index) {
        checkIndex(index);
        return vector[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
    }

    @Override
    public E set(int index, E element) {
        vector[index] = element;
        return element;
    }

    @Override
    public void add(int index, E element) {
        ensureCapacity();
        vector[index] = element;
        length++;
    }

    @Override
    public E remove(int index) {
        E removeValue = vector[index];
        System.arraycopy(vector, index+1, vector, index, length - index );
        length--;
        return removeValue;
    }

    @Override
    public boolean remove(Object o) {
        int counter=0;
        while (vector[counter] != o || counter < length){
            counter++;
            if (vector[counter] == o) {
                System.arraycopy(vector, counter+1, vector, counter, length - counter );
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        int count =0;
        while (vector[count] != o || count < length) {
            count++;
            if (vector[count] == o){
                return count;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int count = 0;
        int lastIndex = 0;
        while (count < length) {
            count++;
            if (vector[count] == o){
                count = lastIndex;
            }
            return lastIndex;
        }
        return -1;
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
        return length;
    }

    @Override
    public boolean isEmpty() {
        if (length>0){
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        int counter =0;
        while (counter < length) {
            counter++;
           if (vector[counter] == o) {
               return true;
           }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
         class MyIterator implements Iterator {

            private int counter;

             public void setCounter(int counter) {
                 this.counter = counter;
             }
             @Override
             public boolean hasNext() {
                 if (counter <= length-1) {
                     return true;
                 }
                 return false;
             }
             @Override
             public E next() {
                 E next = vector[counter];
                 if (hasNext()){
                     counter++;
                 }

                 return next;
             }
             @Override
             public void remove() {
                     System.arraycopy(vector, counter, vector, counter-1, length -counter+1 );
                     length--;
                     counter=counter-1;

             }

         }

         return new MyIterator();
    }

    @Override
    public E[] toArray() {
        E[] arrayVector = (E[]) new Object[length];
        System.arraycopy(arrayVector,0, vector,0, length);
        return arrayVector;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E element) {
        length++;
        ensureCapacity();
        vector[length - 1] = element;
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
        E[] clearVector = (E[]) new Object[0];
        vector = clearVector;
        length = 0;
    }

    @Override
    public String toString() {
        E[] vectorS = (E[]) new Object[length];
        System.arraycopy(vector,0,vectorS,0,length);
        return Arrays.toString(vectorS);
    }
    private void ensureCapacity() {
        if (length >= vector.length) {
            E[] newVector = (E[]) new Object[vector.length + SIZE];
            System.arraycopy(vector, 0, newVector, 0, vector.length);
            vector = newVector;
        }
    }
    }
