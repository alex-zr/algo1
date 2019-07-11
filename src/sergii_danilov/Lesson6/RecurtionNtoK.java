package sergii_danilov.Lesson6;

public class RecurtionNtoK {

    public static void main(String[] args) {

        new RecurtionNtoK().print(5, 10);

    }

    public void print(int n, int k) {
        if (n >= k) {
            return;
        }else{
            System.out.println(n);
      //      print(n + 1);
        }
    }


}
