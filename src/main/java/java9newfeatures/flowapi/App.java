package java9newfeatures.flowapi;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class App {
    public static void main(String[] args) {
        List<Integer> items=List.of(1,2,3,4,5,6,7,8);

        SubmissionPublisher<Integer> publisher=new SubmissionPublisher<>();

        publisher.subscribe(new MySubscriber<>());


        items.forEach(s->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publisher.submit(s);
        });

        try {
            Thread.currentThread().join(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        publisher.close();
    }
}
