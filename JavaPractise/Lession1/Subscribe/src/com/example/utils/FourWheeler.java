package com.example.utils;

import com.example.inheritance.Vehicle;

public class FourWheeler extends Vehicle {


     public FourWheeler(){
        color = "Red";
        setNoOfTyres(4);
    }

    public void balance(){
        System.out.printf("I am balancing on 4 tyres");
    }

    @Override
    public void getSetGo() {
        System.out.println("Hello I am get set go");
        // Interface Transport is implemented by abstract class and Fourwheeler needs to define getSetGo()
    }
}
