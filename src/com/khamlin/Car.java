package com.khamlin;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("2018 Luxury Edition")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
    public void setDoors(int numberOfDoors) {
        this.doors = numberOfDoors;
    }
    public int getDoors() {
        return this.doors;
    }
    public void setWheels(int numberOfWheels) {
        this.wheels = numberOfWheels;
    }
    public int getWheels() {
        return this.wheels;
    }
}
