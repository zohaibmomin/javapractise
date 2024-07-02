package com.example.tests.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;


public class CalculatorServiceTest {
    @BeforeClass
    public static void beginning(){
        System.out.println("Before All test cases... + " + new Date());
    }
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
        int expected  =10;
        Assert.assertEquals(expected,result);
    }
}
