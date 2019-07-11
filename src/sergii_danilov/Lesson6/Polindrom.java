package sergii_danilov.Lesson6;

import java.util.Arrays;

public class Polindrom {
    public static void main(String[] args) {

        String a;
        String a1 = "abcdfeggefdcba";
        String a2 = "abcdfeg4gefdcba";
        String a3 = "abcd5feggefdcba";

        a = a1;
        System.out.println(a);
        System.out.println(new Polindrom().checkPolindrom(a, 0, a.length()-1, true)+" polindrom");
        System.out.println();

        a = a2;
        System.out.println(a);
        System.out.println(new Polindrom().checkPolindrom(a, 0, a.length()-1, true)+" polindrom");
        System.out.println();

        a = a3;
        System.out.println(a);
        System.out.println(new Polindrom().checkPolindrom(a, 0, a.length()-1, true)+" polindrom");
        System.out.println();

    }

    public boolean checkPolindrom(String a, int i, int k, boolean check) {

        if (check == false){
            return check;
        }

        if (i >= k){
            return check;
        }

        char up = a.charAt(i);
        char down = a.charAt(k);

//        System.out.println("Up="+up+"    "+ "Down ="+down);

        if ((up == down)&&(check==true)){
            check = true;
        }else{
            check = false;
        }

        return checkPolindrom(a, i+1, k-1, check);
    }

}
