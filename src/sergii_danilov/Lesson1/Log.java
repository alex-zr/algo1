package com.company;

import static java.lang.Math.*;

public class Log implements FuncCalculator{
    private int[] xValues;

    public Log(int[] xValues) {
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
        return (long) Math.log(x);
    }

    @Override
    public String toString() {
        return "Logarithm";
    }
}
