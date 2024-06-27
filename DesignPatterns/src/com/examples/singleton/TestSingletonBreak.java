package com.examples.singleton;

import java.lang.reflect.Constructor;

public class TestSingletonBreak {
    public static void main(String[] args) throws Exception{

        Samosa samosa1 = Samosa.getSamosa();
        System.out.printf("\n Samosa 1 - %s",samosa1.hashCode());


        Constructor<Samosa> samosaConstructor = Samosa.class.getDeclaredConstructor();
        //since samosa is private so change accesibility
        samosaConstructor.setAccessible(true);
        //create instance
        Samosa samosa2 = samosaConstructor.newInstance();
        System.out.printf("\n Samosa 2 - %s",samosa2.hashCode());
    }
}
