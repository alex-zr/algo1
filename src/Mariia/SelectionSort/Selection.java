package Mariia.SelectionSort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] line = {2, 4, 1, 6, 8};
        System.out.println(Arrays.toString(line));
        selectionSort(line);
        System.out.println(Arrays.toString(line));
    }

    private static void selectionSort(int[] line) {
        for (int i = 0; i < line.length - 1; i++) {
            for (int j = i + 1; j < line.length; j++) {
                if (line[i] > line[j]) {
                    swap(line, i, j);
                }
            }
        }
    }

    private static void swap(int[] line, int leftIdx, int rightIdx) {
        int tmp = line[rightIdx];
        line[rightIdx] = line[leftIdx];
        line[leftIdx] = tmp;
    }
}