package com.example.factory;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("\nGetting Android Dev salary...");
        return 20000;
    }
}
