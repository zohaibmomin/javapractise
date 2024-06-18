package com.javapractise.demospringboot.demospringboot.configuration;

import com.javapractise.demospringboot.demospringboot.DB;
import com.javapractise.demospringboot.demospringboot.DevDB;
import com.javapractise.demospringboot.demospringboot.ProdDB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnProperty(name = "env", havingValue = "PROD")
    public DB getProdData(){
        return new ProdDB();
    }

    @Bean
    @ConditionalOnProperty(name = "env", havingValue = "DEV")
    public DB getDevData(){
        return new DevDB();
    }
}
