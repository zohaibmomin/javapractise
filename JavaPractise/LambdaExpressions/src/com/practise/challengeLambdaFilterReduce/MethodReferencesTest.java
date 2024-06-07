package com.practise.challengeLambdaFilterReduce;

import java.util.List;

public class MethodReferencesTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,11,22,33,44,55,66,77);
        System.out.println("Normal Lambda for printing");
        numbers.stream()
                .filter(num->num % 2 == 1)
                .forEach(no-> System.out.println(no));

        System.out.println("Using Method References instead of Lambda for printing");
        numbers.stream()
                .filter(num->num % 2 == 1)
                .forEach(System.out::println);


        System.out.println("Normal Lambda for addition");
        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        System.out.println("Using Method References instead of  Lambda for addition");
        int result1 = numbers.stream().reduce(0,Integer::sum);
        System.out.println(result1);
    }
}
