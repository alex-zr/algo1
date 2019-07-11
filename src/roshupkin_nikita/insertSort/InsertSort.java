package roshupkin_nikita.insertSort;

import java.util.Arrays;

public class InsertSort {
        public static void main(String[] args) {
            int[] vector = {4,3,2,1,5,8,9,3,4,7,5,4};
            System.out.println(Arrays.toString(vector));
            sortBubble(vector);
            System.out.println(Arrays.toString(vector));
        }

        public static void sortBubble(int[] vector) {
            int count =2;
            for (int i = 1; i < vector.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (vector[j - count] > vector[j]) {
                        swap(vector, j - count, j);
                    }
                }
                count++;
            }
        }

        private static void swap(int[] vector, int leftIdx, int rightIdx) {
            int tmp = vector[rightIdx];
            vector[rightIdx] = vector[leftIdx];
            vector[leftIdx] = tmp;
        }
}


