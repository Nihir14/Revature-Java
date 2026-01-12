package reactive;

import java.util.concurrent.Flow;

class OrderProcessor implements Flow.Processor<Order, Order> {

    private Flow.Subscription subscription;
    private Flow.Subscriber<? super Order> subscriber;

    @Override
    public void subscribe(Flow.Subscriber<? super Order> subscriber) {
        this.subscriber = subscriber;

        subscriber.onSubscribe(new Flow.Subscription() {
            @Override
            public void request(long n) {
                // controlled by upstream
            }

            @Override
            public void cancel() {
            }
        });
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Order order) {
        order.status = "PROCESSED";
        System.out.println("Processing: " + order);

        subscriber.onNext(order);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        subscriber.onError(throwable);
    }

    @Override
    public void onComplete() {
        subscriber.onComplete();
    }
}
