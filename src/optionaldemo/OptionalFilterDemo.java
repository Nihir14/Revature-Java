package optionaldemo;

import java.util.Optional;

public class OptionalFilterDemo {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Java");

        optional
            .filter(val -> val.length() > 3)
            .ifPresent(System.out::println);
    }
}
