package thread;

/*
 * LIVELOCK example
 * Threads are active but keep responding to each other
 * No progress is made
 */

class Spoon {
    private Diner owner;

    Spoon(Diner owner) {
        this.owner = owner;
    }

    synchronized void use() {
        System.out.println(owner.getName() + " is eating with the spoon");
    }

    synchronized Diner getOwner() {
        return owner;
    }

    synchronized void setOwner(Diner owner) {
        this.owner = owner;
    }
}

class Diner {
    private String name;
    private boolean hungry = true;

    Diner(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    boolean isHungry() {
        return hungry;
    }

    void eatWith(Spoon spoon, Diner partner) {
        while (hungry) {

            // If partner is hungry, give spoon politely
            if (spoon.getOwner() != this) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            if (partner.isHungry()) {
                System.out.println(name + " says: You eat first, " + partner.getName());
                spoon.setOwner(partner);
                continue;
            }

            // Eat
            spoon.use();
            hungry = false;
            System.out.println(name + " has finished eating");
            spoon.setOwner(partner);
        }
    }
}

public class LiveLockDemoExample {

    public static void main(String[] args) {

        Diner alice = new Diner("Alice");
        Diner bob = new Diner("Bob");

        Spoon spoon = new Spoon(alice);

        Thread t1 = new Thread(() -> alice.eatWith(spoon, bob));
        Thread t2 = new Thread(() -> bob.eatWith(spoon, alice));

        t1.start();
        t2.start();
    }
}
