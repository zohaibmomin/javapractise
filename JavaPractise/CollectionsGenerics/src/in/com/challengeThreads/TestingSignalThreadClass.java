package in.com.challengeThreads;

public class TestingSignalThreadClass {
    public static void main(String[] args) throws InterruptedException {
        SignalThreadClass s1 = new SignalThreadClass("RED");
        SignalThreadClass s2 = new SignalThreadClass("YELLOW");
        SignalThreadClass s3 = new SignalThreadClass("GREEN");

           s1.start();
           s1.join();

           s2.start();
           s2.join();

           s3.start();
           s3.join();


    }
}
