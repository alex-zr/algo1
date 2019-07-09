package roshupkin_nikita.partialOrdering;

import java.util.Arrays;

public class PartialOrdering {
    public static void main(String[] args) {
        int[] vector = new int[]{9,3,7,4,1,7,15,8,5,6};
        partialSort(vector);
        System.out.println(Arrays.toString(vector));
    }
    
    public static int[] partialSort(int[] vector) {
        int midlle = vector[vector.length / 2];
        int leftCounter = 0;
        int rightCounter = vector.length-1;
        while (leftCounter < rightCounter){
            while (midlle >= vector[leftCounter]){
                leftCounter++;
            }
            while (midlle < vector[rightCounter]) {
                rightCounter--;
            }
             if (leftCounter<rightCounter){
                 swap(vector, leftCounter,rightCounter);
             }

        }
        return vector;
    }

    private static void swap(int[] vector, int leftIdx, int rightIdx) {
        int tmp = vector[rightIdx];
        vector[rightIdx] = vector[leftIdx];
        vector[leftIdx] = tmp;
    }
}
