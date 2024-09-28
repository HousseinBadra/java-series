package Day26;

// functional interface is an interface with one public static method
// functional interface is crutial for creating lambda functions
@FunctionalInterface
interface FormatCurrency {
    String formatCurrency(int credit);
}


public class FunctionalInterfaceDemo {
    public static void main(String args[]) {
        // using the functional interface we can create an lambda function
        FormatCurrency Currency = (int credit) -> "$" + Integer.toString(credit);

        System.out.println(Currency.formatCurrency(10));
    }
}
