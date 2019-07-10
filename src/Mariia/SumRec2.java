package Mariia;

public class SumRec2 {
    public static void main(String[] args) {
        new SumRec2().numbers(8);
        System.out.println(new SumRec2().sumRec(8));
    }

    public void numbers(int n) {
        if (n == 0) {
            return;
        }
        numbers(n - 1);
        System.out.println(n);
    }

    public int sumRec(int i){
        if (i == 0) {
            return 0;
        }
        return i + sumRec(i - 1);
    }
}