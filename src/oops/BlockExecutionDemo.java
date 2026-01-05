package oops;

class BlockExecutionDemo {

    // Static variable
    static int a;

    // Instance variable
    int b;

    // Static Block
    static {
        a = 10;
        System.out.println("Static block executed");
        System.out.println("Static variable a = " + a);
    }

    // Instance Block
    {
        b = 20;
        System.out.println("Instance block executed");
        System.out.println("Instance variable b = " + b);
    }

    // Constructor
    BlockExecutionDemo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        // First object
        BlockExecutionDemo obj1 = new BlockExecutionDemo();

        System.out.println("---- Creating second object ----");

        // Second object
        BlockExecutionDemo obj2 = new BlockExecutionDemo();
    }
}
