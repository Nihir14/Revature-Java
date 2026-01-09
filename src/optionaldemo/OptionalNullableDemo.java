package optionaldemo;

import java.util.Optional;

public class OptionalNullableDemo {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);

        System.out.println("Is present? " + optionalName.isPresent());
    }
}
