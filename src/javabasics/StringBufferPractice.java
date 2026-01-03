package javabasics;

/*
 * StringBuffer Practice File
 * Java Training – StringBuffer Methods
 * Author: Nihir
 */

// StringBuilder is faster but not thread-safe, while StringBuffer is thread-safe due to synchronization but slower in performance.
//

public class StringBufferPractice {

    public static void main(String[] args) {

        System.out.println("===== STRINGBUFFER PRACTICE =====\n");

        // 1. Creating StringBuffer
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Initial value: " + sb);

        // 2. append()
        sb.append(" Programming");
        System.out.println("After append(): " + sb);

        // 3. insert()
        sb.insert(4, " Language");
        System.out.println("After insert(): " + sb);

        // 4. replace()
        sb.replace(0, 4, "Core");
        System.out.println("After replace(): " + sb);

        // 5. delete()
        sb.delete(4, 13);
        System.out.println("After delete(): " + sb);

        // 6. deleteCharAt()
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(): " + sb);

        // 7. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // Reverse back for further operations
        sb.reverse();

        // 8. charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 9. length()
        System.out.println("Length: " + sb.length());

        // 10. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 11. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(): " + sb.capacity());

        // 12. setCharAt()
        sb.setCharAt(0, 'J');
        System.out.println("After setCharAt(): " + sb);

        // 13. substring()
        String sub = sb.substring(0, 4);
        System.out.println("Substring (0 to 4): " + sub);

        // 14. toString()
        String converted = sb.toString();
        System.out.println("Converted to String: " + converted);

        // 15. setLength()
        sb.setLength(4);
        System.out.println("After setLength(): " + sb);

        // 16. append different data types
        sb.append(100);
        sb.append(true);
        sb.append(25.5);
        System.out.println("Append multiple data types: " + sb);

        System.out.println("\n===== END =====");
    }
}
