package com.company;

public abstract class Dish {
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Dish(String color) {
        this.color = color;
    }

    private String color;
    abstract String printInfo();
}

