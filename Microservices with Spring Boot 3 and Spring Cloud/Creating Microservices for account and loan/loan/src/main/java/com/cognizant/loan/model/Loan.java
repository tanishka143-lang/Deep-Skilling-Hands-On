package com.cognizant.loan.model;

public class Loan {
    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;

    // constructor
    public Loan(String number, String type, int loan, int emi, int tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    // getters
    public String getNumber() { return number; }
    public String getType() { return type; }
    public int getLoan() { return loan; }
    public int getEmi() { return emi; }
    public int getTenure() { return tenure; }
}