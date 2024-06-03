package in.com.multithreading;

public class SecondTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%s$ ",i);
        }
        System.out.printf("\nSecond Task $ Completed %s , ",Thread.currentThread().getName());
    }
}
