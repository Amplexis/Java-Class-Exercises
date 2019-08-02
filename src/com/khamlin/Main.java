package com.khamlin;

public class Main {

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println(first.distance()); //  should return 7.8102496...
        System.out.println(first.distance(second)); // should return 5.0
        System.out.println(first.distance(2,2)); // should return 5.0
        Point point = new Point();
        System.out.println(point.distance()); // should return 0.0


//        VipCustomer tim = new VipCustomer();
//        VipCustomer ryan = new VipCustomer("Ryan", "ryan@email.com");
//        VipCustomer kevin = new VipCustomer("Kevin", "khamlin@gmail.com", 500000.00);
//
//        System.out.println(tim.getCreditLimit() + " " + tim.getEmail() + " "  + tim.getName());
//        System.out.println(kevin.getCreditLimit() + " " + kevin.getEmail() + " "  + kevin.getName());
//        System.out.println(ryan.getCreditLimit() + " " + ryan.getEmail() + " "  + ryan.getName());

//        BankAccount myAccount = new BankAccount();
//        myAccount.setAccountNumber(1800987273);
//        myAccount.setCustomerName("Kevin Hamlin");
//        myAccount.setEmail("kevin.hamlin@gmail.com");
//        myAccount.setPhoneNumber(7543738274L);
//        myAccount.setBalance(125000.81);
//        System.out.println(myAccount.getAccountNumber());
//        System.out.println(myAccount.getCustomerName());
//        System.out.println(myAccount.getEmail());
//        System.out.println(myAccount.getPhoneNumber());
//        myAccount.withdrawFunds(200000);

//        Car porsche = new Car();
//        Car camery = new Car();
//        camery.setModel("2018 Luxury Edition");
//        porsche.setDoors(2);
//        System.out.println(porsche.getDoors());
//        System.out.println(camery.getModel());
    }
}
