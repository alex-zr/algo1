package session1;

public class FunctionComparator {
    public static void main(String[] args) {
        int[] xValues = {1,2,3,4,5};
        FunctionCalculator linear = new Linear(xValues);

        FunctionCalculator[] functions = new FunctionCalculator[1]; // change after add more functions
        functions[0] = linear;
//        functions[1] = constant;

        for (FunctionCalculator function : functions) {
            System.out.println(function.sumFunction());
        }
    }
}
