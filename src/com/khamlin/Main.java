package com.khamlin;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car camery = new Car();
        camery.setModel("2018 Luxury Edition");
        porsche.setDoors(2);
        System.out.println(porsche.getDoors());
        System.out.println(camery.getModel());
    }
}
