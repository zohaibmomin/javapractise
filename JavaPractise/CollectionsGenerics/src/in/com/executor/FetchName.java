package in.com.executor;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private final String name;

    public FetchName(String name) throws InterruptedException {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);//basically simulate something you are fecthing from db
        return " Hello " + name;
    }
}
