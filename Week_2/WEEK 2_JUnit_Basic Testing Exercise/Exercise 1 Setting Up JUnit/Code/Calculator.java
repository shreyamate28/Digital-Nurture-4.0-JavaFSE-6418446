import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero not allowed");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Result of " + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("Result of " + a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println("Result of " + a + " * " + b + " = " + calc.multiply(a, b));

        try {
            System.out.println("Result of " + a + " / " + b + " = " + calc.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Division Error: " + e.getMessage());
        }

        System.out.println("Result of " + a + " % " + b + " = " + calc.modulus(a, b));
        System.out.println("Result of " + a + " ^ " + b + " = " + calc.power(a, b));

        sc.close();
    }
}
