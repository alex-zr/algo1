package roshupkin_nikita.insertSort;

import java.util.Arrays;

public class ShallSort {
        public static void main(String[] args) {
            int[] vector = {4,3,2,1,5,8,9,3,4,7,5,4};
            System.out.println(Arrays.toString(vector));
            shallSortr(vector);
            System.out.println(Arrays.toString(vector));
        }

        public static void shallSortr(int[] vector) {

            for (int i =vector.length/2; i > 0; i/=2) {
              for (int k = i; k < vector.length; k++) {
                 for (int j = k-i; j >=0; j= j-i) {
                    if (vector[j+i] >= vector[j]) {
                        break;
                    }
                    else {
                        swap(vector, j , j+ i);
                    }
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


