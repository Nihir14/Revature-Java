package reflectionapi;

public class Employee {

    private int id;
    private String name;

    public Employee() {
        System.out.println("Employee default constructor");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    private void secretMethod() {
        System.out.println("Private method invoked");
    }
}
