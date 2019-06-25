package session2;

/*
Модифицировать метод сортировки пузырьком для задания порядка сортировки
через не параметризированный компаратор, передаваемый в качестве аргумента
 */

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSortation {
    public static void main(String[] args) {
        Comparator revComp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        };

        Integer[] vector = {2,3,2,4};
        System.out.println(Arrays.toString(vector));
        sortBubble(vector, revComp);
        System.out.println(Arrays.toString(vector));
    }

    public static void sortBubble(Integer[] vector, Comparator comp) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                // TODO use comparator
                //if (vector[j] > vector[j + 1]) {
                if (comp.compare(vector[j], vector[j + 1]) > 0) {
                    swap(vector, j, j + 1);
                }
            }
        }
    }

    private static void swap(Integer[] vector, int leftIdx, int rightIdx) {
        int tmp = vector[rightIdx];
        vector[rightIdx] = vector[leftIdx];
        vector[leftIdx] = tmp;
    }
}
