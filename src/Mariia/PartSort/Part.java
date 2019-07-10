package Mariia.partSort;

import java.util.Arrays;

public class Part {
    public static void main(String[] args) {
        int[] line = {2, 4, 1, 6, 8, 8, 3, 9, 5, 11, 4, 7, 1, 4, 3, 1, 1};
        System.out.println(Arrays.toString(line));
        partSort(line);
        System.out.println(Arrays.toString(line));
    }

    private static void partSort(int[] line) {
        int k = 0;
        int t = line.length - 1;
        int c = line[line.length / 2];
        while (t > k) {
            if (line[k] > c) {
                swap(line,t,k);
                --t;
            } else {
                ++k;
            }
        }

        /* while (t > k) {
            if (line[k] >= line[c] && line[t] < line[c]) {
                swap(line, k, t);
            }
            ++k;
            --t;
        }*/

    }

    private static void swap(int[] line, int leftIdx, int rightIdx) {
        int tmp = line[rightIdx];
        line[rightIdx] = line[leftIdx];
        line[leftIdx] = tmp;
    }
}