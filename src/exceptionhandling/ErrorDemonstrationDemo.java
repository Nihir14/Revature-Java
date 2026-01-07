package exceptionhandling;

public class ErrorDemonstrationDemo {

    public static void demonstrateError() {

        try {
            recursiveMethod(); // StackOverflowError
        }
        catch (StackOverflowError e) {
            // Not recommended to catch errors
            System.out.println("Error occurred (do not catch errors)");
        }
    }

    private static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating Error Example");
        demonstrateError();
    }
}
