package com.solidprinciples.dependencyInversionPrinciple;

//VIOLATION
//Here Macbook is dependent on concrete classes WiredKeyboard and WiredMouse
//Disadvantage - Macbook cannot have BluetoothKeyboard and BluetoothMouse
public class Macbook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public Macbook() {
        this.keyboard = new WiredKeyboard();
        this.mouse = new WiredMouse();
    }
}
////SOLUTION
////Here Macbook is dependent on parent interfaces and not dependent on concrete classes
////Dependency Inversion says that you have to be dependent on interfaces
////Advantage - Macbook can have flexibility to keep different keyboard and different mouse
//public class Macbook {
//    private final KeyboardInterface keyboardInterface;
//    private final MouseInterface mouseInterface;
//
//    public Macbook(KeyboardInterface keyboardInterface, MouseInterface mouseInterface) {
//        this.keyboardInterface = keyboardInterface;
//        this.mouseInterface = mouseInterface;
//    }
//    public Macbook() {
//        this.keyboardInterface = new BluetoothKeyboard();
//        this.mouseInterface = new WiredMouse();
//    }
//
//
//}
