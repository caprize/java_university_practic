package com.company;

public class Cat implements Priceable {
    private Integer age;
    private Integer rate;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getRate() {
        return rate;
    }

    public Cat(Integer age, Integer rate) {
        this.age = age;
        this.rate = rate;
    }

    @Override
    public Integer getPrice() {
        return rate*1000 - age*10;
    }
}
