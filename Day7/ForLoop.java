package Day7;
public class ForLoop {
    public static void main(String args[]) {

        // list of expenses 
        int[] expenses = { 1, 10, 13, 34 };
        int totalExpenses = 0;

        // we loop over the expenses using the following syntax
        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
        }
        
        System.out.println("Your total spending is $" + Integer.toString(totalExpenses));
        return;
    }
}
