package in.com.challengeExecutorThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClassPrintNumbers {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            PrintNumbersSingleThread p1 = new PrintNumbersSingleThread();
            service.submit(p1);
            service.shutdown();
        }
    }
}
