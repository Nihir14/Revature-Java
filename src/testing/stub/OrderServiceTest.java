package testing.stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderServiceTest {

    @Test
    public void testPlaceOrderSuccess() {
        PaymentService stub = new PaymentServiceStub();
        OrderSevice orderSevice = new OrderSevice(stub);

        assertTrue(orderSevice.placeOrder());

    }
}
