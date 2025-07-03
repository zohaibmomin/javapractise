package com.example.log_watcher_fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Spring Boot Log Watcher application.
 *
 * @SpringBootApplication is a convenience annotation that adds:
 * - @Configuration: Marks the class as a source of bean definitions.
 * - @EnableAutoConfiguration: Enables Spring Boot's auto-configuration mechanism.
 * - @ComponentScan: Scans the package for Spring components (like @Service, @Controller, etc.).
 */
@SpringBootApplication
public class LogWatcherFullstackApplication {

	/**
	 * Main method that launches the Spring Boot application.
	 * SpringApplication.run(...) bootstraps the application, starting the embedded web server,
	 * setting up Spring context, etc.
	 */
	public static void main(String[] args) {
		SpringApplication.run(LogWatcherFullstackApplication.class, args);
	}
}
