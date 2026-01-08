package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalMethodsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        // forEach
        System.out.print("forEach: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // collect
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("collect: " + doubled);

        // count
        long count = numbers.stream().count();
        System.out.println("count: " + count);

        // reduce
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("reduce (sum): " + sum);

        // min
        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(min -> System.out.println("min: " + min));

        // max
        numbers.stream()
                .max(Integer::compareTo)
                .ifPresent(max -> System.out.println("max: " + max));

        // anyMatch
        System.out.println("anyMatch > 20: " +
                numbers.stream().anyMatch(n -> n > 20));

        // allMatch
        System.out.println("allMatch > 0: " +
                numbers.stream().allMatch(n -> n > 0));

        // noneMatch
        System.out.println("noneMatch < 0: " +
                numbers.stream().noneMatch(n -> n < 0));

        // findFirst
        numbers.stream()
                .findFirst()
                .ifPresent(first -> System.out.println("findFirst: " + first));

        // findAny
        numbers.stream()
                .findAny()
                .ifPresent(any -> System.out.println("findAny: " + any));
    }
}
