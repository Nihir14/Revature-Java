package reflectionapi;

public class ClassMetadataDemo {

    public static void main(String[] args) {

        Class<Employee> cls = Employee.class;

        System.out.println("Class Name: " + cls.getName());
        System.out.println("Superclass: " + cls.getSuperclass().getName());

        System.out.println("Methods:");
        for (var m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("Fields:");
        for (var f : cls.getDeclaredFields()) {
            System.out.println(f.getName());
        }
    }
}
