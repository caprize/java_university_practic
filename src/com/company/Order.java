package com.company;

import java.util.ArrayList;

public interface Order {
    public boolean addItem(MenuItem item);
    public boolean delItem(String item);
    public boolean delItem(MenuItem item);
    public Integer delAllItems(String item);
    public Integer delAllItems(MenuItem item);
    public Integer getNumber();
    public Integer getNbyName(String name);
    public Integer getNbyItem(MenuItem name);
    public Integer getOrderCost();
    public ArrayList<MenuItem> getAllItems();
    public ArrayList<String> getNames();
    public ArrayList<MenuItem> getAllItemsSorted();
    public Customer getCustomer();
    public void setCustomer(Customer customer);
}
