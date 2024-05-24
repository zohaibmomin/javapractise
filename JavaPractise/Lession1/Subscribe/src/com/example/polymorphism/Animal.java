package com.example.polymorphism;

public class Animal {
    String sound;
    Animal(){

    }

    public String getSound() {
        return sound;
    }

    Animal(String sound){
        this.sound = sound;
    }

    void makeSound(){
        System.out.println("KKKKK....");
    }

}
