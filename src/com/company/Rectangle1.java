package com.company;

public class Rectangle1 extends Shape1 {
    public Integer width;
    public Integer height;

    public Rectangle1(String color, Integer x, Integer y, Integer width, Integer height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public Integer get_xPosition() {
        return x;
    }
    @Override
    public Integer get_yPosition() {
        return y;
    }
}
