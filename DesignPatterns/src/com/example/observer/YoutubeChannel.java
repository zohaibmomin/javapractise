package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void newVideoUploaded(String title) {
        System.out.println("Uploaded new video - " + title);

        for (Observer subscriber : this.subscribers) {
            subscriber.notified(title);
        }


    }
}
