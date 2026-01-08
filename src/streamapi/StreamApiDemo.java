package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        // ---------------- filter ----------------
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);


        // ---------------- map ----------------
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squared Numbers: " + squaredNumbers);


        // ---------------- forEach ----------------
        System.out.print("Printing elements: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();


        // ---------------- sorted ----------------
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);


        // ---------------- reduce ----------------
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);

        sum.ifPresent(s -> System.out.println("Sum: " + s));


        // ---------------- count ----------------
        long count = numbers.stream().count();
        System.out.println("Count: " + count);


        // ---------------- anyMatch ----------------
        boolean hasGreaterThan30 = numbers.stream()
                .anyMatch(n -> n > 30);

        System.out.println("Any number > 30: " + hasGreaterThan30);
    }
}
