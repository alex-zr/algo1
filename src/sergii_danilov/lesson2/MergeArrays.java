package sergii_danilov.lesson2;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {


        int[] b = {0,2,1,5,2,3,3,2,3,1,4,5,6,6,3,2,4,1};
        int[] k = {10,12,0,1,5,8,3,4,2,1,0,8};
        int[] result = new int [b.length+k.length];
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(k));

        Arrays.sort(b);
        Arrays.sort(k);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(k));

        int i = 0;
        int j = 0;
        for (int n = 0; n < result.length ; n++) {

            if (i > b.length -1){
                result[n] = k[j];
                j++;
            }else {
                if (j > k.length - 1) {
                    result[n] = b[i];
                    i++;
                }else{
                    if (b[i] < k[j]) {
                        result[n] = b[i];
                        i++;
                    }else {
                        if (b[i] > k[j]) {
                            result[n] = k[j];
                            j++;
                        }else {
                            if (b[i] == k[j]) {
                                result[n] = k[j];
                                j++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
