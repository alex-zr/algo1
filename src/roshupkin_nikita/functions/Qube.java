package roshupkin_nikita.functions;

public class Qube extends AbstractCalculator {

    public Qube(int[] xValues){
        this.setxValues(xValues);
    }
    @Override
    public long function(int x) {
        long y = x * x * x;
        return y;
    }
    public String toString() {
        return "Qube";
    }
}
