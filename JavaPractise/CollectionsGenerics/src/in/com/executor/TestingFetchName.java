package in.com.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFetchName {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        FetchName f1 = new FetchName("Zohaib");
        FetchName f2 = new FetchName("Neha");
        FetchName f3 = new FetchName("Nazia");

        Future<String> fut1 = service.submit(f1);
        Future<String> fut2 = service.submit(f2);
        Future<String> fut3 = service.submit(f3);

        System.out.printf("\n Name is %s",fut1.get());
        System.out.printf("\n Name is %s",fut2.get());
        System.out.printf("\n Name is %s",fut3.get());

        service.shutdown();
    }
}
