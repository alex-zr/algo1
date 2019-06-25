package roshupkin_nikita.functions;

public class Linear extends AbstractCalculator {


    public Linear(int[] xValues) {
        this.setxValues(xValues);
    }
    @Override
    public long function(int x) {
        long y = x;
        return y;
    }
    public String toString() {
        return "Linear";
    }
}
