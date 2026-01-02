package javabasics;/*
 * Array Practice File
 * Java Training – Practice Session
 * Topic: Arrays
 * Author: Nihir
 */

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        System.out.println("===== ARRAY PRACTICE START =====\n");

        // 1. Declaring and initializing array
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("1. Array elements:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // 2. Array length
        System.out.println("\n2. Length of array:");
        System.out.println(arr1.length);

        // 3. Access element by index
        System.out.println("\n3. Element at index 2:");
        System.out.println(arr1[2]);

        // 4. Modify array element
        System.out.println("\n4. Modify element at index 1:");
        arr1[1] = 25;
        System.out.println(Arrays.toString(arr1));

        // 5. Sum of array elements
        System.out.println("\n5. Sum of elements:");
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);

        // 6. Average of array elements
        System.out.println("\n6. Average:");
        double avg = (double) sum / arr1.length;
        System.out.println(avg);

        // 7. Find maximum element
        System.out.println("\n7. Maximum element:");
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println(max);

        // 8. Find minimum element
        System.out.println("\n8. Minimum element:");
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println(min);

        // 9. Reverse an array
        System.out.println("\n9. Reverse array:");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // 10. Copy array
        System.out.println("\n10. Copy array:");
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));

        // 11. Sort array
        System.out.println("\n11. Sort array:");
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // 12. Search element (linear search)
        System.out.println("\n12. Linear search for 40:");
        int search = 40;
        boolean found = false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == search) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element found" : "Element not found");

        // 13. Enhanced for loop
        System.out.println("\n13. Enhanced for loop:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 14. Count even and odd numbers
        System.out.println("\n14. Count even and odd:");
        int even = 0, odd = 0;
        for (int num : arr2) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        // 15. Second largest element
        System.out.println("\n15. Second largest element:");
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr2) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);

        // 16. Remove duplicates (simple logic)
        System.out.println("\n16. Remove duplicates:");
        int[] arr3 = {1, 2, 2, 3, 4, 4, 5};
        for (int i = 0; i < arr3.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr3[i] == arr3[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(arr3[i] + " ");
            }
        }
        System.out.println();

        // 17. 2D Array
        System.out.println("\n17. 2D Array:");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 18. Jagged Array
        System.out.println("\n18. Jagged Array:");
        int[][] jagged = {
                {1, 2},
                {3, 4, 5},
                {6}
        };

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n===== ARRAY PRACTICE END =====");
    }
}
