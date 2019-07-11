package roshupkin_nikita.recursion;

public class RecurSum {
    public static void main(String[] args) {


        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    public static int sum (int value, int counter, int sumVal) {
        sumVal=sumVal+value;
        if (value == counter) {
            return sumVal;
        }
        int sumSum=sum(value+1,counter, sumVal);
        return sumSum;
    }
}
