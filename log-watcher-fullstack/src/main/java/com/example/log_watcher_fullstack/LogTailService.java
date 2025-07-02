package com.example.log_watcher_fullstack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

@Service
public class LogTailService {

    private static final Logger logger = LoggerFactory.getLogger(LogTailService.class);

    @Value("${log.file.path:log.txt}")
    private String logFilePath;

    private long lastOffset = 0;
    private final SimpMessagingTemplate messagingTemplate;

    public LogTailService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @PostConstruct
    public void init() {
        Executors.newSingleThreadScheduledExecutor()
                .scheduleAtFixedRate(this::pollLogFile, 0, 1, TimeUnit.SECONDS);
    }

    public List<String> getLastNLines(int n) throws IOException {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(logFilePath);
        if (!Files.exists(path)) return lines;

        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        int start = Math.max(0, allLines.size() - n);
        lines.addAll(allLines.subList(start, allLines.size()));
        return lines;
    }

    private void pollLogFile() {
        try (RandomAccessFile file = new RandomAccessFile(logFilePath, "r")) {
            file.seek(lastOffset);
            String line;
            while ((line = file.readLine()) != null) {
                messagingTemplate.convertAndSend("/topic/log", line);
            }
            lastOffset = file.getFilePointer();
        } catch (IOException e) {
            logger.error("Error reading log file", e);
        }
    }
}