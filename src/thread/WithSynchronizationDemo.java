package thread;

public class WithSynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {

        CounterWithSync counter = new CounterWithSync();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread-1 completed");
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            System.out.println("Thread-2 completed");
        });

        t1.start();
        t2.start();

        // main thread waits
        t1.join();
        t2.join();

        // Always correct
        System.out.println("Final Counter Value (With Sync): " + counter.getCount());
    }
}
