package Day4;
public class FlowControl {
    public static void main(String args[]){

        // user information
        boolean hasPremium = false;
        int tokens = 0;

        if(hasPremium) {
            System.out.println("Operation completed");
        }
        else if (tokens > 0) {
            // Decrement the number of tokens
            tokens--;

            // Build the message
            String pluralHandler = tokens > 1 ? " tokens" : " token";
            String message = "You have " + Integer.toString(tokens) + pluralHandler + " left";

            System.out.println(message);
        }

        else System.out.println("You don't have enought tokens to perform this operation");

    }
}
