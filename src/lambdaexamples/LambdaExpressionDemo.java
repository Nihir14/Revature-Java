package lambdaexamples;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        // Lambda Expression implementation
        Greeting greet = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        greet.sayHello("Nihir");
    }
}
