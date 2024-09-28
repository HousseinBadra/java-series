package Day9;

public class Array {
    public static void main(String args[]) {

        // decalre an array of size 5
        // default values are 0
        int[] nums = new int[5];

        // getting a value on index 1
        int value = nums[1];
        System.out.println(value);

        // overriding an element on index n
        nums[2] = 5;

        // loop over the elements of the array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
