package com.javapractise.demospringboot.demospringboot;

import com.beans.Battery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.beans","com.javapractise.demospringboot.demospringboot"})
public class DemospringbootApplication implements CommandLineRunner{

	@Autowired
	DB db;

	public static void main(String[] args) {
		var context = SpringApplication.run(DemospringbootApplication.class, args);
		Battery batteryBean = context.getBean(Battery.class);
		System.out.println(batteryBean);
		context.close();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(db.getData());
	}
}
