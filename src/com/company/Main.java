package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car1 = new Car(249,2019,0);
	    Car car2 = new Car(249,2012,2);
        System.out.println("Price is: "+car1.getPrice()+" rub");
        System.out.println("Price is: "+car2.getPrice()+" rub");
        Cat cat1 = new Cat(1,10);
        Cat cat2 = new Cat(2,20);
        System.out.println("Price is: "+cat1.getPrice()+" rub");
        System.out.println("Price is: "+cat2.getPrice()+" rub");
    }
}
