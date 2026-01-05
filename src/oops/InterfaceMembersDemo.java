package oops;

/*
 * Interface Members Demo
 * Shows:
 * - Allowed members in interface
 * - Default behavior behind the scenes
 */

interface Device {

    // 1️⃣ Variables (FIELDS)
    // Behind the scenes:
    // public static final int MAX_POWER = 100;
    int MAX_POWER = 100;

    // 2️⃣ Abstract method
    // Behind the scenes:
    // public abstract void start();
    void start();

    // 3️⃣ Default method (Java 8+)
    // Behind the scenes:
    // public default void stop()
    default void stop() {
        System.out.println("Device stopped (default method)");
    }

    // 4️⃣ Static method (Java 8+)
    // Behind the scenes:
    // public static void info()
    static void info() {
        System.out.println("Device interface static method");
    }

    // ❌ Not allowed in interface
    // constructor ❌
    // instance block ❌
    // static block ❌
}

// Implementing class
public class InterfaceMembersDemo implements Device {

    @Override
    public void start() {
        System.out.println("Device started");
    }

    public static void main(String[] args) {

        Device d = new InterfaceMembersDemo();

        d.start();   // abstract method
        d.stop();    // default method

        // Static method called using interface name
        Device.info();

        // Accessing constant
        System.out.println("Max power: " + Device.MAX_POWER);
    }
}
