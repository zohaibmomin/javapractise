package com.javapractise.demospringboot.demospringboot;

import com.beans.Battery;
import com.beans.Network;
import com.beans.Phone;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.beans", "com.javapractise.demospringboot.demospringboot"})
public class DemospringbootApplication implements CommandLineRunner {

    @Autowired
    DB db;

    public static void main(String[] args) {
		var context = SpringApplication.run(DemospringbootApplication.class, args);
        System.out.println(context.getBean(Phone.class));
//		Battery batteryBean = context.getBean(Battery.class);
//		System.out.println(batteryBean);
//		context.close();

        //manually define spring bean
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        Network mybean = (Network) applicationContext.getBean("networkbean");
//        System.out.println("Main class:: mybean:: Manual XML Bean definition - " + mybean);
//
//		Phone phoneBean = applicationContext.getBean("phone", Phone.class);
//        System.out.println("Main class:: phoneBean:: Manual XML Bean definition - " + phoneBean);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(db.getData());
    }
}
