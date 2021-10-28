package com.company;

public class Main {

    public static void main(String[] args) {
	    Dish spoon = new Spoon("white",2);
	    spoon.printInfo();
        System.out.println(((Spoon)spoon).getSize());
        Dish plate = new Plate("white",1);
        plate.printInfo();
        System.out.println(((Plate)plate).getDeep());
    }
}
