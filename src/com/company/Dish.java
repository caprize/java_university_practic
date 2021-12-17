package com.company;

public final class Dish implements Item {
    final private Integer const_cost=0;
    final private Integer cost;
    final private String name;
    final private String info;

    @Override
    public String toString() {
        return "Dish{" +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public Dish(String name, String info) {
        this.name = name;
        this.info = info;
        cost = const_cost;
    }

    public Dish(Integer cost, String name, String info) throws java.lang.IllegalArgumentException {
        if (cost<0) throw new java.lang.IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.info = info;
    }

    public Integer getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

}
