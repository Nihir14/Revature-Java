package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Java", "Spring", "Boot", "Java", "Microservices", "Spring"
        );

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // ---------------- toList ----------------
        List<String> list = names.stream()
                .filter(n -> n.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("toList: " + list);

        // ---------------- toSet ----------------
        Set<String> set = names.stream()
                .collect(Collectors.toSet());
        System.out.println("toSet: " + set);

        // ---------------- toMap ----------------
        Map<String, Integer> map = names.stream()
                .distinct()
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println("toMap: " + map);

        // ---------------- joining ----------------
        String joined = names.stream()
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println("joining: " + joined);

        // ---------------- counting ----------------
        long count = names.stream()
                .collect(Collectors.counting());
        System.out.println("counting: " + count);

        // ---------------- summingInt ----------------
        int sum = numbers.stream()
                .collect(Collectors.summingInt(n -> n));
        System.out.println("summingInt: " + sum);

        // ---------------- averagingInt ----------------
        double avg = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println("averagingInt: " + avg);

        // ---------------- minBy ----------------
        numbers.stream()
                .collect(Collectors.minBy(Integer::compareTo))
                .ifPresent(min -> System.out.println("minBy: " + min));

        // ---------------- maxBy ----------------
        numbers.stream()
                .collect(Collectors.maxBy(Integer::compareTo))
                .ifPresent(max -> System.out.println("maxBy: " + max));

        // ---------------- groupingBy ----------------
        Map<Integer, List<String>> groupByLength =
                names.stream().collect(
                        Collectors.groupingBy(String::length)
                );
        System.out.println("groupingBy: " + groupByLength);

        // ---------------- partitioningBy ----------------
        Map<Boolean, List<Integer>> partitioned =
                numbers.stream().collect(
                        Collectors.partitioningBy(n -> n > 25)
                );
        System.out.println("partitioningBy: " + partitioned);

        // ---------------- mapping ----------------
        List<Integer> nameLengths = names.stream()
                .collect(Collectors.mapping(
                        String::length,
                        Collectors.toList()
                ));
        System.out.println("mapping: " + nameLengths);

        // ---------------- collectingAndThen ----------------
        List<String> unmodifiableList = names.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        System.out.println("collectingAndThen: " + unmodifiableList);
    }
}
