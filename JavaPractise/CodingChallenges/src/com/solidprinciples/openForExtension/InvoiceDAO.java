package com.solidprinciples.openForExtension;

import com.solidprinciples.singleResponsibility.Invoice;

public class InvoiceDAO {
    Invoice invoice;

    public void savetoDB() {
        //save to DB logic
    }

    //do not modify the same class InvoiceDAO
    // if already tested and live then just extend
    public void saveToFile() {
        //save to file logic
    }

}
