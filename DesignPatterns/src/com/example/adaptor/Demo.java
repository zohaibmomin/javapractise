package com.example.adaptor;

public class Demo {
    public static void main(String[] args) {

        //create Iphone charger implementation object
        IphoneCharger iphoneCharger = new ABCIphoneCharger();
        //pass into iphone class
        Iphone15 iphone15 = new Iphone15(iphoneCharger);
        //charge
        iphone15.chargeIphone15();

        //Similarly for android

        //create Android charger implementation object
        AndroidCharger androidCharger = new DKCharger();
        //pass into android class
        AndroidPhone androidPhone = new AndroidPhone(androidCharger);
        //charge
        androidPhone.chargeAndroid();

        //ADAPTOR : Now lets charge iphone using android charger
        IphoneCharger adaptorCharger = new AdaptorCharger(androidCharger);
        iphone15 = new Iphone15(adaptorCharger);
        iphone15.chargeIphone15();

    }
}
