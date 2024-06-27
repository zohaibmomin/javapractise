package com.examples.singleton;

//  . Eager intialization
//        1. In this you create a object when the class loads ( static member variable = new object )
//        2. Drawbacks - If client never requires object then waste of resources. Not recommend in huge projects
public class Jalebi {
    private static Jalebi jalebi = new Jalebi();

    private Jalebi() {

    }

    public static Jalebi getJalebi() {
        return jalebi;
    }
}
