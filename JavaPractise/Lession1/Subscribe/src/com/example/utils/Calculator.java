package com.example.utils;

import com.example.geometry.Circle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator for Circle and Rectangle");
        Circle circle = new Circle();
        System.out.print("Enter the radius : ");
        Scanner input = new Scanner(System.in);
        circle.setRadius(input.nextDouble());
        System.out.printf("Area for Circle : %f", circle.getArea());
    }
}
