package com.assignments;

import java.time.LocalDateTime;

public class LoanAgreement extends Documents {
    private double loanAmount;
    private double interestRate;

    public LoanAgreement(String documentId, LocalDateTime timestamp, String recipient, double loanAmount, double interestRate) {
        super(documentId, timestamp, recipient);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "LoanAgreement [" + super.toString() + ", LoanAmount: " + loanAmount + ", InterestRate: " + interestRate + "%]";
               
    }
}

