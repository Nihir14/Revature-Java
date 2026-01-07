package thread;

/*
 * FIXED LIVELOCK example
 * Solution: Stop excessive politeness using a small delay + turn-based eating
 */

class FixedSpoon {
    private boolean available = true;

    public synchronized boolean isAvailable() {
        return available;
    }

    public synchronized void use() {
        available = false;
    }
}

class FixedPerson {
    private String name;
    private boolean hungry = true;

    FixedPerson(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eatWith(FixedSpoon spoon, FixedPerson partner) {

        while (hungry) {

            if (!spoon.isAvailable()) {
                try {
                    Thread.sleep(50); // 🔧 FIX: wait instead of busy spinning
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            // 🔧 FIX: allow one person to eat after some time
            if (partner.isHungry() && Math.random() < 0.7) {
                System.out.println(name + ": You eat first!");
                try {
                    Thread.sleep(50); // break livelock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            // Eat
            spoon.use();
            System.out.println(name + " is eating");
            hungry = false;
        }
    }
}

public class LiveLockFixedExample {

    public static void main(String[] args) {

        FixedSpoon spoon = new FixedSpoon();

        FixedPerson husband = new FixedPerson("Husband");
        FixedPerson wife = new FixedPerson("Wife");

        Thread t1 = new Thread(() -> husband.eatWith(spoon, wife));
        Thread t2 = new Thread(() -> wife.eatWith(spoon, husband));

        t1.start();
        t2.start();
    }
}
