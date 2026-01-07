package thread;

/*
 * Runnable task representing a cooking job
 */
public class CookingJob implements Runnable {

    private String task;

    public CookingJob(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(
            task + " is being prepared by " +
            Thread.currentThread().getName()
        );

        try {
            Thread.sleep(500); // simulate work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println(
            task + " prepared by " +
            Thread.currentThread().getName()
        );
    }
}
