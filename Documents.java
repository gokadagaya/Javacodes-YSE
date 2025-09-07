package com.assignments;

import java.time.LocalDateTime;

public  class Documents {
    private String documentId;
    private LocalDateTime timestamp;
    private String recipient;

    public Documents(String documentId, LocalDateTime timestamp, String recipient) {
        this.documentId = documentId;
        this.timestamp = timestamp;
        this.recipient = recipient;
    }

    public String getDocumentId() {
        return documentId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return "DocumentId: " + documentId +", Timestamp: " + timestamp +  ", Recipient: " + recipient;
               
    }
}
