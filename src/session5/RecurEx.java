package session5;

public class RecurEx {
    public static void main(String[] args) {
        new RecurEx().infinit(4);
        //for(;;);
    }

    public void infinit(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Infinit");
        //
        infinit(n - 1);

        System.out.println("exit");
    }
}
