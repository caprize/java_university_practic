package com.company;

public interface OrdersManager {
    int getNbyName(String itemName);
    int getNbyItem(MenuItem item);
    Order[] getOrders();
    Integer ordersCost();
    Integer ordersNumber();
}
