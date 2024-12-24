package com.solidprinciples.liskovSubstitution;

//Here the class Bicycle breaks liskov principle
//VIOLATION
//because there is no engine in bicycle
public class Bicycle implements InterfaceBike {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelarate() {
        //do something
    }
}
