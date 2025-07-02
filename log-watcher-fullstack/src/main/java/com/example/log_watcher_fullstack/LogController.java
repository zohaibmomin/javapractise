package com.example.log_watcher_fullstack;

//import com.example.logwatcher.service.LogTailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {

    private final LogTailService logTailService;

    @Autowired
    public LogController(LogTailService logTailService) {
        this.logTailService = logTailService;
    }

    @GetMapping("/lines")
    public ResponseEntity<List<String>> getLastLines() throws IOException {
        return ResponseEntity.ok(logTailService.getLastNLines(10));
    }
}