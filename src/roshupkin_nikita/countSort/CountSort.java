package roshupkin_nikita.countSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountSort {
    public static void main(String[] args) {
        int[] vector = new int[]{1,3,6,2,2,3,3,6,6,1,1,3,3,6,1,3,2,6,1};
        countSort(vector);
        System.out.println(Arrays.toString(vector));
    }
    public static int[] countSort(int[] vector){
        Map<Integer, Integer> map = new TreeMap<>();
        int count=0;
        int quantity =1;
        int tmp = 0;
        while (count < vector.length) {

            if (!map.containsKey(vector[count])) {
                map.put(vector[count], 1 );
            }
            else if (map.containsKey(vector[count])) {
               tmp = map.get(vector[count]);
               tmp++;
               map.put(vector[count],tmp);
            }
            count++;
        }
        Set entrys =  map.entrySet();


        return vector;
    }
}
