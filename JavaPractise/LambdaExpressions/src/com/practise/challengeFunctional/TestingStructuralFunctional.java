package com.practise.challengeFunctional;

import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class TestingStructuralFunctional {
    public static void main(String[] args) {
        int number = 9;
        int result1 = calculateFactorial(number);
        System.out.printf("Using Structural :: Factorial of %s is %s\n",number,result1);

        IntStream streamIntegers = IntStream.rangeClosed(2, number);
        OptionalInt reducedResult = streamIntegers.reduce((a, b) -> a * b);
        reducedResult.ifPresent(s-> System.out.printf("Using Functional :: Factorial of %s is %s\n",number,s));
    }


    public static int calculateFactorial(int a){
        if ( a == 0 || a == 1) return 1;
        return a * calculateFactorial(a-1);
    }
}
