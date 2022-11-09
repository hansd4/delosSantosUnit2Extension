import java.util.Arrays;
import java.util.List;

public class Calculator {
    private final List<String> OPERATORS = Arrays.asList("+", "-", "*", "/", "%", "^");

    public Calculator() {}

    public int indexOfOperation(String expression) {
        // return index of the operation returned by operation() in expression
        return expression.indexOf(operation(expression));
    }

    public String operation(String expression) {
        for (int i = 0; i < OPERATORS.size(); i++) {
            if (expression.indexOf(OPERATORS.get(i)) != -1) {
                return OPERATORS.get(i);
            }
        }
        return null;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public double add(int x, double y) {
        return x + y;
    }

    public double add(double x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public double subtract(int x, double y) {
        return x - y;
    }

    public double subtract(double x, int y) {
        return x - y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double multiply(int x, double y) {
        return x * y;
    }

    public double multiply(double x, int y) {
        return x * y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public double divide(int x, double y) {
        return x / y;
    }

    public double divide(double x, int y) {
        return x / y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public double mod(int x, double y) {
        return x % y;
    }

    public double mod(double x, int y) {
        return x % y;
    }

    public double mod(double x, double y) {
        return x % y;
    }

    public int exponentiation(int x, int y) {
        return (int) Math.pow(x, y);
    }

    public double exponentiation(int x, double y) {
        return Math.pow(x, y);
    }

    public double exponentiation(double x, int y) {
        return Math.pow(x, y);
    }

    public double exponentiation(double x, double y) {
        return Math.pow(x, y);
    }
}
