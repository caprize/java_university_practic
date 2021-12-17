package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    TablesOrderManager tablesOrderManager = new TablesOrderManager();
        InternetOrder internetOrder1 = new InternetOrder(5);
        internetOrder1.addItem(new Dish(200,"hot","meat"));
        internetOrder1.addItem(new Dish(50,"low","egg"));
        internetOrder1.addItem(new Drink(100,"hot","tea"));
        internetOrder1.addItem(new Drink(200,"cold","vodka"));
        internetOrder1.addItem(new Drink(250,"cold","vine"));
        tablesOrderManager.add(internetOrder1,1);


        InternetOrder internetOrder2 = new InternetOrder(5);
        internetOrder2.addItem(new Dish(20,"cold","meat"));
        internetOrder2.addItem(new Dish(50,"low","egg"));
        internetOrder2.addItem(new Drink(200,"hot","tea"));
        internetOrder2.addItem(new Drink(100,"cold","vodka"));
        internetOrder2.addItem(new Drink(250,"cold","vine"));
        tablesOrderManager.add(internetOrder2,2);

        System.out.println(tablesOrderManager.ordersCostSummary());

        Order order = tablesOrderManager.getOrder(2);
        System.out.println(order.getNumber());
        ArrayList<Item> items = order.getAllItemsSorted();
        for (Item i : items){
            System.out.println(i);
        }
    }
}
