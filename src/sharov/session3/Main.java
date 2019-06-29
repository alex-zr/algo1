package src.sharov.session3;

public class Main {
  public static void main(String[] args) {

    VectorList list = new VectorList();
    for (int i = 1; i <= 16; i++) {
      list.add(i);
      System.out.println(list.get(i - 1));
    }
    list.add(16);
    System.out.println(list.get(16));
    System.out.println(list.size());
  }
}
