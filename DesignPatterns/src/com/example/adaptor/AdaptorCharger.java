package com.example.adaptor;

public class AdaptorCharger implements IphoneCharger {
    private AndroidCharger androidCharger;

    public AdaptorCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIPhone() {
        System.out.println("Inside AdaptorCharger");
        androidCharger.chargePhone();

    }
}
