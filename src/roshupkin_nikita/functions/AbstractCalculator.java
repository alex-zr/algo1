package roshupkin_nikita.functions;


public abstract class  AbstractCalculator implements FunctionCalculator {
    private int[] xValues;

    public void setxValues(int[] xValues) {
        this.xValues = xValues;
    }

    public int[] getxValues() {
        return xValues;
    }

    @Override
    public long sumFunction() {
        long sum = 0;
        for (int i = 0; i < this.xValues.length; i++) {
            sum += function(xValues[i]);
        }
        return sum;
    }
    public abstract long function(int x);
}