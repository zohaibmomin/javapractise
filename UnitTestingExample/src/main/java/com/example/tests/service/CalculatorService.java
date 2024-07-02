package com.example.tests.service;

public class CalculatorService {

    public static int sumOfTwoNumbers(int a, int b) throws InterruptedException {
        Thread.sleep(200);
        return a + b;
    }

    public static int productOfTwoNumbers(int a, int b) {
        return a * b;
    }

    public static int sumOfAnyNumbers(int... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
