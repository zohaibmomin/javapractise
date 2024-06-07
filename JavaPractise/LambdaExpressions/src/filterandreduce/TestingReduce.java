package filterandreduce;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,99,5,6,3,10,33);

        System.out.println("Reduce sample");
        int result = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.printf("Value is %d", result);

        System.out.println("\nReduce sample using Lambda");

        int finalVal = numbers.stream().reduce(0,(num1,num2)->num1+num2);
        System.out.printf("Value is %d", finalVal);

        int maxVal = numbers.stream().reduce(0,(num1,num2)->Math.max(num1,num2));
        System.out.printf("Value is %d", maxVal);


    }
}
