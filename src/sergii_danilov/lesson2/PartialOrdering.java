package sergii_danilov.lesson2;

import java.util.Arrays;

public class PartialOrdering {
    public static void main(String[] args) {
        int[] b = {0,2,1,5,2,7,9,3,3,2,3,1,4,5,6,6,3,2,4,1,7,10,11,8};
        int[] c = new int [b.length];
        System.out.println(Arrays.toString(b));

        int mediana = b[3];
        System.out.println("mediana = " + mediana);
        int jBegim = 0;
        int jEnd = b.length-1;

        int i = 0;
        for (i = 0; ((jBegim != jEnd)); i++) {
//            System.out.println("jBegim="+jBegim+ " jEnd=" +jEnd+"  " + Arrays.toString(c));
            if (b[i]<=mediana){
                c[jBegim] = b[i];
                jBegim++;
            }else{
                c[jEnd] = b[i];
                jEnd--;
            }
        }

        if (jBegim==jEnd) {
            c[jBegim] = b[i];
        }

        System.out.println(Arrays.toString(c));

    }
}
