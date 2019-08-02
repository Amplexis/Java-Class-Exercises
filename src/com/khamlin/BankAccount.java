package com.khamlin;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private  String email;
    private long phoneNumber;

    public BankAccount(long accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public BankAccount() {
        this(1010101010, 250.00, "Name", "email@email.com", 999999999);
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double amountToDeposit) {
        this.balance += amountToDeposit;
    }

    public void withdrawFunds(double amountToWithdraw) {
        if(this.balance >= amountToWithdraw) {
            this.balance -= amountToWithdraw;
        } else {
            System.out.println("Insufficent Funds");
        }
    }
}
