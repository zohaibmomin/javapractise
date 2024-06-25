package com.example.demo_connection_pool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DemoConnectionPoolApplication implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
		SpringApplication.run(DemoConnectionPoolApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App is started");
        List<Map<String, Object>> result = jdbcTemplate.queryForList("select * from Customers;");
        result.forEach(System.out::println);
        //output
        /*App is started
        {Age=35, LastName=Zohaib}
        {Age=31, LastName=Neha}*/
    }
}
