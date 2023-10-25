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

import com.zomato.app.Entity.Subscriptions;
import com.zomato.app.service.SubscriptionsService;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionsController {

    @Autowired
    private SubscriptionsService subscriptionsService;

    @GetMapping
    public List<Subscriptions> getAllSubscriptions() {
        return subscriptionsService.getAllSubscriptions();
    }

    @GetMapping("/{subscriptionId}")
    public Subscriptions getSubscriptionsById(@PathVariable int subscriptionId) {
        return subscriptionsService.getSubscriptionsById(subscriptionId);
    }

    @PostMapping
    public Subscriptions createSubscriptions(@RequestBody Subscriptions subscriptions) {
        return subscriptionsService.createSubscriptions(subscriptions);
    }

    @PutMapping("/{subscriptionId}")
    public Subscriptions updateSubscriptions(@PathVariable int subscriptionId, @RequestBody Subscriptions subscriptions) {
        subscriptions.setSubscriptionId(subscriptionId);
        return subscriptionsService.updateSubscriptions(subscriptions);
    }

    @DeleteMapping("/{subscriptionId}")
    public void deleteSubscriptions(@PathVariable int subscriptionId) {
        subscriptionsService.deleteSubscriptions(subscriptionId);
    }
}
