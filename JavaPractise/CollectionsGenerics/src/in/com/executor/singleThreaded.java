package in.com.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class singleThreaded {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executors = Executors.newSingleThreadExecutor();//single thread
        ExecutorService executors = Executors.newFixedThreadPool(3);

        PrintTask p1  = new PrintTask("#");
        PrintTask p2  = new PrintTask("$");
        PrintTask p3  = new PrintTask("*");

        executors.submit(p1);
        executors.submit(p2);
        executors.submit(p3);

        executors.shutdown();

        if(!executors.awaitTermination(5000, TimeUnit.MILLISECONDS)){
            //This is used to wait for above tasks to complete
            // If not complete within specified time then shutdown immediately
            System.out.println("Not completed.. so shuttingdown now");
            executors.shutdownNow();
        }
    }
}
