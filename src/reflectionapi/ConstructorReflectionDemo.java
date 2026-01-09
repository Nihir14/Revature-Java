package reflectionapi;

import java.lang.reflect.Constructor;

public class ConstructorReflectionDemo {

    public static void main(String[] args) throws Exception {

        Class<Employee> cls = Employee.class;

        // Get constructor
        Constructor<Employee> constructor =
                cls.getConstructor(int.class, String.class);

        // Create object dynamically
        Employee emp = constructor.newInstance(101, "Rahul");

        emp.showDetails();
    }
}
