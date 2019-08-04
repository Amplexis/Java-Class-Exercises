package com.khamlin;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = this.radius * this.radius * Math.PI;
        return area;
    }
}
