package functional;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Lambda expression implementing functional interface
        Calculator1 calc = (a, b) -> a + b;

        // Using abstract method
        System.out.println("Addition Result: " + calc.add(10, 20));

        // Using default method
        calc.display();

        // Using static method
        Calculator1.info();
    }
}
