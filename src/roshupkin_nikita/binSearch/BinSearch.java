package roshupkin_nikita.binSearch;


public class BinSearch {
    public static void main(String[] args) {
        int[] vector = new int[]{1,3,5,7,9,13,15,16,22,35,44,47};
        int serchValue = 1;

        System.out.println("Индекс вхождения искомого элемента :" + binSearch(vector,serchValue));
    }
    public static int binSearch(int[] vector, int serchValue) {
        int left = 0;
        int right = vector.length -1;

        while (left <= right) {
            int midlleValue = (left + right) / 2;
            if(vector[midlleValue] == serchValue) {
                return midlleValue;
            }
            else if (vector[midlleValue] > serchValue) {
                right = midlleValue - 1;
            }
            else if (vector[midlleValue] < serchValue) {
                left = midlleValue +1;
            }
        }
        return -1;
    }
}
