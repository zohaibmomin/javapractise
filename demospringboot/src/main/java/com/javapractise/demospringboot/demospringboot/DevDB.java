package com.javapractise.demospringboot.demospringboot;

public class DevDB implements DB{
    @Override
    public String getData() {
        return "Hello - DEV ENVIRONMENT";
    }
}
