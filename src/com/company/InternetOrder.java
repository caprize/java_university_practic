package com.company;

import java.util.ArrayList;

public class InternetOrder implements Order {
    public ListNode head;
    public ListNode tail;
    public Integer n;
    Integer size = 0;
    private Customer customer;

    public InternetOrder(Customer customer) {
        ListNode node = new ListNode();
        this.customer = customer;
        this.head = node;
        this.tail = node;
        this.n = 0;
    }

    public InternetOrder(Integer n,Customer customer) {
        this.n = n;
        this.customer = customer;
        ListNode node = new ListNode();
        this.head = node;
        this.tail = node;
        for (int i=0;i<n-1;i++){
            tail = head.addNode(tail,head);
        }
    }
    public boolean addItem(MenuItem item){
        size++;
        if (tail.value!=null) return false;
        else {
            n++;
            return head.addItem(item);
        }
    }
    public void delAll(){
        size=0;
        ListNode node = new ListNode();
        this.head = node;
        this.tail = node;
        for (int i=0;i<n-1;i++){
            tail = head.addNode(tail,head);
        }
    }
    public boolean delItem(String name){
        ListNode node = head;
        Integer n=0;
        size--;
        while (n<this.n){
            n++;
            if (node.value!=null && node.value.getName().equals(name)){
                node.value=null;

                return true;
            }
            node = node.next;
        }
        return true;
    }
    public boolean delItem(MenuItem item){
        Boolean t = head.delItembyItem(tail,head,item);
        if (t) n-=1;
        return t;
    }
    public Integer delAllItems(String name){
        Integer t = head.delAllItems(tail,head,name,0);
        n-=t;
        return t;
    }
    public Integer delAllItems(MenuItem item){
        Integer t = head.delAllItemsbyItem(tail,head,item,0);
        n-=t;
        return t;
    }

    public Integer getNumber() {
        ListNode node = head;
        Integer n=0;
        while (node.value!=null && n<this.n){
            n++;
            node = node.next;
        }
        return n;
    }
    public Integer getOrderCost(){
        return head.getCost(tail,head,0);
    }
    public ArrayList<MenuItem> getAllItems(){
        ArrayList<MenuItem> items = new ArrayList<>();
        return head.getAllItems(tail,head,items);
    }
    public Integer getNbyName(String name) {
        int ans = 0;
        ArrayList<MenuItem> items = new ArrayList<>();
        items = head.getAllItems(tail,head,items);
        for (MenuItem i : items){
            if (i.getName().equals(name)) ans++;
        }
        return ans;
    }
    public Integer getNbyItem(MenuItem item) {
        int ans = 0;
        ArrayList<MenuItem> items = new ArrayList<>();
        items = head.getAllItems(tail,head,items);
        for (MenuItem i : items){
            if (i.equals(item)) ans++;
        }
        return ans;
    }
    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        ArrayList<MenuItem> items = new ArrayList<>();
        items = head.getAllItems(tail,head,items);
        for (MenuItem i : items){
            names.add(i.getName());
        }
        return names;
    }
    public ArrayList<MenuItem> getAllItemsSorted(){
        ArrayList<MenuItem> items = new ArrayList<>();
        items = head.getAllItems(tail,head,items);
        for (int out = items.size() - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(items.get(in).getCost() > items.get(in + 1).getCost()) {
                    MenuItem t = items.get(in);
                    items.set(in,items.get(in+1));
                    items.set(in+1,t);
                }
            }
        }
        return items;
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
