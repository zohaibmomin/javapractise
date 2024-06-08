package com.practise.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of();
//        List<Integer> numbers = List.of(1,2,3,4);

        Optional<Integer> result = numbers.stream().reduce((num1, num2)->num1+num2);
        if(result.isPresent()){
            System.out.println(result);
        }else{
            System.out.println("Empty");
        }

    }
}
