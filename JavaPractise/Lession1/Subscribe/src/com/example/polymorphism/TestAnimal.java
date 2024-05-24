package com.example.polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Dog("bbow bow");
        System.out.println(animal.getSound());
        animal.makeSound();//Runtime polymorphism

    }
}
