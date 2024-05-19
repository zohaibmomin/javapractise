package com.example.abstractExample;

public class AbstractShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        circle.calculateArea();

        Square square = new Square(33);
        square.calculateArea();
    }
}
