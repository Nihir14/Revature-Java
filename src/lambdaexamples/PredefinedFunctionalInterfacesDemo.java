package lambdaexamples;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

public class PredefinedFunctionalInterfacesDemo {

    public static void main(String[] args) {

        // ---------------- CONSUMER ----------------
        // Takes input, returns nothing
        Consumer<String> printConsumer = (msg) -> 
                System.out.println("Consumer Output: " + msg);

        printConsumer.accept("Hello Consumer");


        // ---------------- SUPPLIER ----------------
        // Takes no input, returns value
        Supplier<Integer> randomSupplier = () -> 100;

        System.out.println("Supplier Output: " + randomSupplier.get());


        // ---------------- FUNCTION ----------------
        // Takes input, returns output
        Function<Integer, String> numberToString =
                (num) -> "Number is: " + num;

        System.out.println("Function Output: " + numberToString.apply(10));
    }
}
