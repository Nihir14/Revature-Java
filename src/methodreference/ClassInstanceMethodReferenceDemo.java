package methodreference;

import java.util.Arrays;
import java.util.List;

public class ClassInstanceMethodReferenceDemo {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Java", "Spring", "Boot");

        // Lambda
        names.forEach(name -> System.out.println(name));

        // Method Reference
        names.forEach(System.out::println);
    }
}
