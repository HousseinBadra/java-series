package Day16;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    // here this method overrides the add method inherited from Calculator
    public int add(int a, int b) {
        return a + b + 1;
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        // creating an Advancedcalculator instance and calling add
        AdvancedCalculator adv = new AdvancedCalculator();
        System.out.println(adv.add(1, 2));
    }

}
