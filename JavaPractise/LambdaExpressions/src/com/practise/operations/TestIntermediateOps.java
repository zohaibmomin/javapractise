package com.practise.operations;

import java.util.List;
import java.util.stream.Collectors;

public class TestIntermediateOps {
    public static void main(String[] args) {
        //Sort,Distinct,Map

        List<Integer> numbers = List.of(1,7,6,7,11,22,33,2,3,4,5,-44,2,3);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.printf("Sorted Numbers %s\n",sortedNumbers);

        List<Integer> distinctList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.printf("Distinct Numbers %s\n",distinctList);

        List<Object> list = numbers.stream().map((num)->num * 2).collect(Collectors.toList());
        System.out.printf("Mapped Numbers (multiplied by 2) %s\n",list);


    }
}
