package com.examples.singleton;

public class TestSamosa {
    public static void main(String[] args) {

        //Lazy initialisation
        Samosa samosa1 = Samosa.getSamosa();
        System.out.printf("\n Samosa 1 - %s",samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.printf("\n Samosa 2 - %s",samosa2.hashCode());
    }
}
