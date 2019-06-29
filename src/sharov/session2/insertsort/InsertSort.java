package src.sharov.session2.insertsort;

import java.util.Arrays;

public class InsertSort {
  public static void main(String[] args) {
    int[] ar = new int[]{3, 1, 8, 5, 3, 1, 0, -7, 213, 43, 80, -32, -25, 96, 14};
    System.out.println(Arrays.toString(ar));
    insertSort(ar);
    System.out.println(Arrays.toString(ar));
  }

  public static void insertSort(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }
    for (int sorted = 0; sorted < array.length; sorted++) {
      for (int unsorted = sorted + 1; unsorted > 0 && unsorted < array.length; unsorted--) {
        if (array[unsorted] < array[unsorted - 1]) {
          swap(array, unsorted, unsorted - 1);
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
