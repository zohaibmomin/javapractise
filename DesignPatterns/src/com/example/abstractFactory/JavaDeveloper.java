package com.example.abstractFactory;

public class JavaDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting Java developer salary...");
        return 40000;
    }

    @Override
    public String name() {
        return "I am Java developer";
    }
}
