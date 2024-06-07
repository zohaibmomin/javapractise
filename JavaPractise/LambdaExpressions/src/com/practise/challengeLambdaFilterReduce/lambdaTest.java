package com.practise.challengeLambdaFilterReduce;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

interface Product{
    int multiply(int a,int b);
}
public class lambdaTest {
    public static void main(String[] args) {
        //Lambda expression to two integers and multiply
        Product ab = (a,b)->(a*b);
        System.out.println(ab.multiply(10,20));

        //Another way
        BinaryOperator<Integer> mul = (a, b) -> (a * b);
        int result = mul.apply(2, 3);
        System.out.println(result);

    }
}
