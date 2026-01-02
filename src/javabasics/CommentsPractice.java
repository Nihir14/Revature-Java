package javabasics;/*
 * Comments Practice File
 * Java Training – Basics
 * Topic: Comments in Java
 * Author: Nihir
 */

public class CommentsPractice {

    public static void main(String[] args) {

        // This is a single-line comment
        System.out.println("1. Single-line comment example");

        /*
         * This is a multi-line comment
         * It is used to explain multiple lines of code
         */
        System.out.println("2. Multi-line comment example");

        /**
         * This is a documentation comment
         * It is mainly used with classes and methods
         * Tools like Javadoc use this comment
         */
        System.out.println("3. Documentation comment example");

        // Variables with comments
        int a = 10; // first number
        int b = 20; // second number

        // Adding two numbers
        int sum = a + b;
        System.out.println("4. Sum = " + sum);

        // Commenting code for debugging
        int x = 5;
        int y = 3;
        // int result = x / 0;  // commented to avoid error
        int result = x + y;
        System.out.println("5. Result = " + result);

        // Important note:
        // Comments are ignored by the compiler

        System.out.println("\n===== COMMENTS PRACTICE END =====");
    }
}
