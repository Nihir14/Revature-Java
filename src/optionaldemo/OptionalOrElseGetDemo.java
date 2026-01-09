package optionaldemo;

import java.util.Optional;

public class OptionalOrElseGetDemo {

    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);

        String value = optional.orElseGet(() -> "Generated Value");

        System.out.println(value);
    }
}
