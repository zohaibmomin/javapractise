package in.com.multithreading.runnableClass;

public class PrintTask implements Runnable{
    private final char chars;

    public PrintTask(char chars) {
        this.chars = chars;
    }
    public char getChars() {
        return chars;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%s%c ",i,getChars());
        }
        System.out.printf("\nPrint Task %c Completed %s , ",getChars(),Thread.currentThread().getName());
    }
}

