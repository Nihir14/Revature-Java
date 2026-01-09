package optionaldemo;

import java.util.Optional;

public class OptionalOrElseThrowDemo {

    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);

        // Throws exception if value not present
        optional.orElseThrow(() ->
                new RuntimeException("Value not found"));
    }
}
