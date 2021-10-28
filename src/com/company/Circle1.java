package com.company;

public class Circle1 extends Shape1 {
    public Integer r;

    public Circle1(String color, Integer x, Integer y, Integer r) {
        super(color, x, y);
        this.r = r;
    }

    @Override
    public Integer get_xPosition() {
        return x;
    }

    public Integer getR() {
        return r;
    }

    @Override
    public Integer get_yPosition() {
        return y;
    }
}
