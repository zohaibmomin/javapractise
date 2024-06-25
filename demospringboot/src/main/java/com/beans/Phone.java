package com.beans;

public class Phone {
    public Network network;

    public Phone(Network network) {
        System.out.println("Phone constructor..");
        this.network = network;
    }
}
