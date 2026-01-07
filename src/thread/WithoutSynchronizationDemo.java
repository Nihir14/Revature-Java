package thread;

public class WithoutSynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {

        CounterWithoutSync counter = new CounterWithoutSync();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Expected = 2000, but usually LESS due to race condition
        System.out.println("Final Counter Value (Without Sync): " + counter.getCount());
    }
}
