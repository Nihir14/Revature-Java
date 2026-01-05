package oops;

/*
 * Interface Abstraction Example
 * - Interface inheritance
 * - Class implements interface
 * - 100% abstraction
 */

// Parent interface
interface PaymentGateway {

    void pay();   // abstract method
}

// Child interface extending parent interface
interface AdvancedPaymentGateway extends PaymentGateway {

    void deposit();  // additional abstract method
}

// Implementing class
public class PaymentInterfaceDemo implements AdvancedPaymentGateway {

    @Override
    public void pay() {
        System.out.println("Inside pay method");
    }

    @Override
    public void deposit() {
        System.out.println("Inside deposit method");
    }

    public static void main(String[] args) {

        // Interface reference holding implementation object
        AdvancedPaymentGateway obj = new PaymentInterfaceDemo();

        obj.pay();
        obj.deposit();
    }
}
