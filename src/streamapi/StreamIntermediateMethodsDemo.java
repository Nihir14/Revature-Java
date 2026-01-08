package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIntermediateMethodsDemo {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Java", "Spring", "Boot", "Microservices", "Java");

        // filter
        List<String> filtered = names.stream()
                .filter(n -> n.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("filter: " + filtered);

        // map
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("map: " + lengths);

        // distinct
        System.out.println("distinct: " +
                names.stream().distinct().collect(Collectors.toList()));

        // sorted
        System.out.println("sorted: " +
                names.stream().sorted().collect(Collectors.toList()));

        // limit
        System.out.println("limit: " +
                names.stream().limit(3).collect(Collectors.toList()));

        // skip
        System.out.println("skip: " +
                names.stream().skip(2).collect(Collectors.toList()));
    }
}
