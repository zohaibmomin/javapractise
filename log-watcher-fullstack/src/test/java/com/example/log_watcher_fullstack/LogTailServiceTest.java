package com.example.log_watcher_fullstack;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LogTailServiceTest {

    private LogTailService service;
    private static final String TEST_FILE = "test-log.txt";

    @BeforeEach
    public void setup() throws IOException {
        // Write test log lines
        Path testFile = Paths.get(TEST_FILE);
        Files.write(testFile, ("line1\nline2\nline3\nline4\nline5\nline6\nline7\nline8\nline9\nline10\nline11").getBytes(StandardCharsets.UTF_8));

        // Don't start polling; mock template
        service = new LogTailService(TEST_FILE, Mockito.mock(SimpMessagingTemplate.class));
    }

    @AfterEach
    public void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    public void testGetLastNLines() throws Exception {
        List<String> lines = service.getLastNLines(10);
        assertEquals(10, lines.size());
        assertEquals("line2", lines.get(0));
        assertEquals("line11", lines.get(9));
    }
}
