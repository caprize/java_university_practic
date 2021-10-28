package com.company;

public class Spoon extends Dish {
    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    private Integer size;

    public Spoon(String color, Integer size) {
        super(color);
        this.size = size;
    }

    @Override
    String printInfo() {
        return "Size is: "+size+" Color is: "+getColor();
    }
}
