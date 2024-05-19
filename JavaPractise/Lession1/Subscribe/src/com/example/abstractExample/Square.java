package com.example.abstractExample;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println();
        System.out.printf("Square Area is : %s", side * side);
    }
}
