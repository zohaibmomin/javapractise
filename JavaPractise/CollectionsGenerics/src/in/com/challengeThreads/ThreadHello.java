package in.com.challengeThreads;

public class ThreadHello extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello from Thread - %s\n",getName());
        }
    }
}
