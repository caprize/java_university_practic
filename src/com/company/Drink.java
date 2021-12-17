package com.company;

public final class Drink extends MenuItem implements Alcoholable{
    public DrinkType type;
    Integer alcoholPrecent;
    public Integer setAlcoholPrecent(DrinkType type){
        if (type == DrinkType.BEER) return 5;
        else if (type == DrinkType.WINE) return 15;
        else if (type == DrinkType.VODKA) return 40;
        else if (type == DrinkType.BRANDY) return 35;
        else if (type == DrinkType.CHAMPAGNE) return 7;
        else if (type == DrinkType.WHISKEY) return 45;
        else if (type == DrinkType.TEQUILA) return 30;
        else if (type == DrinkType.RUM) return 45;
        else if (type == DrinkType.VERMUTH) return 40;
        else if (type == DrinkType.LIQUOR) return 10;
        else if (type == DrinkType.JAGERMEISTER) return 15;
        else return 0;
    }
    public Integer setCost(DrinkType type){
        if (type == DrinkType.BEER) return 500;
        else if (type == DrinkType.WINE) return 1500;
        else if (type == DrinkType.VODKA) return 400;
        else if (type == DrinkType.BRANDY) return 350;
        else if (type == DrinkType.CHAMPAGNE) return 700;
        else if (type == DrinkType.WHISKEY) return 450;
        else if (type == DrinkType.TEQUILA) return 300;
        else if (type == DrinkType.RUM) return 450;
        else if (type == DrinkType.VERMUTH) return 400;
        else if (type == DrinkType.LIQUOR) return 100;
        else if (type == DrinkType.JAGERMEISTER) return 150;
        else return 200;
    }
    public Drink(String name, String description, DrinkType type) throws IllegalArgumentException {
        super(type.toString(), description);
        this.type = type;
        this.alcoholPrecent = setAlcoholPrecent(type);
    }

    public Drink(Integer cost, String description, DrinkType type) throws IllegalArgumentException {
        super(cost, type.toString(), description);
        this.type = type;
        this.alcoholPrecent = setAlcoholPrecent(type);
    }


    @Override
    public boolean isAlcoholicDrink() {
        return alcoholPrecent>0;
    }

    @Override
    public double getAlcoholPrecent() {
        return alcoholPrecent;
    }
}
