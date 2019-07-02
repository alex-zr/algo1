package session1;

public class FunctionComparator {
    public static void main(String[] args) {
        int[] xValues = {1,2,3,4,5};
        FunctionCalculator linear = new Linear(xValues);

        FunctionCalculator[] functions = new FunctionCalculator[1]; // change after addTail more functions
        functions[0] = linear;
//        functions[1] = constant;

        // TODO addTail all functions to array
        // TODO sort functions array by ordinates sum
        // TODO print functions in order by complexity
        for (FunctionCalculator function : functions) {
            System.out.println(function.sumFunction());
        }
    }
}
