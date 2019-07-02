package session3;

import java.util.Arrays;

public class VectorList {
    private int[] vector; // основной массив
    public static final int SIZE = 16; // размер массива
    private int length = 0; // виртуальная длинна
    public VectorList() {
        this.vector = new int[SIZE]; // создание реального массива
    }
    public int get(int index) {
        checkIndex(index); // проверка на выход за границы
        return vector[index];
    }

    public void add(int el) {
        ensureCapacity();
        vector[length++] = el;
    }

    public void remove(int el) {
        // TODO
    }

    @Override
    public String toString() {
        return Arrays.toString(vector);
    }

    private void ensureCapacity() {
        if (length >= vector.length) {
            int[] newVector = new int[vector.length + SIZE];
            System.arraycopy(vector, 0, newVector, 0, vector.length);
            vector = newVector;
        }
    }

    private void checkIndex(int index) { if (index < 0 || index > length) {
        throw new IndexOutOfBoundsException(String.valueOf(index)); }
    }


}