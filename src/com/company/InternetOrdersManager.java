package com.company;

public class InternetOrdersManager implements OrdersManager {
    private static class QueueNode {
        public QueueNode next;
        public QueueNode prev;
        public Order value;
    }

    QueueNode head;
    QueueNode tail;
    int size;

    public InternetOrdersManager() {
        QueueNode nNode = new QueueNode();
        this.head = nNode;
        this.tail = nNode;
        this.size=0;
    }

    public boolean add(Order order) {
        QueueNode nNode = new QueueNode();
        tail.next = nNode;
        nNode.prev = tail;
        nNode.value = order;
        return true;
    }

    public Order remove() {
        Order order = head.value;
        head = head.next;
        size--;
        return order;
    }

    public Order order() {
        return head.value;
    }

    @Override
    public int getNbyName(String itemName) {
        int count = 0;
        QueueNode queueNode = head;
        while (queueNode != null && queueNode.value != null) {
            count += queueNode.value.getNbyName(itemName);
            queueNode = queueNode.next;
        }
        return count;
    }

    @Override
    public int getNbyItem(MenuItem item) {
        int count = 0;
        QueueNode queueNode = head;
        while (queueNode != null && queueNode.value != null) {
            count += queueNode.value.getNbyItem(item);
            queueNode = queueNode.next;
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode queueNode = head;
        int i = 0;
        while (queueNode != null && queueNode.value != null) {
            orders[i++] = queueNode.value;
            queueNode = queueNode.next;
        }
        return  orders;
    }

    @Override
    public Integer ordersCost() {
        Integer cost = 0;
        QueueNode queueNode = head;
        while (queueNode != null && queueNode.value != null) {
            cost += queueNode.value.getOrderCost();
            queueNode = queueNode.next;
        }
        return cost;
    }

    @Override
    public Integer ordersNumber() {
        return size;
    }
}
