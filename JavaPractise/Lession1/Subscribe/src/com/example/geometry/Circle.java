package com.example.geometry;

public class Circle {
    private double radius;
    public Circle(){

    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
}
