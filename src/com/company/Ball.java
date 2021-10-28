package com.company;

public class Ball {
    private Double x = 0.0;
    private Double y = 0.0;

    public Ball(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setXY(Double x,Double y){
        this.x=x;
        this.y=y;
    }
    public void move(Double xDisp,Double yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ ("+this.x.toString()+ " , " + this.y.toString() + ")";
    }
}
