package roshupkin_nikita.functions;

public class FunctionComparator {
    public static void main(String[] args) {
        int[] xValues = {1, 20, 35, 40, 60};
        FunctionCalculator linear = new Linear(xValues);
        FunctionCalculator constant = new Constant(xValues);
        FunctionCalculator logLeaner = new LogLeaner(xValues);
        FunctionCalculator logorifm = new Logorifm(xValues);
        FunctionCalculator quadratic = new Quadratic(xValues);
        FunctionCalculator qube = new Qube(xValues);
        FunctionCalculator exponent = new Exponent(xValues);


        FunctionCalculator[] functions = new FunctionCalculator[7];
        functions[0] = linear;
        functions[1] = constant;
        functions[2] = logLeaner;
        functions[3] = exponent;
        functions[4] = quadratic;
        functions[5] = qube;
        functions[6] = logorifm;

        for (int i = 0; i < functions.length; i++) {
            for (int j = i + 1; j < functions.length; j++) {
                if (functions[i].sumFunction() > functions[j].sumFunction()) {
                    FunctionCalculator tmp = functions[j];
                    functions[j] = functions[i];
                    functions[i] = tmp;
                }
            }
        }

        for (FunctionCalculator function : functions) {
            System.out.println(function.toString());
        }


    }
}