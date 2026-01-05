package oops;

public class MethodTypesDemo {

    // Instance method
    void instanceMethod() {
        System.out.println("Instance Method");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static Method");
    }

    // Final method
    final void finalMethod() {
        System.out.println("Final Method");
    }

    public static void main(String[] args) {
        MethodTypesDemo obj = new MethodTypesDemo();
        obj.instanceMethod();
        obj.finalMethod();

        MethodTypesDemo.staticMethod();
    }
}
