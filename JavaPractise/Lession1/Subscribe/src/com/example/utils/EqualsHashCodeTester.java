package com.example.utils;

import com.example.geometry.Circle;

public class EqualsHashCodeTester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        Circle circle1 = new Circle();
        circle1.setRadius(5);

        if(circle.equals(circle1)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
