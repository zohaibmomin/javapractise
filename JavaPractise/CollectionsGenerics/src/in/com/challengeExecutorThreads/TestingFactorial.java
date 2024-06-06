package in.com.challengeExecutorThreads;

import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            //Constructor of number to calculate - Callable class reference
            CalFactorial fact1 = new CalFactorial(i);

            // get future promise of the service
            Future<Integer> future1 = service.submit(fact1);
            System.out.printf("\nFactorial of %s is , %s",i,future1.get());
        }
//        System.out.println("Main thread ********");
        service.shutdown();

        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\nEMERGENCY SHUTDOWN");
            service.shutdownNow();
        }
    }
}
