package com.example.iterator;

public class Demo {
    public static void main(String[] args) {
        UserImplementation userMgmt = new UserImplementation();
        userMgmt.addUser(new User("Zohaib", "12"));
        userMgmt.addUser(new User("Amal", "13"));
        userMgmt.addUser(new User("Akbar", "14"));
        userMgmt.addUser(new User("Anthony", "99"));

        MyIterator myIterator = userMgmt.getIterator();

        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println("Name : " + user.getName());
            System.out.println("UserId : " + user.getUserId());
        }
    }
}
