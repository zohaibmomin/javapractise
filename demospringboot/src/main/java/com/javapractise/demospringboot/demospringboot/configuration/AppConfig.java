package com.javapractise.demospringboot.demospringboot.configuration;

import com.javapractise.demospringboot.demospringboot.DB;
import com.javapractise.demospringboot.demospringboot.ProdDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DB getData(){
        return new ProdDB();
    }
}
