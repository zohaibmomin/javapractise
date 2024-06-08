package com.practise.challengeFunctional;

import java.util.Optional;

//Program to return Optional String. Returns optional empty if null or "" else give Uppercase
public class TestingOptional {
    public static void main(String[] args) {
        System.out.printf("Optional Value is %s\n",toOptional(null));
        System.out.printf("Optional Value is %s\n",toOptional(""));
        System.out.printf("Optional Value is %s\n",toOptional("Zohaib"));

    }

    public static Optional<String> toOptional(String str) {
        if (str == null || str.isEmpty()) return Optional.empty();
        return Optional.of(str.toUpperCase());
    }
}
