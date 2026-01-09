package reflectionapi;

public class GetClassObjectDemo {

    public static void main(String[] args) throws Exception {

        // 1. Using .class
        Class<Employee> c1 = Employee.class;

        // 2. Using getClass()
        Employee emp = new Employee();
        Class<?> c2 = emp.getClass();

        // 3. Using Class.forName()
        Class<?> c3 = Class.forName("reflectionapi.Employee");

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
    }
}
