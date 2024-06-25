package com.beans;

public class Phone {
    public Network network;

//    public Phone(){
//        System.out.println("Phone default:: construct");
//    }
    public Phone(Network network) {
        System.out.println("Phone constructor..");
        this.network = network;
    }

    public Phone(int a, double b){
        System.out.println("Phone parameterised constructor...");
        System.out.println(a);
        System.out.println(b);
    }

    public void setNetwork(Network network) {
        System.out.println("setNetwork:: Inside network setter...");
        this.network = network;
    }
}
