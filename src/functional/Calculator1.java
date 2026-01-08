package functional;

@FunctionalInterface
public interface Calculator1 {

    // Single abstract method (SAM)
    int add(int a, int b);

    // Default (concrete) method
    default void display() {
        System.out.println("Calculator Interface");
    }

    // Static method
    static void info() {
        System.out.println("Static method in Functional Interface");
    }
}
