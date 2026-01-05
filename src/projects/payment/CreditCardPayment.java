package projects.payment;

public class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
