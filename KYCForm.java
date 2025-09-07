package com.assignments;

import java.time.LocalDateTime;

public class KYCForm extends Documents 
{
    private String customerName;
    private String address;

    public KYCForm(String documentId, LocalDateTime timestamp, String recipient, String customerName, String address) {
        super(documentId, timestamp, recipient);
        this.customerName = customerName;
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "KYCForm [" + super.toString() +  ", CustomerName: " + customerName +  ", Address: " + address + "]";
              
    }
}
