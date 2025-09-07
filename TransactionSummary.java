package com.assignments;

import java.time.LocalDateTime;

public class TransactionSummary extends Documents 
{
    private double amount;
    private String type;

    public TransactionSummary(String documentId, LocalDateTime timestamp, String recipient, double amount, String type)
    {
        super(documentId, timestamp, recipient);
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransactionSummary [" + super.toString() +  ", Transaction Amount: " + amount + ", Transaction type: " + type+ "]";
              
               
    }
}

