package com.solidprinciples.singleResponsibility;

public class Invoice extends Marker {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    //1st reason to change because logic of calculation can change
    public int calTotal() {
        return this.quantity * marker.getPrice();
    }

    //VOILATION
    //2nd reason for change
    public void printInvoice() {
        //print invoice logic
    }

    //VOILATION
    //3rd reason for change
    public void saveToDB() {
        //save to DB logic
    }
}
