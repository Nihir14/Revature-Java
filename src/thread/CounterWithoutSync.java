package thread;

/*
 * Shared resource WITHOUT synchronization
 * This will cause data inconsistency
 */
public class CounterWithoutSync {

    int count = 0;

    // NOT synchronized
    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
