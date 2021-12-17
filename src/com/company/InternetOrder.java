package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class InternetOrder implements Order {
    public ListNode head;
    public ListNode tail;
    public Integer n;

    public InternetOrder() {
        ListNode node = new ListNode();
        this.head = node;
        this.tail = node;
    }

    public InternetOrder(Integer n) {
        this.n = n;
        ListNode node = new ListNode();
        this.head = node;
        this.tail = node;
        for (int i=0;i<n-1;i++){
            tail = head.addNode(tail,head);
        }
    }
    public boolean addItem(Item item){
        if (tail.value!=null) return false;
        else return head.addItem(item);
    }
    public boolean delItem(String item){
        Boolean t = head.delItem(tail,head,item);
        if (t) n-=1;
        return t;
    }
    public Integer delAllItems(String item){
        Integer t = head.delAllItems(tail,head,item,0);
        n-=t;
        return t;
    }

    public Integer getNumber() {
        return n;
    }
    public Integer getOrderCost(){
        return head.getCost(tail,head,0);
    }
    public ArrayList<Item> getAllItems(){
        ArrayList<Item> items = new ArrayList<>();
        return head.getAllItems(tail,head,items);
    }
    public Integer getNbyName(String item) {
        int ans = 0;
        ArrayList<Item> items = new ArrayList<>();
        items = head.getAllItems(tail,head,items);
        for (Item i : items){
            if (i.getName().equals(item)) ans++;
        }
        return ans;
    }
    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Item> items = new ArrayList<>();
        items = head.getAllItems(tail,head,items);
        for (Item i : items){
            names.add(i.getName());
        }
        return names;
    }
    public ArrayList<Item> getAllItemsSorted(){
        ArrayList<Item> items = new ArrayList<>();
        items = head.getAllItems(tail,head,items);
        for (int out = items.size() - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(items.get(in).getCost() > items.get(in + 1).getCost()) {
                    Item t = items.get(in);
                    items.set(in,items.get(in+1));
                    items.set(in+1,t);
                }
            }
        }
        return items;
    }
}
