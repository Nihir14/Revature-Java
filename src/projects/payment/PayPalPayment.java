package projects.payment;

public class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
