package com.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserImplementation {
    List<User> userList = new ArrayList<>();

    void addUser(User user){
        userList.add(user);
    }

    User getUser(int index){
        return userList.get(index);
    }

    MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }
}
