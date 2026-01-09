package methodreference;

import java.util.function.Consumer;

public class StaticMethodReferenceDemo {

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        // Lambda
        Consumer<String> lambda =
                msg -> StaticMethodReferenceDemo.printMessage(msg);

        // Method Reference
        Consumer<String> methodRef =
                StaticMethodReferenceDemo::printMessage;

        methodRef.accept("Hello using Static Method Reference");
    }
}
