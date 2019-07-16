package roshupkin_nikita.countSort;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountSort {
    public static void main(String[] args) {
        int[] vector = new int[]{1,3,6,2,2,3,3,6,6,1,1,3,3,6,1,3,2,6,1};
        countSort(vector);
        System.out.println(Arrays.toString(vector));
    }
    public static int[] countSort(int[] vector){
        Map<Integer, Integer> map = new TreeMap<>();
        int index = 0;
        int number = 0;
        while (index < vector.length) {

            if (!map.containsKey(vector[index])) {
                map.put(vector[index], 1 );
            }
            else  {
               number = map.get(vector[index]);
               number++;
               map.put(vector[index],number);
            }
            index++;
        }
        int printedNumber = 0;
        for (Map.Entry entry: map.entrySet()) {
            int value = (int) entry.getKey();
            int numberValues = (int) entry.getValue();
            for (int i = numberValues+printedNumber -1; i >= printedNumber; i--) {
                vector[i] = value;
            }
            printedNumber = numberValues + printedNumber;
        }

        return vector;
    }
}
