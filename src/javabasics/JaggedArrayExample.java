package javabasics;

/*
 * Jagged Array Example in Java Training Practice
 * Author: Nihir
 */

public class JaggedArrayExample {

    public static void main(String[] args) {

        System.out.println("===== JAGGED ARRAY PRACTICE =====\n");

        // Declaring jagged array
        int[][] jagged = new int[3][];

        // Initializing each row with different sizes
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6, 7, 8, 9};

        // Printing jagged array elements
        System.out.println("Jagged Array Elements:");

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n===== END =====");
    }
}
