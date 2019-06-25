package roshupkin_nikita.functions;

public class Exponent extends  AbstractCalculator {

    public Exponent(int[] xValues) {
        this.setxValues(xValues);
    }
    @Override
    public long function(int x) {
        long y = (long) Math.pow(2, x);
        return y;
    }
    public String toString() {
        return "Exponent";
    }
}
