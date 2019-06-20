package session1;

public class Summator {
    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1,2,3,4}));
    }

    private static long sumArray(int[] vector) {
        long sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        return sum;
    }
}
