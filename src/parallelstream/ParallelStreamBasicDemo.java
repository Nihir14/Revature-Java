package parallelstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamBasicDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Sequential
        System.out.println("Sequential:");
        numbers.stream()
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Parallel
        System.out.println("Parallel:");
        numbers.parallelStream()
               .forEach(n -> System.out.print(n + " "));
    }
}
