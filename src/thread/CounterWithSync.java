package thread;

/*
 * Shared resource WITH synchronization
 * Data inconsistency is avoided
 */
public class CounterWithSync {

    private int count = 0;

    // synchronized method
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
