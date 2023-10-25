package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Order;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(int orderId);
    Order createOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(int orderId);
}
