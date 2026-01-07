package thread;

/*
 * Demonstrates all major Thread States in Java:
 *
 * 1. NEW               -> Thread object created, start() not called
 * 2. RUNNABLE          -> start() called, thread ready/running
 * 3. BLOCKED           -> Waiting to acquire monitor lock
 * 4. WAITING           -> wait() called, waiting indefinitely
 * 5. TIMED_WAITING     -> sleep(time) or wait(time)
 * 6. TERMINATED        -> run() completed
 */

public class ThreadStatesDemo {

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        // ---------- NEW STATE ----------
        Thread t1 = new Thread(new Worker(), "Worker-Thread");
        System.out.println("State after creation: " + t1.getState()); // NEW

        // ---------- RUNNABLE STATE ----------
        t1.start();
        System.out.println("State after start(): " + t1.getState()); // RUNNABLE

        // ---------- TIMED_WAITING STATE ----------
        Thread.sleep(200);

        // ---------- BLOCKED STATE ----------
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread-2 acquired lock");
            }
        }, "Blocked-Thread");

        synchronized (lock) {
            t2.start();
            Thread.sleep(200);
            System.out.println("State of t2 (BLOCKED): " + t2.getState());
        }

        // ---------- WAITING STATE ----------
        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // WAITING
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Waiting-Thread");

        t3.start();
        Thread.sleep(200);
        System.out.println("State of t3 (WAITING): " + t3.getState());

        // Wake up waiting thread
        synchronized (lock) {
            lock.notify();
        }

        // ---------- TERMINATED STATE ----------
        t1.join();
        System.out.println("State after completion: " + t1.getState()); // TERMINATED
    }
}

/*
 * Worker thread used to demonstrate RUNNABLE and TIMED_WAITING
 */
class Worker implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " running");
            Thread.sleep(1000); // TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
