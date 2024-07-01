package com.example.iterator;

public class Demo {
    public static void main(String[] args) {
        //Define own users list
        //in this userImpl we have getIterator defined
        UserImplementation userMgmt = new UserImplementation();
        userMgmt.addUser(new User("Zohaib", "12"));
        userMgmt.addUser(new User("Amal", "13"));
        userMgmt.addUser(new User("Akbar", "14"));
        userMgmt.addUser(new User("Anthony", "99"));

        //MyIterator is the interface whose implementation is MyIteratorImpl
        MyIterator myIterator = userMgmt.getIterator();

        //Here we do not know how the implementation is written for access elements
        //hasNext
        //next
        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println("Name : " + user.getName());
            System.out.println("UserId : " + user.getUserId());
        }
    }
}
