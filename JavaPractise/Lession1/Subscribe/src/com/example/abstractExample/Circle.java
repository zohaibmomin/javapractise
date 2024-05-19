package com.example.abstractExample;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.printf("Circle Area is : %f",Math.PI * (radius*radius));
    }
}
