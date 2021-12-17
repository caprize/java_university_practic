package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class ListNode {
    public ListNode next;
    public ListNode prev;
    public MenuItem value = null;

    public ListNode() {
        next = this;
        prev = this;
    }

    public ListNode addNode(ListNode tail,ListNode head){
        ListNode node = new ListNode();
        head.prev = node;
        tail.next = node;
        node.prev = tail;
        node.next = head;
        return node;
    }
    public boolean addItem(MenuItem item){
        if (value == null){
            value = item;
            return true;
        }
        else {
            return next.addItem(item);
        }
    }

    public boolean delItem(ListNode tail,ListNode temp,String name){
        if (temp == tail && !tail.value.getName().equals(name)) return false;
        else if (temp == tail && tail.value.getName().equals(name)){
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            return true;
        }
        else {
            if (temp.value.getName().equals(name)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return true;
            } else return delItem(tail, temp.next, name);
        }
    }
    public boolean delItembyItem(ListNode tail,ListNode temp,MenuItem item){
        if (temp == tail && !tail.value.equals(item)) return false;
        else if (temp == tail && tail.value.equals(item)) return true;
        else {
            if (temp.value.equals(item)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return true;
            } else return delItembyItem(tail, temp.next, item);
        }
    }
    public Integer delAllItems(ListNode tail,ListNode temp,String name,Integer k){
        if (temp == tail && !tail.value.getName().equals(name)) return k;
        else if (temp == tail && tail.value.getName().equals(name)) return k+1;
        else {
            if (temp.value.getName().equals(name)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return delAllItems(tail,temp.next,name,k+1);
            } else return delAllItems(tail, temp.next, name,k);
        }
    }
    public Integer delAllItemsbyItem(ListNode tail,ListNode temp,MenuItem item,Integer k){
        if (temp == tail && !tail.value.equals(item)) return k;
        else if (temp == tail && tail.value.equals(item)) return k+1;
        else {
            if (temp.value.equals(item)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return delAllItemsbyItem(tail,temp.next,item,k+1);
            } else return delAllItemsbyItem(tail, temp.next, item,k);
        }
    }
    public Integer getCost(ListNode tail,ListNode temp,Integer cost){
        if (temp == tail && temp.value!=null) return cost+tail.value.getCost();
        else if (temp == tail) return cost;
        else if (temp.value!=null) return getCost(tail,temp.next,temp.value.getCost()+cost);
        else return getCost(tail,temp.next,cost);
    }
    public ArrayList<MenuItem> getAllItems(ListNode tail,ListNode temp,ArrayList<MenuItem> list){
        if (temp.value!=null){
            list.add(temp.value);
            if (temp == tail) return list;
            else return getAllItems(tail,temp.next,list);
        }
        else return getAllItems(tail,temp.next,list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return Objects.equals(next, listNode.next) &&
                Objects.equals(prev, listNode.prev) &&
                Objects.equals(value, listNode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, prev, value);
    }
}
