package com.company;

public abstract class Shape1 {
    public String color;

    public Shape1(String color, Integer x, Integer y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Integer x;
    public Integer y;
    public abstract Integer get_xPosition();
    public abstract Integer get_yPosition();
}
