package in.com.challengeExecutorThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        //make list of promises
        List<Future<Integer>> futureList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            //Constructor of number to calculate - Callable class reference
            CalFactorial fact1 = new CalFactorial(i);

            // get future promise of the service
            Future<Integer> future1 = service.submit(fact1);
            futureList.add(future1);
        }

        for (Future<Integer> future : futureList) {
            System.out.printf("\nFactorial , %s",future.get());
        }

        service.shutdown();

        if(!service.awaitTermination(2, TimeUnit.SECONDS)){
            System.out.println("\nEMERGENCY SHUTDOWN");
            service.shutdownNow();
        }
    }
}
