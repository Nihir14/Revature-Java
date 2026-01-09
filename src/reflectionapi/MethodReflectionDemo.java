package reflectionapi;

import java.lang.reflect.Method;

public class MethodReflectionDemo {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee(102, "Anita");

        Class<?> cls = emp.getClass();

        // Get all public methods
        Method[] methods = cls.getMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        // Invoke specific method
        Method showMethod = cls.getMethod("showDetails");
        showMethod.invoke(emp);
    }
}
