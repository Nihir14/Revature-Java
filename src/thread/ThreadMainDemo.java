package thread;

/*
 * Main class to start threads
 */
public class ThreadMainDemo {

    public static void main(String[] args) {

        // ---- Thread using Thread class ----
        ThreadByExtending t1 = new ThreadByExtending();
        ThreadByExtending t2 = new ThreadByExtending();

        t1.setName("Thread-Ext-1");
        t2.setName("Thread-Ext-2");

        t1.start(); // invokes run()
        t2.start();

        // ---- Thread using Runnable interface ----
        ThreadByRunnable task = new ThreadByRunnable();

        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);

        t3.setName("Thread-Run-1");
        t4.setName("Thread-Run-2");

        t3.start();
        t4.start();
    }
}
