package com.example.adaptor;

public class ABCIphoneCharger implements IphoneCharger{
    @Override
    public void chargeIPhone() {
        System.out.println("Charing phone using ABCIphoneCharger :: IphoneCharger");
    }
}
