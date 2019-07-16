package sharov.session1.binarysearch;

public class BinarySearch {
  public int search(int element, int[] array) {
    if (array == null || array.length == 0) {
      return -1;
    }
    int index = array.length / 2;
    return searchInternal(element, array, index, 0, array.length);
  }

  private int searchInternal(int element, int[] array, int index, int startPosition, int endPosition) {
    if (index < 0 || index >= array.length) {
      return -1 * Math.abs(index);
    }
    if(endPosition < 0) {
      return endPosition;
    }

    if (array[index] == element) {
      return index;
    } else if (array[index] > element) {
      startPosition = 0;
      endPosition = index - 1;
    } else if (array[index] < element) {
      startPosition = index + 1;
    }
    index = (startPosition + endPosition) / 2;
    return searchInternal(element, array, index, startPosition, endPosition);
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    BinarySearch binarySearch = new BinarySearch();
    System.out.println(binarySearch.search(1, array) == 0);
    System.out.println(binarySearch.search(10, array) == 9);
    System.out.println(binarySearch.search(5, array) == 4);
    System.out.println(binarySearch.search(8, array) == 7);
    System.out.println(binarySearch.search(-15, array) == -1);
    System.out.println(binarySearch.search(15, array) == -10);
  }

}
