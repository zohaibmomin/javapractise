package in.com.challengeThreads;

public class ThreadState extends Thread{
    @Override
    public void run() {
        System.out.println("Thread state is inside run -- " + getState());
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
