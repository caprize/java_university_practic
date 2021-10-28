package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(2.0);
        System.out.format( "Square is: %.3f",circle.getSquare());
        System.out.println();
	    circle.setR(4.0);
        System.out.format("New square is: %.3f",circle.getSquare());
        System.out.println();
        System.out.println(circle);
    }
}
