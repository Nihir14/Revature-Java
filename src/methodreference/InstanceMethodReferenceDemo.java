package methodreference;

import java.util.function.Consumer;

public class InstanceMethodReferenceDemo {

    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        InstanceMethodReferenceDemo obj =
                new InstanceMethodReferenceDemo();

        // Lambda
        Consumer<String> lambda =
                msg -> obj.display(msg);

        // Method Reference
        Consumer<String> methodRef =
                obj::display;

        methodRef.accept("Hello using Instance Method Reference");
    }
}
