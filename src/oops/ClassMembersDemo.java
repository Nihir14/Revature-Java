package oops;


/*
 * Class Members:
 * 1. Fields
 * 2. Methods
 * 3. Constructors
 * 4. Blocks
 * 5. Nested Classes
 */

public class ClassMembersDemo {

    // 1. Fields (state of an object)
    int id;
    String name;

    // 4. Instance block
    {
        System.out.println("Instance block executed");
    }

    // 4. Static block
    static {
        System.out.println("Static block executed");
    }

    // 3. Constructor
    ClassMembersDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 2. Method (behavior)
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // 5. Nested class
    class InnerClass {
        void show() {
            System.out.println("Inside Inner Class");
        }
    }

    public static void main(String[] args) {
        ClassMembersDemo obj = new ClassMembersDemo(1, "Nihir");
        obj.display();

        ClassMembersDemo.InnerClass inner = obj.new InnerClass();
        inner.show();
    }
}

