package com.example.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        System.out.println("Example of filewriter");

        String filename = "java-practise.txt";

        try (FileWriter writer = new FileWriter(filename)){
            writer.write("Hello lets start writing");
            for (int i = 0; i < 10; i++) {
                writer.write("\n * - " + i);
            }
            writer.flush();
            writer.write("\nGood bye! lets end writing");

        } catch (IOException e) {
            System.out.printf("Exception is %s ", e);        }
    }
}
