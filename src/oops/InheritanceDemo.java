package oops;

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}
