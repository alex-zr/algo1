package src.sharov.session2.insertsort;

import java.util.Arrays;
import java.util.Comparator;

public class InsertSort {
  public static void main(String[] args) {
    int[] ar = new int[]{3, 1, 8, 5, 3, 1, 0, -7};
    System.out.println(Arrays.toString(ar));
    insertSort(ar, Comparator.reverseOrder());
    System.out.println(Arrays.toString(ar));
  }

  public static void insertSort(int[] array, Comparator<Integer> comparator) {
    if (array == null || array.length <= 1) {
      return;
    }

    for (int sortedIndex = 0; sortedIndex < array.length; sortedIndex++) {
      for (int unsortedIndex = sortedIndex + 1; unsortedIndex > 0 && unsortedIndex < array.length; unsortedIndex--) {
        if (comparator.compare(array[unsortedIndex], array[unsortedIndex - 1]) > 0) {
          swap(array, unsortedIndex, unsortedIndex - 1);
        } else {
          break;
        }
      }
    }
  }

  private static void swap(int[] array, int leftIndex, int rightIndex) {
    int temp = array[leftIndex];
    array[leftIndex] = array[rightIndex];
    array[rightIndex] = temp;
  }
}
