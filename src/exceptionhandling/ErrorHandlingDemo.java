package exceptionhandling;

/*
 * Demonstrates:
 * - Error (StackOverflowError)
 * - Why errors should not be handled
 */

public class ErrorHandlingDemo {

    public static void demonstrateError() {

        try {
            recursiveMethod();
        }
        catch (StackOverflowError e) {
            // NOT recommended, only for demo
            System.out.println("Error occurred (do not handle errors)");
        }
    }

    private static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }

    public static void main(String[] args) {
        System.out.println("---- Error Demonstration Demo ----");
        demonstrateError();
    }
}
