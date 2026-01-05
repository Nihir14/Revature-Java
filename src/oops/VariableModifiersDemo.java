package oops;

/*
 * Demonstrates variable modifiers:
 * final, static, volatile
 */

class VariableModifiersDemo {

    // static variable (shared)
    static int staticCount = 0;

    // final variable (constant)
    final int MAX = 100;

    // volatile variable (read latest value from main memory)
    volatile boolean flag = true;

    void show() {
        staticCount++;
        System.out.println("Static Count: " + staticCount);
        System.out.println("Final MAX: " + MAX);
        System.out.println("Volatile flag: " + flag);
    }

    public static void main(String[] args) {

        VariableModifiersDemo v1 = new VariableModifiersDemo();
        VariableModifiersDemo v2 = new VariableModifiersDemo();

        v1.show();
        v2.show();
    }
}
