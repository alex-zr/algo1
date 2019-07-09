package sergii_danilov.Lesson5;

public class RecurtionSimple {
    public static void main(String[] args) {

        new RecurtionSimple().printN(5);

        int k = new RecurtionSimple().sumN(5);
        System.out.println("Sum =" +k);
    }

    public void printN(int n) {
        if (n == 0) {
            return;
        }
        printN(n - 1);
        System.out.println(n);
    }

    public int sumN(int n) {
        if (n == 0) {
            return 0;
        }
        return (n+ sumN(n-1));
    }
}
