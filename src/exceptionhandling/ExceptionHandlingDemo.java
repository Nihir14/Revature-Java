package exceptionhandling;

/*
 * Demonstrates:
 * - Runtime Exception handling
 * - try-catch-finally
 */

public class ExceptionHandlingDemo {

    public static void handleException() {

        try {
            int[] numbers = new int[5];
            System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught successfully");
            System.out.println("Reason: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Exception Handling Demo ----");
        handleException();
        System.out.println("Program continues normally");
    }
}
