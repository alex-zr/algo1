package roshupkin_nikita;

import static roshupkin_nikita.countSort.CountSort.countSort;
import static roshupkin_nikita.insertSort.InsertSorter.insertSort;

public class ComparisonSorts {
    public static void main(String[] args) {
        int[] vectorTen = new int[]{2,5,7,9,21,3,56,72,9,60};
        int[] vectorHun = new int[100];
        int[] vectorThou = new int[1000];
        int[] vectorTenThou = new int[10000];
        for (int i = 0; i < vectorHun.length; i++) {

            vectorHun[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < vectorThou.length; i++) {



            vectorThou[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < vectorTenThou.length; i++) {
            vectorTenThou[i] = (int) (Math.random() * 1000);
        }

        long preTime = System.currentTimeMillis();

        countSort(vectorTen.clone());
        long postTime = System.currentTimeMillis();
        long time = postTime - preTime;
        System.out.println(time);
        preTime = System.currentTimeMillis();
        insertSort(vectorTen.clone());
        postTime = System.currentTimeMillis();
        time = postTime - preTime;
        System.out.println(time);
       // TO DO add all sorts

    }
}
