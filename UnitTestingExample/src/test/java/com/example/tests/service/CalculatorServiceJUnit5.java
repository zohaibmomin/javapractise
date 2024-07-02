package com.example.tests.service;

import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceJUnit5 {
    @BeforeAll
    public static void beginning(){
        System.out.println("Before All test cases start... + " + new Date());
    }
    @AfterAll
    public static void ending(){
        System.out.println("After All test cases end... + " + new Date());
    }

    @BeforeEach
    public void beforeEachTestCase(){
        System.out.println("beforeEachTestCase...");
    }
    @AfterEach
    public  void afterEachTestCase(){
        System.out.println("afterEachTestCase... ");
    }


    @Test
    @DisplayName("Custom Name -- TestCase:Sum of Two Numbers")
    public void sumOfTwo() throws InterruptedException {
        System.out.println("Test Case :: sumOfTwo");
        int result = CalculatorService.sumOfTwoNumbers(1,2);
        int expected = 3;
        Assertions.assertEquals(expected,result,"Failed testcase :: sumOfTwo");
    }

    @Test
    @Disabled
    public void productOfTwo(){
        System.out.println("Test Case :: productOfTwo");
        int result = CalculatorService.productOfTwoNumbers(1,2);
        int expected = 2;
        Assertions.assertEquals(expected,result);
    }
}
