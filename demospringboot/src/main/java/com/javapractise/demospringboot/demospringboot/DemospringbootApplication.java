package com.javapractise.demospringboot.demospringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringbootApplication implements CommandLineRunner {

	DB db;
	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		db = new DevDB();
		System.out.println(db.getData());
	}
}
