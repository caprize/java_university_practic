package com.company;

import java.util.HashMap;

public class TablesOrderManager {
    private HashMap<Integer, Order> orders = new HashMap<Integer, Order>();

    public void add(Order order, int tableNumber) {
        try {
            if (orders.get(tableNumber) != null) {
                throw new OrderAlreadyAdded("The order number is busy");
            }
        } catch (OrderAlreadyAdded e) {
            e.printStackTrace();
        }
        orders.put(tableNumber, order);
    }

    public Order getOrder(int tableNumber) {
        return orders.get(tableNumber);
    }

    public void addItem(Item item, int tableNumber) {
        Order order = orders.get(tableNumber);
        orders.remove(tableNumber);
        order.addItem(item);
        orders.put(tableNumber, order);
    }

    public void removeOrder(int tableNumber) {
        try {
            if (orders.get(tableNumber) == null) {
                throw new IllegalTableNumber("The order for this number was not found");
            }
        } catch (IllegalTableNumber e) {
            e.printStackTrace();
        }
        orders.remove(tableNumber);
    }

    public int freeTableNumber() {
        int number = 0;
        for (int i = 1; i <= 20; i++) {
            if (orders.get(i) == null) {
                number = i;
                break;
            }
        }
        if (number == 0) {
            System.out.println("There are no available table numbers");
        }
        return number;
    }

    public int[] freeTableNumbers() {
        int count = 0;
        int quantity = 20 - orders.size();
        int[] freeNumbers = new int[quantity];
        for (int i = 1; i <= 20; i++) {
            if (orders.get(i) == null) {
                freeNumbers[count] = i;
                count++;
                if (count >= freeNumbers.length) break;
            }
        }
        return freeNumbers;
    }

    public Order[] getOrders() {
        Order[] s = new Order[20 - orders.size()];
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            if (orders.get(i) != null) {
                s[count] = orders.get(i);
                count++;
            }
        }
        return s;
    }

    public double ordersCostSummary() {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (orders.get(i) != null) {
                sum += orders.get(i).getOrderCost();
            }
        }
        return sum;
    }
    public int getNbyName(String itemName) {
        int quantity = 0;
        for (int i = 1; i <= 20; i++) {
            if (orders.get(i) != null) {
                quantity += orders.get(i).getNbyName(itemName);
            }
        }
        return quantity;
    }
}
