package com.solidprinciples.openForExtension;

import com.solidprinciples.singleResponsibility.Invoice;

public class InvoiceDBDAO implements InterfaceInvoiceDAO{
    @Override
    public void save(Invoice invoice) {
        // here you will save to DB logic
        // saveToDB() equivalent
    }
}
