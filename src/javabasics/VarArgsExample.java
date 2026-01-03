package javabasics;

/*
 * VarArgs (Variable Arguments) Example in Java
 * Java Training Practice
 * Author: Nihir
 */

public class VarArgsExample {

    // Method using varargs
    static void addNumbers(int... numbers) {

        System.out.println("Numbers received:");

        int sum = 0;
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nSum = " + sum);
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("===== VARARGS PRACTICE =====\n");

        // Calling method with different number of arguments
        addNumbers(10);
        addNumbers(10, 20);
        addNumbers(10, 20, 30);
        addNumbers(5, 10, 15, 20);

        System.out.println("===== END =====");
    }
}
