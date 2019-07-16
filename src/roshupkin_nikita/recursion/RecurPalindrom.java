package roshupkin_nikita.recursion;
/*Написать рекурсивный метод, который
определяет, является ли переданная в метод
строка палиндромом
 */

public class RecurPalindrom {
    public static void main(String[] args) {
        String string = "1435311";
        System.out.println(ifPalindrom(string, 0));
    }
    public static boolean ifPalindrom (String string, int index) {
        if (string.charAt(index) != string.charAt(string.length()-1-index)) {
            return false;
        }
        if (index == string.length()/2) {
            return true;
        }

       return ifPalindrom(string, index +1);

    }
}
