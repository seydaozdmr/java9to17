package java9newfeatures;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


public class HttpClientApp {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req =
                HttpRequest.newBuilder(URI.create("http://www.google.com"))
                        .header("User-Agent", "Java")
                        .GET()
                        .build();
        //HttpResponse resp = client.send(req,HttpResponse.BodyHandlers.ofString());
        CompletableFuture completableFuture=client.sendAsync(req,HttpResponse.BodyHandlers.ofString());
        completableFuture.completeOnTimeout(new Object(),1000, TimeUnit.MILLISECONDS);

        System.out.println(completableFuture.get());
        //System.out.println(resp.body());

    }
}
