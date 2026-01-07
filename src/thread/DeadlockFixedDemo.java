package thread;

public class DeadlockFixedDemo {

    static final Object LOCK1 = new Object();
    static final Object LOCK2 = new Object();

    public static void main(String[] args) {

        Runnable task = () -> {
            synchronized (LOCK1) {
                System.out.println(Thread.currentThread().getName() + " acquired LOCK1");

                synchronized (LOCK2) {
                    System.out.println(Thread.currentThread().getName() + " acquired LOCK2");
                }
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
