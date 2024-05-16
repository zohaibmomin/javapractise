package com.example.inheritance;

public class TestLibraryItem {
    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbn("002ISBN");
        book.returnItem();

        DVD dvd  = new DVD();
        dvd.returnItem();

        Magazine mg = new Magazine();
        mg.returnItem();
    }
}
