package com.example.logwatcherdiy;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

@Service
@EnableScheduling

public class LogTailService {

    private final String logFilePath = "/Users/naziamomin/Documents/logwatcherdiy/logsample.txt";

    private long lastOffsetPos = 0;

    private SimpMessagingTemplate messagingTemplate;

    public LogTailService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

//    @PostConstruct
//    public void init() {
//        Executors.newSingleThreadScheduledExecutor();
//    }

    //logic to get last 10 lines on initial page load
    public List<String> getLastNLines(int n) throws IOException {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(logFilePath);

        //Read all lines from the files
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

        //get the start point
        int start = Math.max(0, allLines.size() - n);

        //add to the lines list
        lines = allLines.subList(start, allLines.size());

        return lines;
    }

    //logic to poll the log file and stream to web client
    @Scheduled(fixedRate = 1000)
    public void pollLogFile() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(logFilePath, "r");

        //Point to the file
        randomAccessFile.seek(lastOffsetPos);

        //read each line and send over websocket
        String line;
        while ((line = randomAccessFile.readLine()) != null) {
            messagingTemplate.convertAndSend("/topic/logs", line);
        }

        //Update the lastOffsetPos
        lastOffsetPos = randomAccessFile.getFilePointer();
    }
}
