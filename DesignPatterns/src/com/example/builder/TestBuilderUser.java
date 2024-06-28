package com.example.builder;

public class TestBuilderUser {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .setUserId("zo123")
                .setEmailId("zohaib@gmail.com")
                .setUsername("zohaib")
                .build();

        System.out.println("User1 is " + user1);

        //if we do not want to do new Builder
        //then make static method to return new builder instance
        User user2 = User.UserBuilder.builder()
                .setEmailId("bo@gmail.com")
                .setUserId("bo889")
                .setUsername("BOB")
                .build();
        System.out.println("User2 is " + user2);


    }
}
