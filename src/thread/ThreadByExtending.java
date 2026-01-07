package thread;

/*
 * Creating thread by extending Thread class
 */
public class ThreadByExtending extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + " - Count: " + i
            );

            try {
                Thread.sleep(500); // pause execution
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
