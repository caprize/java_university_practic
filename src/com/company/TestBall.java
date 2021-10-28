package com.company;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Ball temp = new Ball(1.0,2.0);
        ball.move(1.0,2.0);
        System.out.println(ball.toString());
        temp.setX(5.0);
        System.out.println(temp.getX());
    }
}
