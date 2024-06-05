package in.com.challengeThreads;

public class SignalThreadClass extends Thread{
    private final String color;

    public SignalThreadClass(String color) {
        this.color = color;
    }

    @Override
    public void run() {

        try {
            System.out.printf("\nActive, %s",color);
            sleep(1000);
            System.out.printf("\nInActive, %s",color);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
