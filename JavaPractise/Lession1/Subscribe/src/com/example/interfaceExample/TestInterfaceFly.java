package com.example.interfaceExample;

import com.example.inheritance.Eagle;

public class TestInterfaceFly {
    public static void main(String[] args) {
//        Flyable fly = new Flyable() {
//            @Override
//            public void fly() {
//                System.out.println("hello");
//            }
//        }; Cannot create object for an interface

        Eagle eagle = new Eagle("Eagle");
        eagle.fly();

    }
}
