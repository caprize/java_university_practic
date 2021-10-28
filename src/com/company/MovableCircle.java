package com.company;

public class MovableCircle implements Movable {
    private Integer radius;
    private MovablePoint center;

    public MovableCircle(Integer radius, Integer x, Integer y, Integer xSpeed, Integer ySpeed) {
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);

    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDonwn() {
        center.moveDonwn();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }
}
