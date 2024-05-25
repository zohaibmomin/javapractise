package com.example.testoverridingoverloading;

public class Calculator {
    private int a;
    private int b;
    private int c;

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public int getC() {
        return c;
    }

    public int add(int x,int y){
        return x + y;
    }

    public int add(int x, int y, int z){
        return x + y + z;
    }

    public double add(double p, double q){
        return p + q;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.printf("Sum of 2 integers %d :" , calc.add(3,4));
        System.out.println();
        System.out.printf("Sum of 3 integers %s :" ,  calc.add(3,4,6));
        System.out.println();
        System.out.printf("Sum of 2 doubles %s :" ,  calc.add(3.44,4.44));
    }

}
