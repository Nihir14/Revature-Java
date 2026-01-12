package pattern;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2); // true
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
