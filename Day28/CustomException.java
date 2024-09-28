package Day28;

// here we create a Custom Exception
// THis class should extend the Exception class
class AuthorizationException extends Exception {
    AuthorizationException(String s) {
        super(s);
    }
}

// Incase we try to manage finantial without permission we throw an exception
class User {
    private boolean allowManageFinantial;

    User(boolean allowManageFinantial) {
        this.allowManageFinantial = allowManageFinantial;
    }

    // when ever we throw an exception we have to handle it
    // this will be done by adding a try catch block
    // we can do it in the method itself or make this handled where the method is
    // called
    // this can be done by using throws
    // throws differs from throw
    // throw used to throw the exception
    void manageFinantial() throws AuthorizationException {
        if (allowManageFinantial) {
            System.out.println("Run operation");
        } else {
            throw (new AuthorizationException("You don't have any finantial authorization"));
        }
    }
}

public class CustomException {
    public static void main(String args[]) {
        // here we create an user instance with no permission
        User manager = new User(false);

        // as we used throws for manageFinantial we have to handle the try catch logic
        // here
        try {
            manager.manageFinantial();
        } catch (AuthorizationException e) {
            System.out.println(e.getMessage());
        }
    }
}
