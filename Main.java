import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
            String expression = scan.nextLine();
            String arg1 = expression.substring(0, calc.indexOfOperation(expression) - 1);
            String arg2 = expression.substring(calc.indexOfOperation(expression) + 2);
            boolean arg1Int = !arg1.contains(".");
            boolean arg2Int = !arg2.contains(".");
            double x = Double.parseDouble(arg1);
            double y = Double.parseDouble(arg2);
            int intx = (int) x;
            int inty = (int) y;
            String operation = calc.operation(expression);

            if (arg1Int && arg2Int) {
                switch (operation) {
                    case "+" -> System.out.println(calc.add(intx, inty));
                    case "-" -> System.out.println(calc.subtract(intx, inty));
                    case "*" -> System.out.println(calc.multiply(intx, inty));
                    case "/" -> System.out.println(calc.divide(intx, inty));
                    case "%" -> System.out.println(calc.mod(intx, inty));
                    case "^" -> System.out.println(calc.exponentiation(intx, inty));
                }
            } else {
                switch (operation) {
                    case "+" -> System.out.println(calc.add(x, y));
                    case "-" -> System.out.println(calc.subtract(x, y));
                    case "*" -> System.out.println(calc.multiply(x, y));
                    case "/" -> System.out.println(calc.divide(x, y));
                    case "%" -> System.out.println(calc.mod(x, y));
                    case "^" -> System.out.println(calc.exponentiation(x, y));
                }
            }

            System.out.println();
        }
    }
}
