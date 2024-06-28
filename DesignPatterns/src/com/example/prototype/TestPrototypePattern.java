package com.example.prototype;

public class TestPrototypePattern {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("We will test prototype pattern");

        NetworkConnection nw = new NetworkConnection();
        nw.setNetworkIP("192.56.18.99");
        nw.loadVeryImportantData();

        System.out.println(nw);

        //we want new object but saving costs of not doing heavy operation in loadVeryImportantData
        // simply clone it
        NetworkConnection nw2 = nw.clone();
        System.out.println(nw2);

    }
}
