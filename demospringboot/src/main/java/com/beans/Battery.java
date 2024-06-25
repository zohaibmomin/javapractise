package com.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Battery implements InitializingBean, DisposableBean {
    public Battery() {
        System.out.println("Bean Lifecycle ::  Beans battery Constructor initialised....");
    }
//    @PostConstruct
    public void init(){
        System.out.println("Bean Lifecycle ::  Init method");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("Bean Lifecycle :: Destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
