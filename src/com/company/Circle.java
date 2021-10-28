package com.company;

import java.text.DecimalFormat;
import java.util.Objects;

public class Circle {
    private Double r;
    private Double d;
    private Double len;
    private Double square;

    public Circle(Double r) {
        this.r = r;
        this.d = 2*r;
        this.len= Math.PI*2*r;
        this.square = Math.PI*r*r;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        return "Circle{" +
                "r=" + decimalFormat.format(r) +
                ", d=" + decimalFormat.format(d) +
                ", len=" + decimalFormat.format(len) +
                ", square=" + decimalFormat.format(square) +
                '}';
    }

    public void setR(Double r) {
        this.r = r;
        this.d = 2*r;
        this.len= Math.PI*2*r;
        this.square = Math.PI*r*r;
    }

    public Double getR() {
        return r;
    }

    public Double getD() {
        return d;
    }

    public Double getLen() {
        return len;
    }

    public Double getSquare() {
        return square;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(r, circle.r) &&
                Objects.equals(d, circle.d) &&
                Objects.equals(len, circle.len) &&
                Objects.equals(square, circle.square);
    }

    public int hashCode() {
        return Objects.hash(r, d, len, square);
    }

}
