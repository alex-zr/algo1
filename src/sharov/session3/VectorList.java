package sharov.session3;

import java.util.Arrays;

public class VectorList {
  private int[] vector;
  public static final int DEFAULT_SIZE = 16;
  private int length;

  public VectorList() {
    this.vector = new int[DEFAULT_SIZE];
  }

  public int get(int index) {
    validateIndex(index);
    return vector[index];
  }

  public void add(int element) {
    if (length >= vector.length) {
      increaseArraySize();
    }
    vector[length++] = element;
  }

  private void increaseArraySize() {
    this.vector = Arrays.copyOf(this.vector, this.vector.length * 2);
  }

  private void validateIndex(int index) {
    if (index < 0 || index >= length) {
      throw new IndexOutOfBoundsException("The index is " + index);
    }
  }

  public int size() {
    return length;
  }
}
