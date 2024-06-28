package com.example.abstractFactory;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting Android Dev salary...");
        return 20000;
    }

    @Override
    public String name() {
        return "I am Android Developer";
    }
}
