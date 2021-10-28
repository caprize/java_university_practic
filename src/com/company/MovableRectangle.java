package com.company;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint botoomRight;

    public MovableRectangle(Integer x1, Integer y1, Integer x1Speed, Integer y1Speed,
                            Integer x2, Integer y2, Integer x2Speed, Integer y2Speed) {
        this.topLeft = new MovablePoint(x1,y1,x1Speed,y1Speed);
        this.botoomRight = new MovablePoint(x2,y2,x2Speed,y2Speed);
    }
    public boolean sameSpeed(MovablePoint left,MovablePoint right){
        return left.xSpeed.equals(right.xSpeed) && left.ySpeed.equals(right.ySpeed);
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", botoomRight=" + botoomRight +
                '}';
    }
    public void printError() {
        System.out.println("Not the same speed of points");
    }
    public void printSucces(){
        System.out.println("New points for left: " + topLeft.x + "; " + topLeft.y);
        System.out.println("New points for right: " + botoomRight.x + "; " + botoomRight.y);
    }

    @Override
    public void moveUp() {
        if (sameSpeed(topLeft,botoomRight)) {
            topLeft.moveUp();
            botoomRight.moveUp();
            printSucces();
        }
        else printError();
    }

    @Override
    public void moveDonwn() {
        if (sameSpeed(topLeft,botoomRight)) {
            topLeft.moveDonwn();
            botoomRight.moveDonwn();
            printSucces();
        }
        else printError();
    }

    @Override
    public void moveRight() {
        if (sameSpeed(topLeft,botoomRight)) {
            topLeft.moveRight();
            botoomRight.moveRight();
            printSucces();
        }
        else printError();
    }

    @Override
    public void moveLeft() {
        if (sameSpeed(topLeft,botoomRight)) {
            topLeft.moveLeft();
            botoomRight.moveLeft();
            printSucces();
        }
        else printError();
    }
}
