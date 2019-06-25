package session2;

import java.util.Arrays;

public class InsertSorter {
    public static void main(String[] args) {
        int[] vector = {4,3,2,1};
        System.out.println(Arrays.toString(vector));
        sortBubble(vector);
        System.out.println(Arrays.toString(vector));
    }

    public static void sortBubble(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            for (int j = i; j > 0; j--) {
                if (vector[j - 1] > vector[j]) {
                    swap(vector, j - 1, j);
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
