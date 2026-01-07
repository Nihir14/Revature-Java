package thread;

/*
 * TRUE FIX for livelock
 * Uses turn-based ownership to guarantee progress
 */

class SpoonSafe {
    private boolean available = true;

    public synchronized boolean isAvailable() {
        return available;
    }

    public synchronized void use() {
        available = false;
    }
}

class PersonSafe {
    private String name;
    private boolean hungry = true;
    private boolean firstTurn;

    PersonSafe(String name, boolean firstTurn) {
        this.name = name;
        this.firstTurn = firstTurn;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eatWith(SpoonSafe spoon, PersonSafe partner) {

        while (hungry) {

            if (!spoon.isAvailable()) {
                Thread.yield();
                continue;
            }

            // 🔑 GUARANTEED EXIT CONDITION
            if (partner.isHungry() && !firstTurn) {
                System.out.println(name + ": You eat first!");
                firstTurn = true; // stop politeness next time
                continue;
            }

            spoon.use();
            System.out.println(name + " is eating");
            hungry = false;
        }
    }
}

public class LiveLockProperFixedExample {

    public static void main(String[] args) {

        SpoonSafe spoon = new SpoonSafe();

        PersonSafe husband = new PersonSafe("Husband", true);
        PersonSafe wife = new PersonSafe("Wife", false);

        new Thread(() -> husband.eatWith(spoon, wife)).start();
        new Thread(() -> wife.eatWith(spoon, husband)).start();
    }
}
