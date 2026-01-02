package javabasics;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ReferenceVariable {
    public static void main(String[] args) {
        Student student = new Student("James Bond", 18);
        Student student1 = student;

        student1.name = "Jay";

        System.out.println(student1.name);
        System.out.println(student.name);

    }
}
