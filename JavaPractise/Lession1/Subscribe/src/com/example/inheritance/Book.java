package com.example.inheritance;

public class Book extends LibraryItem{
    private String isbn;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("isbn='").append(isbn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
