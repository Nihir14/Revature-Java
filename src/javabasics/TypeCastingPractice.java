package javabasics;

/*
 * Type Casting Practice in Java
 * Covers:
 * 1. Widening Casting (Implicit)
 * 2. Narrowing Casting (Explicit)
 * 3. Data Loss and Overflow
 * Java Training Practice
 * Author: Nihir
 */

public class TypeCastingPractice {

    public static void main(String[] args) {

        System.out.println("===== WIDENING CASTING =====");

        // Widening Casting (Automatic / Implicit)
        byte b = 10;
        short s = b;      // byte → short
        int i = s;        // short → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;     // float → double

        System.out.println("byte value   : " + b);
        System.out.println("double value : " + d);

        System.out.println("\n===== NARROWING CASTING =====");

        // Narrowing Casting (Manual / Explicit)
        double d1 = 100.75;
        float f1 = (float) d1;   // double → float
        long l1 = (long) f1;     // float → long
        int i1 = (int) l1;       // long → int
        short s1 = (short) i1;   // int → short
        byte b1 = (byte) s1;     // short → byte

        System.out.println("double value : " + d1);
        System.out.println("byte value   : " + b1); // Data loss

        System.out.println("\n===== OVERFLOW EXAMPLE =====");

        // Overflow example
        int bigNum = 300;
        byte smallByte = (byte) bigNum;

        System.out.println("Original int value : " + bigNum);
        System.out.println("After casting to byte : " + smallByte);

        System.out.println("\n===== IMPORTANT NOTES =====");
        System.out.println("• Widening casting is automatic and safe.");
        System.out.println("• Narrowing casting must be done explicitly.");
        System.out.println("• Narrowing may cause data loss.");
        System.out.println("• Overflow occurs when value exceeds target range.");
        System.out.println("• Java wraps the value instead of throwing an exception.");
    }
}
