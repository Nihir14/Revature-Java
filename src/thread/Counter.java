package thread;

/*
 * Shared resource class
 * Demonstrates synchronization to avoid data inconsistency
 */
public class Counter {

    private int count = 0;

    // synchronized method - only one thread can execute at a time
    public synchronized void increment() {
        count++;
    }

    // synchronized getter
    public synchronized int getCount() {
        return count;
    }
}
