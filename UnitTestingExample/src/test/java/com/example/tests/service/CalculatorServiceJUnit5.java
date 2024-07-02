package com.example.tests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceJUnit5 {
    @Test
    public void sumOfTwo() throws InterruptedException {
        System.out.println("Test Case :: sumOfTwo");
        int result = CalculatorService.sumOfTwoNumbers(1,2);
        int expected = 30;
        Assertions.assertEquals(expected,result,"Failed testcase :: sumOfTwo");
    }

    @Test
    public void productOfTwo(){
        System.out.println("Test Case :: productOfTwo");
        int result = CalculatorService.productOfTwoNumbers(1,2);
        int expected = 2;
        Assertions.assertEquals(expected,result);
    }
}
