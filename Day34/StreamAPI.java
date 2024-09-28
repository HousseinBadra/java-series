package Day34;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String args[]) {
        List<Integer> arr = Arrays.asList(2, 3, 4, 5, 6);
        Stream<Integer> s = arr.stream();

        // stream can be used only once
        s.filter(e -> e % 2 == 0).map(e -> e + 1).forEach(e -> System.err.println(e));

        // this will throw an error
        // s.forEach(e -> System.err.println(e));
    }
}
