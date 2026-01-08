package collectionslambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionsLambdaExample {

    public static void main(String[] args) {

        // ---------- List with Lambda (forEach) ----------
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Printing list using lambda:");
        languages.forEach(lang -> System.out.println(lang));


        // ---------- Sorting using Lambda ----------
        List<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Sort in ascending order using lambda
        Collections.sort(numbers, (a, b) -> a - b);

        System.out.println("\nSorted numbers:");
        numbers.forEach(n -> System.out.println(n));


        // ---------- Filter-like logic using Lambda ----------
        System.out.println("\nEven numbers:");
        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
