package com.example.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExample {
    public static void main(String[] args) {
        System.out.println("Welcome to the file not found example");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the filename to be read ....");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)) {
            int read=0;
            do {
                read = reader.read();
                System.out.print((char) read);
            }while (read != -1);
        }/*catch (FileNotFoundException e){
            System.out.printf("Exception %s", e);
        }*/catch (IOException e){
            System.out.printf("Exception %s", e);
        }

    }
}
