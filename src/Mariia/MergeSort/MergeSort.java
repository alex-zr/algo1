package Mariia.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] line1 = {2, 4, 5, 6, 8};
        System.out.println(Arrays.toString(line1));
        int[] line2 = {3, 6, 7, 8, 9, 10, 23};
        System.out.println(Arrays.toString(line2));
        int[] line3 = merge(line1, line2);
        System.out.println(Arrays.toString(line3));
    }

    private static int[] merge(int[] line1, int[] line2) {
        int[] line3 = new int[line1.length + line2.length];
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i1 < line1.length && i2 < line2.length) {
            if (line1[i1] < line2[i2]) {
                line3[i3] = line1[i1];
                ++i3;
                ++i1;
            } else {
                line3[i3] = line2[i2];
                ++i3;
                ++i2;
            }
        }
        while (i1 < line1.length) {
            line3[i3] = line1[i1];
            ++i3;
            ++i1;
        }
        while (i2 < line2.length) {
            line3[i3] = line2[i2];
            ++i3;
            ++i2;
        }
        return line3;
    }
}