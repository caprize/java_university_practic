package com.company;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(Integer real, Integer image) {
        return new Complex(real,image);
    }
}
