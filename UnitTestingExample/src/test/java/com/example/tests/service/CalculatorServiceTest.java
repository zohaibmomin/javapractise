package com.example.tests.service;

import org.junit.*;

import java.util.Date;


public class CalculatorServiceTest {
    @BeforeClass
    public static void beginning(){
        System.out.println("Before All test cases start... + " + new Date());
    }

    @Before
    public void beforeEachTestCase(){
        System.out.println("beforeEachTestCase...");
    }
    @After
    public  void afterEachTestCase(){
        System.out.println("afterEachTestCase... ");
    }

    @Test
    public void sumOfTwo() throws InterruptedException {
        System.out.println("Test Case :: sumOfTwo");
        int result = CalculatorService.sumOfTwoNumbers(1,2);
        int expected = 3;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void productOfTwo(){
        System.out.println("Test Case :: productOfTwo");
        int result = CalculatorService.productOfTwoNumbers(1,2);
        int expected = 2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void sumOfAnyNumbers(){
        System.out.println("Test Case :: sumOfAnyNumbers");
        int result = CalculatorService.sumOfAnyNumbers(1,2,3,4);
        int expected  =10;
        Assert.assertEquals(expected,result);
    }
    @AfterClass
    public static void ending(){
        System.out.println("After All test cases end... + " + new Date());
    }
}
