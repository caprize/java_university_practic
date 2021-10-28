package com.company;

public class TesterDog {
    public static void main(String[] args) {
        Dog poppy = new Dog("Arrow","white",2,"M");
        poppy.bark();
        System.out.println("Dogs colour: " + poppy.getColour() + ". And name is: " + poppy.getName());
        poppy.setName("Grep");
        System.out.println("Poppys new name is: "+poppy.getName());
        System.out.println(poppy);
    }
}
