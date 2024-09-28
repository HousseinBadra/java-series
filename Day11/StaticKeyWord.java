package Day11;

class Calculator {
    static int count;

    // static block
    // executed one when an instance is created for the first time
    static {
        // initialise count
        count = 0;
    }

    Calculator() {
        // every time a calculator is created we increment count
        count++;
    }

    // static methode sahred between all calculators
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticKeyWord {
    public static void main(String args[]) {

        // Let's create 2 calculators
        Calculator BlackCalculator = new Calculator();
        Calculator WhiteCalculator = new Calculator();

        // Let's see how many calculators where created
        System.out.println(Calculator.count); // output is 2

        // Now let's add 2 numbers
        System.out.println(Calculator.add(1, 2)); // output is 3
    }
}