package com.company;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(Double side) {
        super(side,side);
    }

    public Square(String color, Boolean filled, Double side) {
        super(color, filled, side, side);
    }
    public Double getSide(){
        return this.length;
    }
    public void setSide(Double side){
        this.width=side;
        this.length=side;
    }

    @Override
    public void setLength(Double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(Double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                ", side=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
