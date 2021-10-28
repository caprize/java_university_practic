package com.company;

public class Plate extends Dish{
    private Integer deep;

    public void setDeep(Integer deep) {
        this.deep = deep;
    }

    public Integer getDeep() {
        return deep;
    }

    public Plate(String color, Integer deep) {
        super(color);
        this.deep = deep;
    }

    @Override
    String printInfo() {
        return "Deep is: "+deep+" Color is: "+getColor();
    }
}
