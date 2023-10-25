package com.zomato.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.app.Entity.Delivery;
import com.zomato.app.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public List<Delivery> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }

    @GetMapping("/{deliveryId}")
    public Delivery getDeliveryById(@PathVariable int deliveryId) {
        return deliveryService.getDeliveryById(deliveryId);
    }

    @PostMapping
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return deliveryService.createDelivery(delivery);
    }

    @PutMapping("/{deliveryId}")
    public Delivery updateDelivery(@PathVariable int deliveryId, @RequestBody Delivery delivery) {
        Delivery existingDelivery = deliveryService.getDeliveryById(deliveryId);
        if (existingDelivery == null) {
            // Handle not found scenario or return a specific response
            return null;
        }
        delivery.setDeliveryId(deliveryId);
        return deliveryService.updateDelivery(delivery);
    }

    @DeleteMapping("/{deliveryId}")
    public void deleteDelivery(@PathVariable int deliveryId) {
        deliveryService.deleteDelivery(deliveryId);
    }
}
