package roshupkin_nikita.functions;

public class Quadratic extends AbstractCalculator {

    public Quadratic(int[] xValues) {
        this.setxValues(xValues);
    }
    @Override
    public long function(int x) {
        long y = x * x;;

        return y;
    }
    public String toString() {
        return "Quadratic";
    }

}
