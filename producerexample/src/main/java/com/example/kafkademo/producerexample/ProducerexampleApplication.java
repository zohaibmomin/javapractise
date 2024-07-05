package com.example.kafkademo.producerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com/example/kafkademo/controller",
        "com/example/kafkademo/config",
        "com/example/kafkademo/services"})

public class ProducerexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerexampleApplication.class, args);
    }

}
