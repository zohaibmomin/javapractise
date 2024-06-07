package com.practise.challengeLambdaFilterReduce;

import java.util.List;
import java.util.stream.Stream;

public class FilterPrintNum {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5,6,7,99,66,77,33,111);

        Stream<Integer> result = numList.stream().filter(num -> (num % 2 != 0));

        System.out.println("Odd nos are \n ");
        result.forEach(num-> System.out.printf("%d ",num));
    }
}
