package parallelstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamOrderedDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Keeps encounter order (slower than forEach)
        numbers.parallelStream()
               .forEachOrdered(n -> System.out.print(n + " "));
    }
}
