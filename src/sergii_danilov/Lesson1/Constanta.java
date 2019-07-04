package com.company;

public class Constanta implements FuncCalculator {
    private int[] xValues;

    public Constanta(int[] xValues) {
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
        return 1;
    }

    @Override
    public String toString() {
        return "Const";
    }
}

