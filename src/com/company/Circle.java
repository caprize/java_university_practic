package com.company;

public class Circle extends Shape {
    protected Double radius;
    public Circle() {
    }

    public Circle(String color, Boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

}
