package com.example.observer;

public class Subscriber implements Observer {
    String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void notified(String title) {
        System.out.println(subscriberName+ " - Ok noted - " + title);
    }
}
