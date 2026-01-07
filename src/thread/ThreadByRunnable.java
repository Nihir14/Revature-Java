package thread;

/*
 * Creating thread by implementing Runnable interface
 * This approach is preferred because Java supports single inheritance
 */
public class ThreadByRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + " - Task: " + i
            );

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted");
            }
        }
    }
}
