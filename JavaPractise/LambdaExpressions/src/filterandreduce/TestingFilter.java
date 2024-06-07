package filterandreduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args){
        System.out.println("Hello to Filter Reduce sample");

        List<String> mylist = Arrays.asList("Apple","Orange","banana");

        System.out.println("Print before streams. Traditional Loop");
        for (String fruit : mylist){
            System.out.println(fruit);
        }

        System.out.println("Print using streams");

        mylist.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("Print using Lambda streams");
        mylist.stream().forEach(fruit-> System.out.println(fruit));

        System.out.println("Print using Filter on Lambda streams");
        mylist.stream().filter(fruit->fruit.endsWith("a"))
        .forEach(fruit-> System.out.println(fruit));

    }
}
