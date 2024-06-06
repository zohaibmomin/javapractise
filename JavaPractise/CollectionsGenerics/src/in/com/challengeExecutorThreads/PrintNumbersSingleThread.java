package in.com.challengeExecutorThreads;

public class PrintNumbersSingleThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("\n Number is %d",i);
        }
    }
}
