package roshupkin_nikita.recursion;
/** Написать рекурсивный метод, который выводит
 последовательность чисел от N до K
 */

public class RecurNK {
    public static void main(String[] args) {

        recurNK(1,5);
    }
    public static void recurNK (int n, int k) {
        if (n == k+1){
            return ;
        }
        System.out.println(n);

       recurNK(n+1,k);
    }

}
