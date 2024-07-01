package com.example.adaptor;

public class AndroidPhone {

    AndroidCharger androidCharger;

    AndroidPhone(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    void chargeAndroid() {
        androidCharger.chargePhone();
    }

}
