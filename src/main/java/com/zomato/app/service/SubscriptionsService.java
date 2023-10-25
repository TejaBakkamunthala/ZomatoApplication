package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Subscriptions;

public interface SubscriptionsService {
    List<Subscriptions> getAllSubscriptions();
    Subscriptions getSubscriptionsById(int subscriptionId);
    Subscriptions createSubscriptions(Subscriptions subscriptions);
    Subscriptions updateSubscriptions(Subscriptions subscriptions);
    void deleteSubscriptions(int subscriptionId);
}
