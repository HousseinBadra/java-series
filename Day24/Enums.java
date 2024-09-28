package Day24;

// You may need a enum for a collection of constants 
// ex : request types, dialog names, form names
enum Request {
    Pending, Success, Error
}

public class Enums {
    public static void main(String args[]) {
        // here how to access the constants inside an enum
        Request a = Request.Pending;

        // using switch with enum
        switch (a) {
            case Pending:
                System.out.println(Request.Pending);
                break;
            case Success:
                System.out.println(Request.Success);
                break;
            case Error:
                System.out.println(Request.Error);
                break;
            default:
                break;
        }

    }
}
