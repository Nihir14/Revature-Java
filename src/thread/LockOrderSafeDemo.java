package thread;

/*
 * Deadlock-free example using proper lock ordering
 * Both threads acquire locks in the SAME order
 */
public class LockOrderSafeDemo {

    // Shared resources
    private static final Object LOCK_A = new Object();
    private static final Object LOCK_B = new Object();

    public static void main(String[] args) {

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (LOCK_A) {
                System.out.println("Thread T1 acquired LOCK_A");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (LOCK_B) {
                    System.out.println("Thread T1 acquired LOCK_B");
                }
            }
        });

        // Thread 2 (same lock order → no deadlock)
        Thread t2 = new Thread(() -> {
            synchronized (LOCK_A) {
                System.out.println("Thread T2 acquired LOCK_A");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (LOCK_B) {
                    System.out.println("Thread T2 acquired LOCK_B");
                }
            }
        });

        // Start threads
        t1.start();
        t2.start();
    }
}
