package in.com.multithreading.threadClass;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%s# ",i);
        }
        System.out.printf("\nThird Task # Completed %s , ",Thread.currentThread().getName());
    }
}
