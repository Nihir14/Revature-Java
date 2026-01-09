package optionaldemo;

import java.util.Optional;

public class OptionalBasicDemo {

    public static void main(String[] args) {

        String name = "Java";

        Optional<String> optionalName = Optional.of(name);

        System.out.println("Value present: " + optionalName.get());
    }
}
