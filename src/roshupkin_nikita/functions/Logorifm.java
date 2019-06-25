package roshupkin_nikita.functions;

public class Logorifm extends AbstractCalculator {

    public Logorifm(int[] xValues) {
        this.setxValues(xValues);
    }
    @Override
    public long function(int x) {
        long y = (long) Math.log(x);
        return y;
    }
    public String toString() {
        return "Logorifm";
    }
}
