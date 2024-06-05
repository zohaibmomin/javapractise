package in.com.multithreading.synchronize;

public class Counter {
    public int count=0;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public synchronized void incrementCounter(){
        count++;
    }
}
