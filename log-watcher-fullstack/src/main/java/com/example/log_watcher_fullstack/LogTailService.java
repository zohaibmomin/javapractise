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

@Service // Marks this class as a Spring-managed service (component)
public class LogTailService {

    // Logger for logging errors or important information
    private static final Logger logger = LoggerFactory.getLogger(LogTailService.class);

    // Inject log file path from application properties; default is "log.txt"
    private final String logFilePath;

    // Keeps track of last read byte position in the log file
    private long lastOffset = 0;

    // Used to send messages to WebSocket clients
    private final SimpMessagingTemplate messagingTemplate;

    // Constructor injection: receives log file path and messaging template from Spring
    public LogTailService(@Value("${log.file.path:log.txt}") String logFilePath,
                          SimpMessagingTemplate messagingTemplate) {
        this.logFilePath = logFilePath;
        this.messagingTemplate = messagingTemplate;
    }

    // Runs after bean is created — starts a scheduled executor to poll the log file every second
    @PostConstruct
    public void init() {
        Executors.newSingleThreadScheduledExecutor()
                .scheduleAtFixedRate(this::pollLogFile, 0, 1, TimeUnit.SECONDS);
    }

    // Reads the last `n` lines from the log file (e.g., to show on page load)
    public List<String> getLastNLines(int n) throws IOException {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(logFilePath);
        if (!Files.exists(path)) return lines;

        // Read all lines from the file
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

        // Calculate starting point (avoid IndexOutOfBounds)
        int start = Math.max(0, allLines.size() - n);

        // Add the last n lines to result
        lines.addAll(allLines.subList(start, allLines.size()));
        return lines;
    }

    // Polls the log file and streams new lines to all WebSocket subscribers
    private void pollLogFile() {
        try (RandomAccessFile file = new RandomAccessFile(logFilePath, "r")) {
            // Move the pointer to the last read offset
            file.seek(lastOffset);

            String line;
            // Read and send each new line
            while ((line = file.readLine()) != null) {
                messagingTemplate.convertAndSend("/topic/log", line); // Send to WebSocket topic
            }

            // Update lastOffset to the current position for next poll
            lastOffset = file.getFilePointer();

        } catch (IOException e) {
            // Log any errors that occur while reading the file
            logger.error("Error reading log file", e);
        }
    }
}
