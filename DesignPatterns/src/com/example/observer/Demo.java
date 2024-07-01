package com.example.observer;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriber zohaib = new Subscriber("Zohaib");
        youtubeChannel.subscribe(zohaib);

        Subscriber nazia = new Subscriber("Nazia");
        youtubeChannel.subscribe(nazia);

        youtubeChannel.newVideoUploaded("Java crash course!");

        //now new subscriber came
        Subscriber neha = new Subscriber("Neha");
        youtubeChannel.subscribe(neha);

        //zohaib will not get notification but neha and nazia will get
        youtubeChannel.unsubscribe(zohaib);
        youtubeChannel.newVideoUploaded("My Vlog - June 29");

    }
}
