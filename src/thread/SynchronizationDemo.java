package thread;

/*
 * Demonstrates synchronization using two threads
 * Both threads share the same Counter object
 */
public class SynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter(); // shared resource

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread-1 finished execution");
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread-2 finished execution");
        });

        // Start both threads
        t1.start();
        t2.start();

        // Main thread waits until t1 completes
        t1.join();

        // Main thread waits until t2 completes
        t2.join();

        // Final result
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
