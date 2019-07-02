package Mariia.Binary;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] line = {2, 4, 5, 6, 7, 7, 10, 15, 22, 111};
        System.out.println(Arrays.toString(line));
        int i = binarySearch(line,10);
        System.out.println(i);
        System.out.println(line[i]);
    }

    private static int binarySearch(int[] line, int a) {
        int k = 0;
        int t = line.length - 1;
        int m;
        if (a < line[k]) return k;
        if (a > line[t]) return t;
        while ((t - k) > 1) {
            m = (k + t) / 2;
            if (line[m] == a) return m;
            if (line[m] < a) {
                k = m;
            } else {
                t = m;
            }
        }
        return k;
    }
}