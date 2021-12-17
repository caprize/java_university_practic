package com.company;

public class MenuItem implements Comparable<MenuItem> {
    final private Integer const_cost=0;
    private Integer cost;
    final private String name;
    final private String description;



    public MenuItem(String name, String description) throws IllegalArgumentException {
        if (name == "" || description == "") {
            throw new IllegalArgumentException();
        }
        this.cost = const_cost;
        this.name = name;
        this.description = description;
    }

    public MenuItem(Integer cost, String name, String description) throws IllegalArgumentException {
        if (name == "" || description == "" || cost<0) {
            throw new IllegalArgumentException();
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof MenuItem && name.equals(((MenuItem) obj).name) && description.equals(((MenuItem) obj).description)
                && cost == ((MenuItem) obj).cost;
    }

    @Override
    public int compareTo(MenuItem o) {
        return (int)Math.round(cost - o.cost);
    }
}

