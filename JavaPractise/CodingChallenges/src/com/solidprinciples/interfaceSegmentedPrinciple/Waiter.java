package com.solidprinciples.interfaceSegmentedPrinciple;

////VOILATION
////Waiter cannot cook and washutensils
////Break the Parent Interface to relevant small interfaces
//public class Waiter implements InterfaceRestaurantEmployee{
//    @Override
//    public void serveFood() {
//
//    }
//
//    @Override
//    public void cookFood() {
//
//    }
//
//    @Override
//    public void washUtensils() {
//
//    }
//}

//SOLUTION
//Interface Waiter provides methods relevant for Waiter class
public class Waiter implements WaiterInterface {
    @Override
    public void serveFood() {
        //waiter servesFood....
    }
}