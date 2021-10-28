package com.company;

public class Rectangle extends Shape {
    protected Double width;
    protected Double length;

    public Rectangle() {
    }

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, Double width, Double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return width*2+length*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
