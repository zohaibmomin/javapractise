package in.com.executor;

public class PrintTask implements Runnable{
    private String targetChar;

    public PrintTask(String targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public  void run() {
        try {
            Thread.sleep(1000);
            //        for (int i = 1; i <= 10; i++) {
            System.out.printf("\nThreadName %s %s ", Thread.currentThread().getName(),targetChar);
//        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String getTargetChar() {
        return targetChar;
    }
}
