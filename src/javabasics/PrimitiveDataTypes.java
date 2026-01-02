package javabasics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // 1. BYTE - 8-bit signed integer
        byte byteMin = -128;
        byte byteMax = 127;
        byte byteVar = 100;
        System.out.println("byte: " + byteVar);
        System.out.println("byte size: " + Byte.SIZE + " bits");
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // 2. SHORT - 16-bit signed integer
        short shortMin = -32768;
        short shortMax = 32767;
        short shortVar = 1000;
        System.out.println("\nshort: " + shortVar);
        System.out.println("short size: " + Short.SIZE + " bits");
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        // 3. INT - 32-bit signed integer (most commonly used)
        int intMin = -2147483648;
        int intMax = 2147483647;
        int intVar = 100000;
        System.out.println("\nint: " + intVar);
        System.out.println("int size: " + Integer.SIZE + " bits");
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // 4. LONG - 64-bit signed integer
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;
        long longVar = 100000L; // Note the 'L' suffix
        System.out.println("\nlong: " + longVar);
        System.out.println("long size: " + Long.SIZE + " bits");
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // 5. FLOAT - 32-bit floating point
        float floatVar = 3.14f; // Note the 'f' suffix
        float floatPrecision = 123.456789f; // ~7 decimal digits precision
        System.out.println("\nfloat: " + floatVar);
        System.out.println("float size: " + Float.SIZE + " bits");
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        // 6. DOUBLE - 64-bit floating point (most commonly used for decimals)
        double doubleVar = 3.14159265359;
        double doublePrecision = 123.456789012345; // ~15 decimal digits precision
        System.out.println("\ndouble: " + doubleVar);
        System.out.println("double size: " + Double.SIZE + " bits");
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // 7. CHAR - 16-bit Unicode character
        char charVar = 'A';
        char charUnicode = '\u0041'; // 'A' in Unicode
        char charNumber = 65; // 'A' in ASCII
        System.out.println("\nchar: " + charVar);
        System.out.println("char unicode: " + charUnicode);
        System.out.println("char from number: " + charNumber);
        System.out.println("char size: " + Character.SIZE + " bits");

        // 8. BOOLEAN - true or false
        boolean boolTrue = true;
        boolean boolFalse = false;
        boolean boolExpression = (10 > 5);
        System.out.println("\nboolean: " + boolTrue);
        System.out.println("boolean expression: " + boolExpression);

    }
}
