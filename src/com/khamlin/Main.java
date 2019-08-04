package com.khamlin;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth()); // 5.0
        System.out.println("rectangle.length= " + rectangle.getLength());  // 10.0
        System.out.println("rectangle.area= " + rectangle.getArea());  // 50.0
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());  //  5.0
        System.out.println("cuboid.length= " + cuboid.getLength());  // 10.0
        System.out.println("cuboid.area= " + cuboid.getArea());  // 50.0
        System.out.println("cuboid.height= " + cuboid.getHeight());  // 5.0
        System.out.println("cuboid.volume= " + cuboid.getVolume());  // 250.0

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());  // 3.75
//        System.out.println("circle.area= " + circle.getArea());  // 44.17894699...
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());  //5.55
//        System.out.println("cylinder.height= " + cylinder.getHeight());  // 7.25
//        System.out.println("cylinder.area= " + cylinder.getArea());  //96.76890771...
//        System.out.println("cylinder.volume= " + cylinder.getVolume());  //701.57458091....

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal()); // 2.0
//        System.out.println("one.imaginary= " + one.getImaginary());  // 2.0
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());  // -0.5
//        System.out.println("one.imaginary= " + one.getImaginary());  // 3.5
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());  // 3.0
//        System.out.println("number.imaginary= " + number.getImaginary());  // -5.0


//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println(first.distance()); //  should return 7.8102496...
//        System.out.println(first.distance(second)); // should return 5.0
//        System.out.println(first.distance(2,2)); // should return 5.0
//        Point point = new Point();
//        System.out.println(point.distance()); // should return 0.0


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
