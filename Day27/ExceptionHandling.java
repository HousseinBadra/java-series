package Day27;

class Calculator {
    // In this case if b was 0 we will run into a runtime error\
    // here comes exceptions to handle these edge cases
    public static double divide(int a, int b) {
        // we will wrap our logic in a try block
        try {
            final double result = a / b;
            return result;
        }
        // then a catch block
        // here we handle arithmetic exceptions
        catch (ArithmeticException e) {
            System.out.println("Cant divide by 0");
        }
        // here we handle out of memory exceptions
        catch (OutOfMemoryError e) {
            System.out.println("out of memory");
        }
        // other exceptions will end in this catch block
        catch (Exception e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
        return 0;

    }
}

public class ExceptionHandling {
    public static void main(String args[]) {
        System.out.println(Calculator.divide(1, 0));
    }
}
