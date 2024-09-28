package Day10;

public class Array2D {
    public static void main(String args[]) {
        // Example of 2D array usage
        // A week consists of days
        // A day consists of shifts
        // So a week is a 2D array

        int[][] week = new int[5][5];

        for (int[] day : week) {
            for (int shift : day) {
                System.out.println(shift);
            }
        }

        // You can also declare a jagged array where each element is of diffrent length

        int[][] jagged = new int[3][];
        // initialise jagged[i]
        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[3];

        return;

    }
}
