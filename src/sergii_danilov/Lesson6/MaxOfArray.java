package sergii_danilov.Lesson6;

import java.util.Arrays;

public class MaxOfArray {

    public static void main(String[] args) {

        int[] a= {1, 2, 3, 25, 48, -5, -100, 0, 5, 6, 30};

        System.out.println(Arrays.toString(a));

        System.out.println("Max of Array = " + new MaxOfArray().max(a, 0, a[0]));

    }

    public int max(int[] k, int i, int maxEl) {

        if (maxEl <= k[i]){
            maxEl = k[i];
        }
        if (i == (k.length -1)){
            return maxEl;
        }
        return max(k, i+1, maxEl);
    }


}
