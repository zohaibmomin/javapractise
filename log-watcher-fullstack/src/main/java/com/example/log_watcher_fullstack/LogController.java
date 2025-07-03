package com.example.log_watcher_fullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * REST controller that exposes endpoints for retrieving log data.
 *
 * The base URL for all endpoints in this controller is "/log".
 */
@RestController
@RequestMapping("/log")
public class LogController {

    private final LogTailService logTailService;

    /**
     * Constructor injection of LogTailService.
     *
     * @Autowired tells Spring to automatically inject the LogTailService bean.
     * LogTailService handles reading the log file and fetching recent log lines.
     */
    @Autowired
    public LogController(LogTailService logTailService) {
        this.logTailService = logTailService;
    }

    /**
     * HTTP GET endpoint to retrieve the last 10 lines from the log file.
     *
     * URL: /log/lines
     *
     * @return ResponseEntity containing the list of log lines (as plain text strings)
     */
    @GetMapping("/lines")
    public ResponseEntity<List<String>> getLastLines() throws IOException {
        // Fetch the last 10 lines using the service and return them as an HTTP 200 response
        return ResponseEntity.ok(logTailService.getLastNLines(10));
    }
}
