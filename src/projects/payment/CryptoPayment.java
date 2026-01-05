package projects.payment;

public class CryptoPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency");
    }
}
