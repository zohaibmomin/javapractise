package com.example.logwatcherscratch;

import com.example.logwatcherscratch.services.LogWatcherServices;


import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for LogWatcherServices
 */
public class LogWatcherServicesTest {

    private LogWatcherServices service;
    private static final String TEST_FILE = "test-log.txt"; // Path to temporary test file

    /**
     * This method runs before each test.
     * It creates a temporary log file with 11 lines and initializes the LogWatcherServices
     */
    @BeforeEach
    public void setup() throws IOException {
        // Create a temporary test log file with 11 lines
        Path testFile = Paths.get(TEST_FILE);
        Files.write(testFile, (
                "line1\nline2\nline3\nline4\nline5\n" +
                        "line6\nline7\nline8\nline9\nline10\nline11"
        ).getBytes(StandardCharsets.UTF_8));
        // Initialize LogWatcherServices with the test file and a mocked messaging template
        service = new LogWatcherServices(TEST_FILE, Mockito.mock(SimpMessagingTemplate.class));
    }

    /**
     * This method runs after each test.
     * It deletes the temporary log file to clean up test artifacts
     */
    @AfterEach
    public void cleanup() throws IOException {
        // Delete the test log file after test execution
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    /**
     * This test verifies that getLastNLines(10) returns the last 10 lines from the file.
     * Since the file has 11 lines, it should return lines 2 through 11.
     */
    @Test
    public void testGetLastNLines() throws Exception {
        // Call the method to retrieve the last 10 lines from the log file
        List<String> lines = service.getLastNLines(10);

        // Assert that the size of the returned list is 10
        assertEquals(10, lines.size());

        // Assert that the first line is "line2" (since "line1" is skipped)
        assertEquals("line2", lines.get(0));

        // Assert that the last line is "line11"
        assertEquals("line11", lines.get(9));
    }
}