package pattern;

class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Private constructor
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Sample method
    public void showMessage() {
        System.out.println("Hello from Singleton class");
    }
}
