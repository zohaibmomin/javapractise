package com.example.logwatcherscratch.services;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

@Service
@EnableScheduling
public class LogWatcherServices {

    private String logFilePath = "/Users/naziamomin/Documents/logwatcherscratch/logsample.txt";
    private long offset = 0;
    private final String READ_MODE = "r";

    private SimpMessagingTemplate messagingTemplate;

    public LogWatcherServices(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public List<String> getLastNLines(int n) throws IOException {
        // Create a path object from the log file path
        Path path = Paths.get(logFilePath);

        // Check if the file is valid
        if (!Files.isRegularFile(path)) {
            throw new IllegalArgumentException("Invalid log file path: " + path);
        }

        // This will store the last N lines
        Deque<String> lastNLines = new ArrayDeque<>();

        // Open the file for reading
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Add the line to the end of the deque
                lastNLines.addLast(line);

                // If we have more than N lines, remove the oldest one
                if (lastNLines.size() > n) {
                    lastNLines.removeFirst();
                }
            }
        }

        // Convert deque to a list and return
        return new ArrayList<>(lastNLines);
    }



    //Logic to fetch lines realtime without page load

    @Scheduled(fixedRate = 1000)
    public void pollLogFile() throws IOException {
        System.out.println("Called...");
        RandomAccessFile randomAccessFile = new RandomAccessFile(logFilePath,READ_MODE);

        randomAccessFile.seek(offset);

        String line;
        while ((line = randomAccessFile.readLine()) !=null){
            messagingTemplate.convertAndSend("/topic/logs",line);
            System.out.println(line);
        }
        offset = (randomAccessFile.getFilePointer());
    }
}
