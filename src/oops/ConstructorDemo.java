package oops;

public class ConstructorDemo {

    int value;

    // Default constructor
    ConstructorDemo() {
        value = 10;
    }

    // Parameterized constructor
    ConstructorDemo(int value) {
        this.value = value;
    }

    void show() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ConstructorDemo c1 = new ConstructorDemo();
        ConstructorDemo c2 = new ConstructorDemo(50);

        c1.show();
        c2.show();
    }
}
