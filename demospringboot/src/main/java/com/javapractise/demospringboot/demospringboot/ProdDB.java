package com.javapractise.demospringboot.demospringboot;

public class ProdDB implements DB{
    @Override
    public String getData() {
        return "Hello. I am inside PRODUCTION DB";
    }
}
