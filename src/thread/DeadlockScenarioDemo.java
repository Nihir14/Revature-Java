package thread;

/*
 * Demonstrates DEADLOCK situation
 * Two threads trying to acquire two resources in opposite order
 */
public class DeadlockScenarioDemo {

    // Two shared resources
    private static final String RESOURCE_ONE = "Hello Welcome to Scaler!";
    private static final String RESOURCE_TWO = "Visit Scaler!";

    public static void main(String[] args) {

        // Thread T1
        Thread threadOne = new Thread(() -> {

            synchronized (RESOURCE_ONE) {
                System.out.println("Thread T1 locked -> RESOURCE_ONE");

                try {
                    Thread.sleep(100); // pause to increase deadlock chance
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (RESOURCE_TWO) {
                    System.out.println("Thread T1 locked -> RESOURCE_TWO");
                }
            }
        });

        // Thread T2
        Thread threadTwo = new Thread(() -> {

            synchronized (RESOURCE_TWO) {
                System.out.println("Thread T2 locked -> RESOURCE_TWO");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (RESOURCE_ONE) {
                    System.out.println("Thread T2 locked -> RESOURCE_ONE");
                }
            }
        });

        // Starting both threads
        threadOne.start();
        threadTwo.start();
    }
}
