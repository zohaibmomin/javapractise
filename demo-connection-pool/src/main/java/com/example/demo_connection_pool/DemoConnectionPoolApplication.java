package com.example.demo_connection_pool;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConnectionPoolApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(DemoConnectionPoolApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App is started");
    }
}
