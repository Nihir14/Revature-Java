package exceptionhandling;

public class HandledExceptionDemo {

    public static void handleException() {

        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Runtime Exception
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught and handled");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Handling Exception Example");
        handleException();
        System.out.println("Program continues normally");
    }
}
