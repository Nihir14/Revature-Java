package parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamPerformanceDemo {

    public static void main(String[] args) {

        List<Integer> data =
                IntStream.rangeClosed(1, 5_000_000)
                         .boxed()
                         .collect(Collectors.toList());

        long start = System.currentTimeMillis();
        long sumSeq = data.stream().mapToLong(i -> i).sum();
        long timeSeq = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        long sumPar = data.parallelStream().mapToLong(i -> i).sum();
        long timePar = System.currentTimeMillis() - start;

        System.out.println("Sequential Sum: " + sumSeq + " | Time: " + timeSeq + " ms");
        System.out.println("Parallel   Sum: " + sumPar + " | Time: " + timePar + " ms");
    }
}
