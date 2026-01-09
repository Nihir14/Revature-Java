package reflectionapi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateAccessReflectionDemo {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee();

        Class<?> cls = emp.getClass();

        // Access private field
        Field nameField = cls.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(emp, "Sneha");

        // Access private method
        Method privateMethod = cls.getDeclaredMethod("secretMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(emp);
    }
}
