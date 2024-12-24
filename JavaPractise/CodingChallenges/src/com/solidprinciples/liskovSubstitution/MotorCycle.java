package com.solidprinciples.liskovSubstitution;

//Motorcycle class implementing interface bike methods
public class MotorCycle implements InterfaceBike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;

    }

    @Override
    public void accelarate() {
        speed = speed + 10;
    }
}
