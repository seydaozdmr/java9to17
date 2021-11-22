package java9newfeatures;

import java.util.concurrent.*;

public class CompletableFutureApp {
    public static void main(String[] args) throws InterruptedException {
//        try {
//            Future<String> future=calculateAsync();
//            String result=future.get();
//            System.out.println(result.equals("Hello World"));
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->"Hello world").completeOnTimeout("Hello world1",Long.valueOf(1000),TimeUnit.MILLISECONDS);
//        try {
//            System.out.println(completableFuture.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        //completeOnTimeOut() method completes the CompletableFuture with the provided value.
        // If not, it complete before the given timeout.
//        CompletableFuture.supplyAsync(()->{
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "World";
//            }).completeOnTimeout("Hello", 10000L,TimeUnit.MILLISECONDS)
//                .thenAccept(System.out::println);
//        TimeUnit.SECONDS.sleep(10);
        //The orTimeout() method can be used to specify that if a given task doesn't complete within a certain period of time,
        // the program stops execution and throws TimeoutException
//        CompletableFuture.supplyAsync(()->{
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "hello world"; })
//                .orTimeout(10000,TimeUnit.MILLISECONDS)
//                .whenComplete((result, exception) -> {
//                    System.out.println(result);
//                    if(exception != null)
//                        exception.printStackTrace();
//                });
//        TimeUnit.SECONDS.sleep(10);




        ExecutorService executors= Executors.newFixedThreadPool(1);
        CompletableFuture.supplyAsync(()->{
            try{
                TimeUnit.SECONDS.sleep(3);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello my java";
        }).thenApplyAsync(String::toUpperCase,executors)
        .thenAccept(System.out::println);
        TimeUnit.SECONDS.sleep(5);



    }

    public static Future<String> calculateAsync() throws InterruptedException{
        CompletableFuture<String> completableFuture=new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(()->{
            Thread.sleep(1000);
            completableFuture.complete("Hello World");
            return null;
        });
        return completableFuture;
    }
}
