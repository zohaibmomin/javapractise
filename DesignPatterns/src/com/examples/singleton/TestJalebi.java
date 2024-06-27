package com.examples.singleton;

public class TestJalebi {
    public static void main(String[] args) {
        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.printf("Jalebi 1 is - %s", jalebi1.hashCode());

        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.printf("Jalebi 2 is - %s", jalebi2.hashCode());
    }
}
