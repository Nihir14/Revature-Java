package projects.payment;

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        Payment p3 = new CryptoPayment();

        p1.processPayment(1000);
        p2.processPayment(2000);
        p3.processPayment(3000);
    }
}
