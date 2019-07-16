package roshupkin_nikita.partialOrdering;

import java.util.Arrays;

public class PartialOrdering {
    public static void main(String[] args) {
        int[] vector = new int[]{9,7,4,1,7,10,15,6,12,8,6};
        System.out.println(Arrays.toString(vector));
        partialSort(vector);
        System.out.println(Arrays.toString(vector));
    }
    
    public static int[] partialSort(int[] vector) {
        int midlle = vector[vector.length / 2];
        int leftIndex = 0;
        int rightIndex = vector.length-1;

        while (leftIndex < rightIndex){
            while (vector[leftIndex] < midlle){
                leftIndex++;
            }
            while (vector[rightIndex] > midlle) {
                rightIndex--;
            }
             if (leftIndex <= rightIndex){
                 swap(vector, leftIndex, rightIndex);
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
