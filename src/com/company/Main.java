package com.company;

public class Main {

    public static void main(String[] args) {
	    ConcreteFactory factory = new ConcreteFactory();
	    Complex complex = factory.createComplex(2,6);
        System.out.println(complex);
    }
}
