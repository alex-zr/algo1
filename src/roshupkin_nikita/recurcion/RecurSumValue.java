package roshupkin_nikita.recurcion;

public class RecurSumValue {
    public static void main(String[] args) {
        sumValue(12345,0);
        System.out.println(sumValue(12345, 0));
    }
    public static long sumValue(long value, long sum) {
          sum = sum + (value%10);
        if(value % 10 ==0) {
            return sum;
        }
        long sumSum = sumValue((value - (value%10)) /10, sum);
        return sumSum;
    }
}
