package Day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 4, 2, 7, 5);
        ArrayList<Integer> arr = new ArrayList<>(list);

        // custom comparator
        Comparator<Integer> C = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a > b)
                    return -1;
                return 1;
            }
        };

        // if you don't pass a custom comparator it sorts ascending 
        Collections.sort(arr, C);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
