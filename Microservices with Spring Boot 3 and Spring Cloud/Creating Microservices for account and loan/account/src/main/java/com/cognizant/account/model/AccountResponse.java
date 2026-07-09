package com.cognizant.account.model;

public class AccountResponse {

    private String accountNumber;
    private Loan loanDetails;

    public AccountResponse(String accountNumber, Loan loanDetails) {
        this.accountNumber = accountNumber;
        this.loanDetails = loanDetails;
    }

    public String getAccountNumber() { return accountNumber; }
    public Loan getLoanDetails() { return loanDetails; }
}