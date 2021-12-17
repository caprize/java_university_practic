package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class TableOrder implements Order{
    private int size = 0;
    Integer n=0;
    private ArrayList<MenuItem> items = new ArrayList<>(20);
    private Customer customer;
    public TableOrder(Customer customer) {
        ListNode node = new ListNode();
        this.customer = customer;
    }

    public TableOrder(Integer n) {
        this.size = n;
        items = new ArrayList<MenuItem>(size);
    }
    @Override
    public boolean addItem(MenuItem item) {
        items.add(item);
        size++;
        n++;
        return true;
    }

    @Override
    public ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            names.add(items.get(i).getName());
        }
        return names;
    }
    public void delAll(){
        size=0;
        items.clear();
    }
    @Override
    public Integer getNumber() {
        return size;
    }

    @Override
    public Integer getNbyName(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName() == itemName) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Integer getNbyItem(MenuItem item) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i) == item)
                count++;
        }
        return count;
    }

    @Override
    public ArrayList<MenuItem> getAllItems() {
        return items;
    }

    @Override
    public boolean delItem(String itemName) {
        if (size == 0) return false;
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName() == itemName) {
                size--;
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delItem(MenuItem item) {
        if (size == 0) return false;
        for (int i = 0; i < size; i++) {
            if (items.get(i) == item) {
                size--;
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer delAllItems(String itemName) {
        Integer ans =0;
        if (size == 0) return 0;
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName() == itemName) {
                size--;
                ans++;
                items.remove(i);
            }
        }
        return ans;
    }

    @Override
    public Integer delAllItems(MenuItem item) {
        Integer ans =0;
        if (size == 0) return 0;
        for (int i = 0; i < size; i++) {
            if (items.get(i) == item) {
                size--;
                ans++;
                items.remove(i);
            }
        }
        return ans;
    }





    @Override
    public ArrayList<MenuItem> getAllItemsSorted() {
        items.sort(MenuItem::compareTo);
        return items;
    }

    @Override
    public Integer getOrderCost() {
        Integer total = 0;
        for (int i = 0; i < size; i++) {
            total += items.get(i).getCost();
        }
        return total;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

