package com.example.geometry;

import in.javapractise.Car;

import java.util.Objects;

public class Circle {
    private double radius;
    public Circle(){

    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }



    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
}
