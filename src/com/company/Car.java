package com.company;

public class Car implements Priceable {
    private Integer power;
    private Integer year;
    private Integer crashes;

    public Car(Integer power, Integer year, Integer crashes) {
        this.power = power;
        this.year = year;
        this.crashes = crashes;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setCrashes(Integer crashes) {
        this.crashes = crashes;
    }

    public Integer getCrashes() {
        return crashes;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getPower() {
        return power;
    }

    @Override
    public Integer getPrice() {
        return power*10000+year*10000-crashes*1000;
    }
}
