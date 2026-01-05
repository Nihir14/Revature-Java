package oops;

/*
 * Abstraction using Abstract Class
 * - Supports partial abstraction
 * - Can have abstract + non-abstract methods
 */

abstract class AbstractVehicle {

    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class CarUsingAbstract extends AbstractVehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractVehicleDemo {

    public static void main(String[] args) {

        // Cannot create object of abstract class
        // AbstractVehicle v = new AbstractVehicle(); ❌

        AbstractVehicle obj = new CarUsingAbstract(); // Runtime polymorphism
        obj.start();
        obj.fuel();
    }
}
