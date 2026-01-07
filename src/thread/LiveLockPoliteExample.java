package thread;

/*
 * LIVELOCK example
 * Threads are active, polite, but no progress is made
 */

class SharedSpoon {
    private boolean available = true;

    public synchronized boolean isAvailable() {
        return available;
    }

    public synchronized void use() {
        available = false;
    }
}

class PersonWorker {
    private String name;
    private boolean hungry = true;

    PersonWorker(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eatWith(SharedSpoon spoon, PersonWorker partner) {

        while (hungry) {

            // Spoon not available, keep trying
            if (!spoon.isAvailable()) {
                continue;
            }

            // Polite behavior causes livelock
            if (partner.isHungry()) {
                System.out.println(name + ": You eat first!");
                continue;
            }

            // Eat
            spoon.use();
            System.out.println(name + " is eating");
            hungry = false;
        }
    }
}

public class LiveLockPoliteExample {

    public static void main(String[] args) {

        SharedSpoon spoon = new SharedSpoon();

        PersonWorker person1 = new PersonWorker("Husband");
        PersonWorker person2 = new PersonWorker("Wife");

        Thread t1 = new Thread(() -> person1.eatWith(spoon, person2));
        Thread t2 = new Thread(() -> person2.eatWith(spoon, person1));

        t1.start();
        t2.start();
    }
}
