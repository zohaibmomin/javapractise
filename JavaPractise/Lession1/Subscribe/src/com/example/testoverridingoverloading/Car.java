package com.example.testoverridingoverloading;

public class Car extends Vehicle{
    @Override
    void service() {
        super.service();
        System.out.println("Also car servicing....");
    }
}
