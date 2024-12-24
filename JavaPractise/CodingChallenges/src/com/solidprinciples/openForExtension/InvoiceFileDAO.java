package com.solidprinciples.openForExtension;

import com.solidprinciples.singleResponsibility.Invoice;

public class InvoiceFileDAO implements InterfaceInvoiceDAO {
    @Override
    public void save(Invoice invoice) {
        // save to file
    }
}
