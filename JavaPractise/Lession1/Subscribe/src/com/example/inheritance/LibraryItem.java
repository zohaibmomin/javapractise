package com.example.inheritance;

public class LibraryItem {
    private int itemID;
    private String title;
    private String author;

    LibraryItem() {
    }

    LibraryItem(int itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    void checkout(){
        System.out.println("Checking out..");
    }

    void returnItem(){
        System.out.println("Returning the item : " + this);
    }


}
