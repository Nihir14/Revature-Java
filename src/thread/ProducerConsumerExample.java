package thread;

/*
 Producer-Consumer Problem
 -------------------------
 Producer  -> produces data
 Consumer  -> consumes data
 SharedBuffer -> common shared resource

 Uses:
 - synchronized
 - wait()
 - notify()
 - avoids race condition & data inconsistency
*/

class SharedBuffer {

    private int item;
    private boolean available = false;

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {

        while (available) {
            wait(); // wait if item already produced
        }

        item = value;
        available = true;

        System.out.println("Produced: " + item);
        notify(); // notify consumer
    }

    // Consumer method
    public synchronized int consume() throws InterruptedException {

        while (!available) {
            wait(); // wait if no item available
        }

        available = false;
        System.out.println("Consumed: " + item);
        notify(); // notify producer

        return item;
    }
}

class Producer implements Runnable {

    private SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {

    private SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerExample {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Thread producerThread = new Thread(new Producer(buffer), "Producer-Thread");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer-Thread");

        producerThread.start();
        consumerThread.start();
    }
}
