package com.assignments;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SecureDeliverySystem {
    public static void main(String[] args) {
       
        KYCForm kyc = new KYCForm("Doc101", LocalDateTime.now(), "KYC","Gayu", "123 Main St");
        LoanAgreement loan = new LoanAgreement("Doc102", LocalDateTime.now(), "Loan", 100000, 7.5);
        TransactionSummary txn = new TransactionSummary("Doc103", LocalDateTime.now(), "Audit ", 50000.05, "Credit");

        SecureEnvelope<KYCForm> secureKYC = new SecureEnvelope<>(kyc);
        SecureEnvelope<LoanAgreement> secureLoan = new SecureEnvelope<>(loan);
        SecureEnvelope<TransactionSummary> secureTxn = new SecureEnvelope<>(txn);

        secureKYC.encryptAndSend();
        secureLoan.encryptAndSend();
        secureTxn.encryptAndSend();

        List<Documents> documents = new ArrayList<>();
        documents.add(kyc);
        documents.add(loan);
        documents.add(txn);

        SecureDeliveryService.deliverDocuments(documents);
    }
}
