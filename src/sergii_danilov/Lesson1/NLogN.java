package com.company;

public class NLogN implements FuncCalculator{
    private int[] xValues;

    public NLogN(int[] xValues) {
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
            return (long) (x*Math.log(x));
        }

        @Override
        public String toString() {
            return "N*Logarithm(N)";
        }
}
