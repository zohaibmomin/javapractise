package in.com.multithreading.synchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);



        try{
            t1.start();
            t2.start();

            t1.join();
            t2.join();
            System.out.printf("Counter value is %d ", counter.getCount());
        }catch (Exception e){
            System.out.printf("Exception %s , ",e.getMessage());
        }
    }
}
