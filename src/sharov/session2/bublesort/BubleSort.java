package sharov.session2.bublesort;

import java.util.Arrays;

public class BubleSort {
  public static void main(String[] args) {
    int[] ar = new int[]{5, 2, 4, 1, 0, -5, 3, 8};
    int[] ar2 = new int[]{1, 100, -4, 111, 47};
    sort(ar);
    System.out.println(Arrays.toString(ar));
    sort(ar2);
    System.out.println(Arrays.toString(ar2));

  }

  @SuppressWarnings("Duplicates")
  public static void sort(int[] array) {
    if (array == null || array.length == 0 || array.length == 1) {
      return;
    }

    for (int external = 0; external < array.length; external++) {
      for (int internal = 0; internal < array.length - external - 1; internal++) {
        if (array[internal] > array[internal + 1]) {
          swap(array, internal, internal + 1);
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
