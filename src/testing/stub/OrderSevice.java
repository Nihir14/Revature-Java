package testing.stub;

public class OrderSevice {
    private PaymentService paymentService;

    public OrderSevice(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean placeOrder() {
        return paymentService.processPayment();
    }
}
