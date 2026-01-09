package optionaldemo;

import java.util.Optional;

public class OptionalOrElseDemo {

    public static void main(String[] args) {

        String value = null;

        Optional<String> optional = Optional.ofNullable(value);

        String result = optional.orElse("Default Value");

        System.out.println(result);
    }
}
