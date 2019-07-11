package sergii_danilov.Lesson6;

public class SumOfNumber {
    public static void main(String[] args) {

        int a = 1234564;

        System.out.print("Sum of numbers "+a+" is ");
        System.out.print(new SumOfNumber().sum(a, 0));
    }

    public int sum(int a, int sum) {

        if (a == 0){
            return sum;
        }

        int b;
        if (a >= 0){
            b = a%10;
            sum = sum +b;
        }

        a = (int) (a/10);

        return sum(a,sum);
    }

}
