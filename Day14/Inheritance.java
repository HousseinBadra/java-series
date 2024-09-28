package Day14;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int substract(int a, int b) {
        return a - b;
    }
}

class AdvancedCalculator extends Calculator {
    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

public class Inheritance {
    public static void main(String args[]) {

        // Here calculator can only execute addition and substraction
        System.out.println(Calculator.add(1, 2));
        System.out.println(Calculator.substract(1, 2));

        // here advanced calculator extends calculator
        // advanced calculator does all what normal calculator does in addition to its
        // own methods
        System.out.println(AdvancedCalculator.add(1, 2));
        System.out.println(AdvancedCalculator.substract(1, 2));
        System.out.println(AdvancedCalculator.multiply(1, 2));
        System.out.println(AdvancedCalculator.divide(1, 2));

        return;
    }
}
