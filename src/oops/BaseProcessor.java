package oops;

/*
 * Demonstrates method modifiers:
 * final, static, abstract, synchronized, native
 */

abstract class BaseProcessor {

    // abstract method
    abstract void process();

    // concrete method
    void info() {
        System.out.println("BaseProcessor info()");
    }
}

class MethodModifiersDemo extends BaseProcessor {

    // static method
    static void staticMethod() {
        System.out.println("Static method called");
    }

    // final method (cannot be overridden)
    final void finalMethod() {
        System.out.println("Final method called");
    }

    // synchronized method (thread-safe)
    synchronized void synchronizedMethod() {
        System.out.println("Synchronized method executed");
    }

    // native method (implemented in C/C++)
    native void nativeMethod();

    @Override
    void process() {
        System.out.println("Abstract method implemented");
    }

    public static void main(String[] args) {

        MethodModifiersDemo obj = new MethodModifiersDemo();

        staticMethod();
        obj.process();
        obj.info();
        obj.finalMethod();
        obj.synchronizedMethod();

        // obj.nativeMethod(); // not called (no native implementation)
    }
}
