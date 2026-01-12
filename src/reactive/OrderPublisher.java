package reactive;

import java.util.concurrent.SubmissionPublisher;

class OrderPublisher extends SubmissionPublisher<Order> {

    void publish(Order order) {
        System.out.println("Publishing: " + order);
        submit(order);
    }
}
