package exceptionhandling;

/*
 * Custom Checked Exception
 * Used when account balance is insufficient
 */
public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
