package sergii_danilov.lesson2;

import java.util.Arrays;

public class CountSortInt {

    public static void main(String[] args) {
        int[] b = {0,2,1,5,2,3,3,2,3,1,4,5,6,6,3,2,4,1};
        int[] k = new int[7];
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            k[b[i]]++;
        }

        System.out.println(Arrays.toString(k));

        int n = 0;
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i]; j++) {
                b[n] = i;
                n++;
            }
        }

        System.out.println(Arrays.toString(b));

    }
}
