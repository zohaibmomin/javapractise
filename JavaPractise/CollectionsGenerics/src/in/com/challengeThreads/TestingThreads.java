package in.com.challengeThreads;

public class TestingThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadHello h1 = new ThreadHello();
        ThreadHello h2 = new ThreadHello();

        h1.start();
        h1.join(); //makes h1 finish and h2 wait till then
        h2.start();
    }
}
