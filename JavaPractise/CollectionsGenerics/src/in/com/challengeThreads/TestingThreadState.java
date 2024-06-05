package in.com.challengeThreads;

public class TestingThreadState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState s1 = new ThreadState();
        System.out.println("s1 state is create thread -- " + s1.getState());

        s1.start();
        s1.join();

        System.out.println("s1 state is finished -- " + s1.getState());

    }
}
