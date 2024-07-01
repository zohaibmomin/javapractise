package com.example.adaptor;

public class Iphone15 {
    IphoneCharger iphoneCharger;
    public Iphone15(IphoneCharger iphoneCharger) {
        this.iphoneCharger = iphoneCharger;
    }

    void chargeIphone15() {
        iphoneCharger.chargeIPhone();
    }
}
