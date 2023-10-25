package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Delivery;

public interface DeliveryService {
    List<Delivery> getAllDeliveries();
    Delivery getDeliveryById(int deliveryId);
    Delivery createDelivery(Delivery delivery);
    Delivery updateDelivery(Delivery delivery);
    void deleteDelivery(int deliveryId);
}
