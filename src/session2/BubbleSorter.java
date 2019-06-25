package session2;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] vector = {4,3,2,1};
        System.out.println(Arrays.toString(vector));
        sortBubble(vector);
        System.out.println(Arrays.toString(vector));
    }

    public static void sortBubble(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    swap(vector, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] vector, int leftIdx, int rightIdx) {
        int tmp = vector[rightIdx];
        vector[rightIdx] = vector[leftIdx];
        vector[leftIdx] = tmp;
    }
}
