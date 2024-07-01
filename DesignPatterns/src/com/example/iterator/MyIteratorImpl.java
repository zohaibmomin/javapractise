package com.example.iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> list;
    private int position = 0;
    private int length;

    public MyIteratorImpl(List<User> userList) {
        this.list = userList;
        this.length = userList.size();
    }

    @Override
    public boolean hasNext() {
        if (position >= this.length)
            return false;
        return true;
    }

    @Override
    public Object next() {
        User user = this.list.get(position);
        position++;
        return user;
    }
}
