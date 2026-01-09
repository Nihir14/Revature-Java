package optionaldemo;

import java.util.Optional;

public class OptionalMapDemo {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("java");

        Optional<String> upper =
                optional.map(String::toUpperCase);

        upper.ifPresent(System.out::println);
    }
}
