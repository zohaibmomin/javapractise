package com.example.inheritance;

import com.example.utils.FourWheeler;

public class Car extends FourWheeler {
    String model;

    Car(){
        color = "Red";
        model = "Swift";
        setNoOfTyres(4);
    }

    public void carBalance(){
        System.out.printf("I am balancing on 4 tyres,%s %s",color,model);
    }

    public static void main(String[] args) {
        Car mycar = new Car();
        //mycar.commute()//parent Vehicle class has this but default access
        System.out.println("Four wheeler balance");
        mycar.balance();
        System.out.println("car balance");
        mycar.carBalance();

        FourWheeler fourWheeler = new FourWheeler();
        System.out.println("Four wheeler balance");
        fourWheeler.balance();
        System.out.println("Vehicle commute");
        fourWheeler.commute();

    }

}
