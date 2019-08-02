package com.khamlin;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(1800987273);
        myAccount.setCustomerName("Kevin Hamlin");
        myAccount.setEmail("kevin.hamlin@gmail.com");
        myAccount.setPhoneNumber(7543738274L);
        myAccount.setBalance(125000.81);
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());
        myAccount.withdrawFunds(200000);

//        Car porsche = new Car();
//        Car camery = new Car();
//        camery.setModel("2018 Luxury Edition");
//        porsche.setDoors(2);
//        System.out.println(porsche.getDoors());
//        System.out.println(camery.getModel());
    }
}
