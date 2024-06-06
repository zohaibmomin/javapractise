package in.com.challengeExecutorThreads;

import java.util.concurrent.Callable;

public class CalFactorial implements Callable<Integer> {
    private final int number;

    public CalFactorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public Integer call() throws Exception {
        Thread.sleep(4000);
        return factorial(number);
    }

    private int factorial(int num){
        if (num == 1) {
            return 1;
        }

        return num * factorial(num -1);
    }

}
