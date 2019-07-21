package com.example.dao;

import com.example.model.Invoice;

import java.util.List;

public interface InvoiceDao {
    Invoice addInvoice(Invoice invoice);

    Invoice getInvoice(int Id);

    List<Invoice> getAllInvoices();

    void updateInvoice(Invoice invoice);

    void deleteInvoice(int id);

    //Defining the additional operations to be performed on Invoice table
    Invoice getInvoiceByItemType(String itemType);

    Invoice getInvoiceByName(String name);
}
