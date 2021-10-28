package com.company;

public class MovablePoint implements Movable {
    protected Integer x;
    protected Integer y;
    protected Integer xSpeed;
    protected Integer ySpeed;

    public MovablePoint(Integer x, Integer y, Integer xSpeed, Integer ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y+=ySpeed;
    }

    @Override
    public void moveDonwn() {
        this.y-=ySpeed;
    }

    @Override
    public void moveRight() {
        this.x+=xSpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
