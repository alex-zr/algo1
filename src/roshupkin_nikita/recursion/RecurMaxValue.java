package roshupkin_nikita.recursion;
/*Написать рекурсивный метод, который возвращает
наибольшее значение в массиве
 */

public class RecurMaxValue {
    public static void main(String[] args) {
        int[] vector = new int[]{6,13,76,9,32,98,65,92};
        System.out.println(getMaxValue(vector,1));
    }
    public static int getMaxValue (int[] vector, int index ) {
        int maxValue = 0;
        if (vector[index-1] < vector[index]){
            maxValue = vector[index];
        }
        if ( index == vector.length-1) {
            return maxValue;
        }
        int res = getMaxValue(vector,index+1);
        if (res < maxValue){
            res = maxValue;
        }

        return  res;
    }
}
