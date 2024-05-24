package com.example.polymorphism;

public class Dog extends Animal{
    Dog(){
        super();
    }

    Dog(String sound){
        super(sound);
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Bow bow....");
    }
}
