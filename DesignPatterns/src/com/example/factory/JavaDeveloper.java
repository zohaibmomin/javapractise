package com.example.factory;

public class JavaDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("\nGetting Java developer salary...");
        return 40000;
    }
}
