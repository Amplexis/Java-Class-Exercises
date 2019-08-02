package com.khamlin;

public class VipCustomer {
    String name;
    String email;
    double creditLimit;

    public VipCustomer(){
        this("default name", "default@email.com", 500.00);
    }
    public VipCustomer(String name, String email) {
        this(name, email, 500.00);
    }
    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
