package com.example.inheritance;

public abstract class Vehicle implements Transport{
    private int noOfTyres;
    public String color;

    protected Vehicle(){
        noOfTyres=2;
        color="black";

    }

    public void setNoOfTyres(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }
    protected void commute(){
        System.out.printf("I am commuting with %s tyres",noOfTyres);

    }


}
