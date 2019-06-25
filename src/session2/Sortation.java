package session2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sortation {
    public static void main(String[] args) {
        Object[] vector = {3,2,4,1};
        Comparator revComp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if (i1 < i2) {
                    return 1;
                } else if (i1 > i2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Arrays.sort(vector, revComp);
        System.out.println(Arrays.toString(vector));
    }
}
