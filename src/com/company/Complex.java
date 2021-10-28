package com.company;

public class Complex {
    Integer real;
    Integer image;

    public Complex(Integer real, Integer image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
