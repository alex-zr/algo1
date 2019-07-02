package roshupkin_nikita.vectorList;

public class VectorList {
    private int[] vector;
    public static final int SIZE = 16;
    private int length = 0;
    public VectorList() {
        this.vector = new int[SIZE];
    }
    public int get(int index) {
        checkIndex(index);
        return vector[index];
    }
    private void checkIndex(int index) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
    }
    public void add(int element) {
        ensureCapacity();
        vector[length ++]= element;
    }
    public void remove(int index) {
        System.arraycopy(vector, index+1, vector, index, length - 1);
        length--;

    }

    private void ensureCapacity() {
        if (length >= vector.length) {
            int[] newVector = new int[vector.length + SIZE];
            System.arraycopy(vector, 0, newVector, 0, vector.length);
            vector = newVector;
        }
    }
}