package javabasics;

/*
 * Integer Comparison Cases in Java
 * Covers:
 * - Integer caching
 * - == vs equals()
 * - Autoboxing & unboxing
 * - NullPointerException case
 * - new Integer() vs valueOf()
 * - Cross-type comparison
 * Java Training Practice
 */

public class IntegerComparisonCases {

    public static void main(String[] args) {

        System.out.println("===== INTEGER COMPARISON CASES =====\n");

        // Case 1: Integer caching (-128 to 127)
        Integer a1 = 127;
        Integer b1 = 127;
        System.out.println("Case 1 (127 == 127): " + (a1 == b1)); // true

        // Case 2: Outside cache range
        Integer a2 = 128;
        Integer b2 = 128;
        System.out.println("Case 2 (128 == 128): " + (a2 == b2)); // false

        // Case 3: equals() compares value
        Integer a3 = 200;
        Integer b3 = 200;
        System.out.println("Case 3 (200.equals(200)): " + a3.equals(b3)); // true

        // Case 4: Wrapper vs primitive (unboxing happens)
        Integer a4 = 100;
        int b4 = 100;
        System.out.println("Case 4 (Integer == int): " + (a4 == b4)); // true

        // Case 5: Null unboxing (runtime exception)
        Integer a5 = null;
        int b5 = 10;
        try {
            System.out.println("Case 5 (null == int): " + (a5 == b5));
        } catch (NullPointerException e) {
            System.out.println("Case 5 (null == int): NullPointerException");
        }

        // Case 6: new Integer() creates new objects
        Integer a6 = new Integer(100);
        Integer b6 = new Integer(100);
        System.out.println("Case 6 (new Integer == new Integer): " + (a6 == b6)); // false

        // Case 7: valueOf() uses cache
        Integer a7 = Integer.valueOf(100);
        Integer b7 = Integer.valueOf(100);
        System.out.println("Case 7 (valueOf == valueOf): " + (a7 == b7)); // true

        // Case 8: Different wrapper types
        Integer a8 = 100;
        Long b8 = 100L;
        System.out.println("Case 8 (Integer.equals(Long)): " + a8.equals(b8)); // false

        System.out.println("\n===== END =====");
    }
}
