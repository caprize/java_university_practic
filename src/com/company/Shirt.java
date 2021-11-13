package com.company;

public class Shirt {
    String code;
    String type;
    String color;
    String size;

    public Shirt(String code, String type, String color, String size) {
        this.code = code;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
