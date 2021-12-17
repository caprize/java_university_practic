package com.company;

public final class Dish extends MenuItem {
    DishType type;

    public Dish(String description, DishType type) throws IllegalArgumentException {
        super(type.toString(), description);
        this.type = type;
    }

    public Dish(Integer cost, String description, DishType type) throws IllegalArgumentException {
        super(cost, type.toString(), description);
        this.type = type;
    }

    public DishType getType() {
        return type;
    }
}
