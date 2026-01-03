package javabasics;

/*
 * Wrapper Classes Practice in Java
 * Covers:
 * - Primitive to Wrapper conversion
 * - Autoboxing and Unboxing
 * - Wrapper class methods
 * - Comparison, constants, utility methods
 * - Character and Boolean methods
 * - Null handling
 * Java Training Practice
 * Author: Nihir
 */

public class WrapperClasses {

    public static void main(String[] args) {

        System.out.println("===== WRAPPER CLASSES PRACTICE =====\n");

        // Primitive types and their wrapper classes
        byte b = 1;
        Byte bWrapper = Byte.valueOf(b);

        short s = 2;
        Short sWrapper = Short.valueOf(s);

        int i = 3;
        Integer iWrapper = Integer.valueOf(i);

        long l = 4L;
        Long lWrapper = Long.valueOf(l);

        float f = 5.0f;
        Float fWrapper = Float.valueOf(f);

        double d = 6.0;
        Double dWrapper = Double.valueOf(d);

        char c = 'A';
        Character cWrapper = Character.valueOf(c);

        boolean bool = true;
        Boolean boolWrapper = Boolean.valueOf(bool);

        System.out.println("Wrapper objects created successfully.\n");

        // Autoboxing (primitive → wrapper)
        Integer autoBoxed = 100; // Compiler converts to Integer.valueOf(100)

        // Unboxing (wrapper → primitive)
        int unboxed = autoBoxed; // Compiler converts to autoBoxed.intValue()

        System.out.println("Autoboxed value: " + autoBoxed);
        System.out.println("Unboxed value: " + unboxed + "\n");

        // Wrapper class methods
        String numStr = "123";
        int parsed = Integer.parseInt(numStr);
        System.out.println("Parsed integer: " + parsed);

        String hexStr = "FF";
        int hexParsed = Integer.parseInt(hexStr, 16);
        System.out.println("Hex parsed value: " + hexParsed);

        // Converting wrapper to String
        Integer num = 456;
        String str = num.toString();
        System.out.println("Converted to String: " + str + "\n");

        // Comparison of wrapper objects
        Integer a = 100;
        Integer b1 = 100;
        Integer c1 = 200;
        Integer d1 = 200;

        System.out.println("Comparison:");
        System.out.println("a == b1 : " + (a == b1));           // true (cached -128 to 127)
        System.out.println("c1 == d1 : " + (c1 == d1));         // false (not cached)
        System.out.println("c1.equals(d1) : " + c1.equals(d1)); // true (value comparison)\n");

        // Integer constants
        System.out.println("Integer Constants:");
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);
        System.out.println("Size: " + Integer.SIZE + " bits\n");

        // Utility methods
        System.out.println("Utility Methods:");
        System.out.println("Compare (10, 20): " + Integer.compare(10, 20));
        System.out.println("Max (10, 20): " + Integer.max(10, 20));
        System.out.println("Min (10, 20): " + Integer.min(10, 20) + "\n");

        // Character class methods
        char ch = 'a';
        System.out.println("Character Methods:");
        System.out.println("Is digit: " + Character.isDigit(ch));
        System.out.println("Is letter: " + Character.isLetter(ch));
        System.out.println("To upper case: " + Character.toUpperCase(ch) + "\n");

        // Boolean class methods
        Boolean bool1 = Boolean.parseBoolean("true");
        System.out.println("Boolean value: " + bool1 + "\n");

        // Null handling with wrapper class
        Integer nullInteger = null;
        // int primitive = nullInteger; // This would throw NullPointerException

        int safe = (nullInteger != null) ? nullInteger : 0;
        System.out.println("Safe value after null handling: " + safe);

        System.out.println("\n===== END =====");
    }
}

