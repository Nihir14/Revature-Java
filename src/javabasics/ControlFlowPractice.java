package javabasics;/*
 * Control Flow Practice File
 * Java Training – Day Practice
 * Topic: if, switch, loops, break, continue
 * Author: Nihir
 */

public class ControlFlowPractice {

    public static void main(String[] args) {

        System.out.println("===== CONTROL FLOW PRACTICE START =====\n");

        // 1. if statement
        int age = 21;
        if (age >= 18) {
            System.out.println("1. Eligible to vote");
        }

        // 2. if-else statement
        int number = 15;
        if (number % 2 == 0) {
            System.out.println("\n2. Even number");
        } else {
            System.out.println("\n2. Odd number");
        }

        // 3. if-else-if ladder
        int marks = 72;
        System.out.println("\n3. Grade:");
        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 75) {
            System.out.println("B Grade");
        } else if (marks >= 60) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }

        // 4. switch statement
        int day = 3;
        System.out.println("\n4. Switch Example:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 5. for loop
        System.out.println("\n5. For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 6. while loop
        System.out.println("\n6. While Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 7. do-while loop
        System.out.println("\n7. Do-While Loop:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println();

        // 8. break statement
        System.out.println("\n8. Break Statement:");
        for (int k = 1; k <= 10; k++) {
            if (k == 6) {
                break;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        // 9. continue statement
        System.out.println("\n9. Continue Statement:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        // 10. Nested loop
        System.out.println("\n10. Nested Loop:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n===== CONTROL FLOW PRACTICE END =====");
    }
}
