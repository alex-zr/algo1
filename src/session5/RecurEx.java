package session5;

public class RecurEx {
    public static void main(String[] args) {
        //new RecurEx().infinit(4);
        //new RecurEx().print(4); // 4 3 2 1
//        new RecurEx().printRevert(4, 0); // 1 2 3 4
        System.out.println(new RecurEx().fib(6));
        //for(;;);
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        final int fib2 = fib(n - 2);
        final int fib1 = fib(n - 1);
        return fib2 + fib1;
    }

    public void printRev(int n) {
        printRevert(n, 0);
    }
    private void printRevert(int n, int i) {
        if (i == n) {
            return;
        }
        System.out.println(i + 1);
        printRevert(n, i + 1);
    }

    public void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
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
