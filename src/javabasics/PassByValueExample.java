package javabasics;/*
 * Pass By Value Example in Java
 * Java Training Practice
 * Author: Nihir
 */

class Test {

    int number;

    // Constructor
    Test(int number) {
        this.number = number;
    }
}

public class PassByValueExample {

    // Method with primitive data type
    static void changePrimitive(int x) {
        x = 100;
        System.out.println("Inside changePrimitive(): " + x);
    }

    // Method with object reference
    static void changeObject(Test t) {
        t.number = 200;
        System.out.println("Inside changeObject(): " + t.number);
    }

    // Method reassigning object reference
    static void changeReference(Test t) {
        t = new Test(300);
        System.out.println("Inside changeReference(): " + t.number);
    }

    public static void main(String[] args) {

        System.out.println("===== PASS BY VALUE PRACTICE =====\n");

        // Primitive example
        int a = 50;
        System.out.println("Before changePrimitive(): " + a);
        changePrimitive(a);
        System.out.println("After changePrimitive(): " + a);

        System.out.println();

        // Object example
        Test obj = new Test(50);
        System.out.println("Before changeObject(): " + obj.number);
        changeObject(obj);
        System.out.println("After changeObject(): " + obj.number);

        System.out.println();

        // Reference reassignment example
        Test obj2 = new Test(50);
        System.out.println("Before changeReference(): " + obj2.number);
        changeReference(obj2);
        System.out.println("After changeReference(): " + obj2.number);

        System.out.println("\n===== END =====");
    }
}
