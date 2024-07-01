package com.example.adaptor;

public class DKCharger implements AndroidCharger{
    @Override
    public void chargePhone() {
        System.out.println("Charging phone using DKCharger :: AndroidCharger");
    }
}
