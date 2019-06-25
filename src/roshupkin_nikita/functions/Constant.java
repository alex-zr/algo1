package roshupkin_nikita.functions;

public class Constant extends AbstractCalculator {

    public Constant(int[] xValues) {
        this.setxValues(xValues);
    }
    @Override
    public long function(int x) {
        int c = 2;
        long y = c;
        return y;
    }
    public String toString() {
        return "Constant";
    }

}
