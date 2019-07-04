package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] xValues = {1,2,3,4,5};

        FuncCalculator linear = new Line(xValues);
        FuncCalculator log = new Log(xValues);
        FuncCalculator nlogn = new NLogN(xValues);
        FuncCalculator n2 = new N2(xValues);
        FuncCalculator n3 = new N3(xValues);
        FuncCalculator exp = new Expo2(xValues);
        FuncCalculator constanta = new Constanta(xValues);

        FuncCalculator[] functions = new FuncCalculator[]{log, linear, nlogn, n2, n3, exp, constanta};

        long[] sums = new long[7];
        for (int i = 0; i < functions.length; i++) {
            sums[i] = functions[i].sumFunction();
        }
        Arrays.sort(sums);
        for (int j = 0; j < sums.length; j++) {
            for (int i = 0; i < functions.length; i++) {
                if (sums[j] == functions[i].sumFunction()){
                    System.out.println(functions[i].toString()+ " = " +functions[i].sumFunction());

                };
            }
        }

    }
}
