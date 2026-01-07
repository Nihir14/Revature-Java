package thread;

/*
 * Demonstrates multithreading using Runnable interface
 */
public class MultithreadingRunnableDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new CookingJob("Soup"), "Chef-1");
        Thread t2 = new Thread(new CookingJob("Pizza"), "Chef-2");
        Thread t3 = new Thread(new CookingJob("Burger"), "Chef-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
