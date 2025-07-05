package com.example.logwatcherdiy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {

    private final LogTailService logTailService;

    @Autowired
    public LogController(LogTailService logTailService) {
        this.logTailService = logTailService;
    }

    @GetMapping("/tail")
    public ResponseEntity<List<String>> getLastNLines() throws IOException {
        return ResponseEntity.ok(logTailService.getLastNLines(10));
    }

}
