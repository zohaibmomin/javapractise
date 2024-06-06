package in.com.challengeExecutorThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingPrintNameSleep {
    public static void main(String[] args) {
        //Trying to create multiple tasks
        //task will Sleep for 1 to 5 while printing
        //if not complete then emergency shutdown
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            for (int i = 0; i < 10; i++) {
                PrintNameSleep p1 = new PrintNameSleep();
                service.submit(p1);
            }

            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("\nEMERGENCY SHUTDOWN");
                service.shutdownNow();

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
