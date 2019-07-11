package session7;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] vector = {3,4,6,2,4,5,1};
        new ShellSort().insertionSort(vector);
        System.out.println(Arrays.toString(vector));
    }

    public void insertionSort(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (vector[j] < vector[j - 1]) {
                    int tmp = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = tmp;
                }
            }
        }
    }
}
