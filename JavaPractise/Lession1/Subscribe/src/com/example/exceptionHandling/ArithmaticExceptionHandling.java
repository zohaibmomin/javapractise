package com.example.exceptionHandling;

import java.util.Scanner;

// We are testing here how to use
// try catch
// catch specific exception and display specific message
// use throws at declation line but then caller has to catch it
//finally execution after try-catch completes
public class ArithmaticExceptionHandling {
    public static void main(String[] args) {
            a();
    }

    static void a(){
        b();
    }

    static void b() throws ArithmeticException{
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try{
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Enter non zero number !");
            }else {
                throw e;
            }

        }finally {
            System.out.println("I am finally");
        }
    }
}
