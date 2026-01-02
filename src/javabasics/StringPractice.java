package javabasics;/*
 * String Practice File
 * Day-wise Java Training Practice
 * Topic: String
 * Author: Nihir
 */

public class StringPractice {

    public static void main(String[] args) {

        System.out.println("===== STRING PRACTICE START =====\n");

        // 1. Creating String using literal
        String s1 = "Java";
        System.out.println("1. String literal: " + s1);

        // 2. Creating String using new keyword
        String s2 = new String("Java");
        System.out.println("2. String using new keyword: " + s2);

        // 3. Comparing Strings using ==
        System.out.println("\n3. Using == operator:");
        System.out.println(s1 == s2); // false (different memory)

        // 4. Comparing Strings using equals()
        System.out.println("\n4. Using equals() method:");
        System.out.println(s1.equals(s2)); // true (content same)

        // 5. String length
        String name = "Nihir Verma";
        System.out.println("\n5. Length of string:");
        System.out.println(name.length());

        // 6. Convert to upper and lower case
        System.out.println("\n6. Uppercase and Lowercase:");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // 7. Character at specific index
        System.out.println("\n7. Character at index 2:");
        System.out.println(name.charAt(2));

        // 8. Substring
        System.out.println("\n8. Substring:");
        System.out.println(name.substring(0, 5));

        // 9. Contains
        System.out.println("\n9. Contains word 'Verma':");
        System.out.println(name.contains("Verma"));

        // 10. Replace
        System.out.println("\n10. Replace:");
        String replaced = name.replace("Verma", "Kumar");
        System.out.println(replaced);

        // 11. Trim
        String extraSpace = "   Java Training   ";
        System.out.println("\n11. Trim:");
        System.out.println(extraSpace.trim());

        // 12. Split
        System.out.println("\n12. Split:");
        String sentence = "Java is very powerful";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // 13. StartsWith and EndsWith
        System.out.println("\n13. StartsWith & EndsWith:");
        System.out.println(sentence.startsWith("Java"));
        System.out.println(sentence.endsWith("powerful"));

        // 14. String concatenation
        System.out.println("\n14. Concatenation:");
        String a = "Hello";
        String b = "World";
        System.out.println(a + " " + b);

        // 15. String immutability example
        System.out.println("\n15. Immutability:");
        String str = "Java";
        str.concat(" Language");
        System.out.println(str); // Java (unchanged)

        // 16. Using StringBuilder (mutable)
        System.out.println("\n16. StringBuilder:");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Language");
        System.out.println(sb);

        // 17. Reverse a string
        System.out.println("\n17. Reverse String:");
        String original = "Training";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println(reversed);

        // 18. Count vowels
        System.out.println("\n18. Count vowels:");
        String text = "education";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels count: " + count);

        // 19. Palindrome check
        System.out.println("\n19. Palindrome Check:");
        String pal = "madam";
        String rev = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            rev += pal.charAt(i);
        }
        if (pal.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // 20. Empty and isBlank
        System.out.println("\n20. isEmpty & isBlank:");
        String empty = "";
        String blank = "   ";
        System.out.println(empty.isEmpty());
        System.out.println(blank.isBlank());

        System.out.println("\n===== STRING PRACTICE END =====");
    }
}
