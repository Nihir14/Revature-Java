package parallelstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamThreadDemo {

    public static void main(String[] args) {

        List<String> tasks = Arrays.asList("A","B","C","D","E","F");

        tasks.parallelStream().forEach(task ->
            System.out.println(task + " handled by " +
                Thread.currentThread().getName())
        );
    }
}
