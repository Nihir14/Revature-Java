package streamapi;

import java.util.*;

public class StreamPipelineDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = numbers.stream()
                .filter(n -> n % 2 == 0)   // intermediate
                .map(n -> n * 10)          // intermediate
                .reduce(0, Integer::sum);  // terminal

        System.out.println("Pipeline Result: " + result);
    }
}
