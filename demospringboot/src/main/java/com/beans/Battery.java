package com.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Battery {
    public Battery() {
        System.out.println("Bean Lifecycle ::  Beans battery Constructor initialised....");
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean Lifecycle ::  Init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean Lifecycle :: Destroy method");
    }
}
