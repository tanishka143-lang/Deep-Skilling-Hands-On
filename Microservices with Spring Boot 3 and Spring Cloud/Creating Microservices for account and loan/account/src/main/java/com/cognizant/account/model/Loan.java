package com.cognizant.account.model;

public class Loan {
    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;

    public String getNumber() { return number; }
    public String getType() { return type; }
    public int getLoan() { return loan; }
    public int getEmi() { return emi; }
    public int getTenure() { return tenure; }

    public void setNumber(String number) { this.number = number; }
    public void setType(String type) { this.type = type; }
    public void setLoan(int loan) { this.loan = loan; }
    public void setEmi(int emi) { this.emi = emi; }
    public void setTenure(int tenure) { this.tenure = tenure; }
}