package parallelstream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamThreadDemo1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Sequential stream
        list.stream()
            .forEach(n -> System.out.println(
                    "Sequential: " + n +
                    " | Thread: " + Thread.currentThread().getName()
            ));

        // Parallel stream
        list.parallelStream()
            .forEach(n -> System.out.println(
                    "Parallel: " + n +
                    " | Thread: " + Thread.currentThread().getName()
            ));
    }
}
