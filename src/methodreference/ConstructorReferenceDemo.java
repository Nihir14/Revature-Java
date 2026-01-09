package methodreference;

import java.util.function.Supplier;

class Employee {

    Employee() {
        System.out.println("Employee object created");
    }
}

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        // Lambda
        Supplier<Employee> lambda =
                () -> new Employee();

        // Constructor Reference
        Supplier<Employee> methodRef =
                Employee::new;

        methodRef.get();
    }
}
