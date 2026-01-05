package oops;

public class BlockDemo {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    BlockDemo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new BlockDemo();
        new BlockDemo();
    }
}
