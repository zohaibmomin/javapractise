package com.practise.lambda;

import com.sun.source.tree.LambdaExpressionTree;

import java.util.function.IntBinaryOperator;

interface Addable{
    int add(int a, int b);
}
public class LambdaSample {
    public static void main(String[] args) {
        System.out.println("Hello");

        Runnable s = () -> System.out.println("I am running lambda");
        s.run();

        Addable g = (a,b)->a+b;
        System.out.println(g.add(10,20));



    }


}
