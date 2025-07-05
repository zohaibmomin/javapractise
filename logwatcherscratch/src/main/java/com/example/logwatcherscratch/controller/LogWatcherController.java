package com.example.logwatcherscratch.controller;

import com.example.logwatcherscratch.services.LogWatcherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogWatcherController {

    private LogWatcherServices logWatcherServices;

    public LogWatcherController(LogWatcherServices logWatcherServices) {
        this.logWatcherServices = logWatcherServices;
    }


    @GetMapping("/lines")
    public ResponseEntity<List<String>> getLastNLines() throws IOException {
        return ResponseEntity.ok(logWatcherServices.getLastNLines(10));
    }
}
