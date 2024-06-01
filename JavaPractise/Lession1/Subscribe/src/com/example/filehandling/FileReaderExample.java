package com.example.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        System.out.println("Hello to the FileReaderExample Program!!!");

        String filename = "java-practise.txt";
        try (FileReader reader = new FileReader(filename)) {
                int read = 0;
                do {
                    read = reader.read();
                    System.out.print((char) read);
                }while(read != -1);
        }catch (IOException e){
            System.out.printf("Exception occured %s, ",e);
        }
    }
}
