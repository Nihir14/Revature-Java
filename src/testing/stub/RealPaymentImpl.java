package testing.stub;

public class RealPaymentImpl implements PaymentService {

    @Override
    public boolean processPayment() {
        return false;
    }
}
