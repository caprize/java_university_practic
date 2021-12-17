package com.company;

import java.util.ArrayList;

public interface Order {
    public boolean addItem(Item item);
    public boolean delItem(String item);
    public Integer delAllItems(String item);
    public Integer getNumber();
    public Integer getNbyName(String name);
    public Integer getOrderCost();
    public ArrayList<Item> getAllItems();
    public ArrayList<String> getNames();
    public ArrayList<Item> getAllItemsSorted();
}
