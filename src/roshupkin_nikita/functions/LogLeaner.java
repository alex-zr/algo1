package roshupkin_nikita.functions;

public class LogLeaner extends AbstractCalculator {

    public LogLeaner(int[] xValues) {
        this.setxValues(xValues);
    }

    @Override
    public long function(int x) {
        long y =  x*(long)(Math.log(x));
        return y;
    }
    public String toString() {
        return "LogLeaner";
    }
}
