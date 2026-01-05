package oops;

/*
 * Abstraction using Interface
 * - Supports 100% abstraction
 * - All methods are abstract by default
 */

interface VehicleInterface {

    void start(); // public abstract by default
}

class BikeUsingInterface implements VehicleInterface {

    @Override
    public void start() {
        System.out.println("Bike starts with self button");
    }
}

public class InterfaceVehicleDemo {

    public static void main(String[] args) {

        VehicleInterface obj = new BikeUsingInterface(); // Runtime polymorphism
        obj.start();
    }
}
