package com.example.tests.service;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorServiceTest {
    @Test
    public void sumOfTwo(){
        int result = CalculatorService.sumOfTwoNumbers(1,2);
        int expected = 3;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void productOfTwo(){
        int result = CalculatorService.productOfTwoNumbers(1,2);
        int expected = 2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void sumOfAnyNumbers(){
        int result = CalculatorService.sumOfAnyNumbers(1,2,3,4);
        int expected  =11;
        Assert.assertEquals(expected,result);
    }
}
