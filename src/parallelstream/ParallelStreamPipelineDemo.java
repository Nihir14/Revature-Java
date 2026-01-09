package parallelstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamPipelineDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        int result = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .reduce(0, Integer::sum);

        System.out.println("Result: " + result);
    }
}
