package src.sharov.session2.selectionsort;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] ar = {3, 1, 0, -4, 8, 12, 0, 7, 34, -123, 5, 8};
    selectionSort(ar);
    System.out.println(Arrays.toString(ar));
  }

  public static void selectionSort(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }
    for (int leftIndex = 0; leftIndex < array.length; leftIndex++) {
      int minValueIndex = leftIndex;

      for (int rightIndex = leftIndex + 1; rightIndex < array.length; rightIndex++) {
        if (array[rightIndex] < array[minValueIndex]) {
          minValueIndex = rightIndex;
        }
      }
      swap(array, leftIndex, minValueIndex);
    }
  }

  private static void swap(int[] array, int biggerValueIndex, int minValueIndex) {
    if(biggerValueIndex == minValueIndex) {
      return;
    }
    int temp = array[biggerValueIndex];
    array[biggerValueIndex] = array[minValueIndex];
    array[minValueIndex] = temp;
  }
}
