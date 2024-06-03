package in.com.multithreading;

public class TestingMultithreading {
    public static void main(String[] args) {
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First Thread");
        t1.start();

        System.out.println("\nStarting Second Thread");
        t2.start();

        System.out.println("\nStarting Third Thread");
        t3.start();
    }
}
