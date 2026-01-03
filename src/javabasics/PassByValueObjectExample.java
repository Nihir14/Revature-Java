package javabasics;

/*
 * Pass By Value (Object) Example in Java
 * Java Training Practice
 * Author: Nihir
 */

class Student1 {

    int marks;

    Student1(int marks) {
        this.marks = marks;
    }
}

public class PassByValueObjectExample {

    // Method that modifies object data
    static void changeMarks(Student1 s) {
        s.marks = 90;
        System.out.println("Inside changeMarks(): " + s.marks);
    }

    // Method that tries to change reference
    static void changeReference(Student1 s) {
        s = new Student1(100);
        System.out.println("Inside changeReference(): " + s.marks);
    }

    public static void main(String[] args) {

        System.out.println("===== PASS BY VALUE (OBJECT) =====\n");

        Student1 st = new Student1(50);

        System.out.println("Before changeMarks(): " + st.marks);
        changeMarks(st);
        System.out.println("After changeMarks(): " + st.marks);

        System.out.println();

        Student1 st2 = new Student1(60);

        System.out.println("Before changeReference(): " + st2.marks);
        changeReference(st2);
        System.out.println("After changeReference(): " + st2.marks);

        System.out.println("\n===== END =====");
    }
}

