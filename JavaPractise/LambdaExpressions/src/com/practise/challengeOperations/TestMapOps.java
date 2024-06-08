package com.practise.challengeOperations;

import java.util.List;
import java.util.Optional;

public class TestMapOps {
    public static void main(String[] args) {
        List<String> stringList = List.of("1","2","-3","4","5");

        stringList.stream()
                .map(Integer::parseInt)
                .map((num) -> Math.pow(num, 2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        //Skills tested here
        //Map,Reduce,Streams,Optional Class

    }
}
