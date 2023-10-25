package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.OrderItem;

public interface OrderItemService {
    List<OrderItem> getAllOrderItems();
    OrderItem getOrderItemById(int orderItemId);
    OrderItem createOrderItem(OrderItem orderItem);
    OrderItem updateOrderItem(OrderItem orderItem);
    void deleteOrderItem(int orderItemId);
}
