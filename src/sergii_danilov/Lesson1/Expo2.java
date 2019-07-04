package com.company;

import static java.lang.Math.*;

public class Expo2 implements FuncCalculator{
    private int[] xValues;

    public Expo2(int[] xValues) {
        this.xValues = xValues;
    }

    @Override
    public long sumFunction() {
        long sum = 0;
        for (int i = 0; i < this.xValues.length; i++) {
            sum = sum + function(xValues[i]);
        }
        return sum;
    }

    private long function(int x) {
        return (long) Math.pow(2,x);
    }

    @Override
    public String toString() {
        return "2^N";
    }
}
