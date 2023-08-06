package java9newfeatures.flowapi;

import java.util.concurrent.Flow;

public class MySubscriber<T> implements Flow.Subscriber<T> {
    private Flow.Subscription subscription;
    private String subscriberName;

    public MySubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription=subscription;
        this.subscription.request(1);

    }

    @Override
    public void onNext(T item) {
        System.out.println(item);
        try {
            System.out.println(this.subscriberName+ " - " +item+" is processing");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("done");
    }
}
