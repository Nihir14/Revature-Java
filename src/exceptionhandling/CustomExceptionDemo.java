package exceptionhandling;

public class CustomExceptionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(700); // triggers custom exception
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues normally");
    }
}
