package testing.stub;

public class PaymentServiceStub implements PaymentService {
    @Override
    public boolean processPayment() {
        return true; // predefined behaviour
    }
}
