package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class ListNode {
    public ListNode next;
    public ListNode prev;
    public Item value = null;

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
    public boolean addItem(Item item){
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
        else {
            if (temp.value.getName().equals(name)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return true;
            } else return delItem(tail, temp.next, name);
        }
    }
    public Integer delAllItems(ListNode tail,ListNode temp,String name,Integer k){
        if (temp == tail) return k+1;
        else {
            if (temp.value.getName().equals(name)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return delAllItems(tail,temp.next,name,k+1);
            } else return delAllItems(tail, temp.next, name,k);
        }
    }
    public Integer getCost(ListNode tail,ListNode temp,Integer cost){
        if (temp == tail) return cost+tail.value.getCost();
        else return getCost(tail,temp.next,temp.value.getCost()+cost);
    }
    public ArrayList<Item> getAllItems(ListNode tail,ListNode temp,ArrayList<Item> list){
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
