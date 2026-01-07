package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("Head element: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
