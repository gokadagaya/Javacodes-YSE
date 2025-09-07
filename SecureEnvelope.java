package com.assignments;

public class SecureEnvelope<T extends Documents> {
    private T document;

    public SecureEnvelope(T document) {
        this.document = document;
    }

    public T getDocument() {
        return document;
    }

    public void encryptAndSend() {
        System.out.println("Encrypting and sending : " + document);
    }
}

