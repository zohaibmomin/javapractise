package com.practise.operations;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestTerminalOps {
    public static void main(String[] args) {
        //Max,Min,Collect

        List<Integer> numbers = List.of(1,7,6,7,11,22,33,2,3,4,5,-44,2,3);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.printf("Max is %s\n",max.get());

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.printf("Min is %s\n",min.get());

        List<Integer> list = numbers.stream().collect(Collectors.toList());
        System.out.printf("List is %s",list);
    }
}
