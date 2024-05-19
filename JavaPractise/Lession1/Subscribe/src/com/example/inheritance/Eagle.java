package com.example.inheritance;

import com.example.abstractExample.Bird;

public class Eagle extends Bird {
    public Eagle(String breed) {
        super(breed);
    }

    @Override
    public void fly() {
        System.out.println();
        System.out.printf("I am flying....,%s",getBreed());
    }
}
