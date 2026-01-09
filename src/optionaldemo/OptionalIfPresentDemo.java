package optionaldemo;

import java.util.Optional;

public class OptionalIfPresentDemo {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Lambda");

        optional.ifPresent(value ->
                System.out.println("Value is: " + value));
    }
}
