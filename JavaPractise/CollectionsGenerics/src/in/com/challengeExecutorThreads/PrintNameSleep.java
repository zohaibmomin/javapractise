package in.com.challengeExecutorThreads;

public class PrintNameSleep implements Runnable{
    @Override
    public void run() {
        try {
            System.out.printf("\nStart Current thread is %s", Thread.currentThread().getName());
            Thread.sleep(getSleepTime() *1000);
            System.out.printf("\nEnd Current thread is %s", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private int getSleepTime(){
        return (int) (Math.random() * 5) +1;
    }
}
