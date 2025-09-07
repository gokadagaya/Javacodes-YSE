package com.assignments;

import java.util.List;

public class SecureDeliveryService 
{
    public static void deliverDocuments(List<? extends Documents> documents) {
   
        for (Documents doc : documents) {
            System.out.println("Delivering securely: " + doc);
        }
    }
}

