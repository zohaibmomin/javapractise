package com.beans;

import org.springframework.stereotype.Component;

@Component
public class Network {
    public Network(){
        System.out.println("Network construct--Manual XML Bean definition - Hello I am network constructor...");
    }
}
