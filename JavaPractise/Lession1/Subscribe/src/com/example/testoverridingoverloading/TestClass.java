package com.example.testoverridingoverloading;

public class TestClass {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.service();
        //Run time polymorphism invokes subclass using parent reference
        Vehicle v = new Car();
        v.service();
    }
}
