package com.examples.singleton;
//    1. Lazy initialization
//        1. In this you can check if not created and then create a object
//        2. Drawbacks - If not thread safe, then both threads will come at same time and create multiple copies
//            1. Solution - Use synchronised block
public class Samosa {
    private static Samosa samosa;

    private Samosa() {
    }

    public static Samosa getSamosa() {
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }
}
