package thread;

public class DeadlockDemo {

    // Two shared resources
    static final Object LOCK1 = new Object();
    static final Object LOCK2 = new Object();

    public static void main(String[] args) {

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (LOCK1) {
                System.out.println("Thread 1: Holding LOCK1");

                try {
                    Thread.sleep(100); // pause to increase deadlock chance
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for LOCK2");
                synchronized (LOCK2) {
                    System.out.println("Thread 1: Acquired LOCK2");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (LOCK2) {
                System.out.println("Thread 2: Holding LOCK2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for LOCK1");
                synchronized (LOCK1) {
                    System.out.println("Thread 2: Acquired LOCK1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
