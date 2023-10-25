package com.zomato.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.app.Entity.Subscriptions;
import com.zomato.app.repository.SubscriptionsRepository;
import com.zomato.app.service.SubscriptionsService;

@Service
public class SubscriptionsServiceImpl implements SubscriptionsService {

    @Autowired
    private SubscriptionsRepository subscriptionsRepository;

    @Override
    public List<Subscriptions> getAllSubscriptions() {
        return subscriptionsRepository.findAll();
    }

    @Override
    public Subscriptions getSubscriptionsById(int subscriptionId) {
        return subscriptionsRepository.findById(subscriptionId).orElse(null);
    }

    @Override
    public Subscriptions createSubscriptions(Subscriptions subscriptions) {
        return subscriptionsRepository.save(subscriptions);
    }

    @Override
    public Subscriptions updateSubscriptions(Subscriptions subscriptions) {
        return subscriptionsRepository.save(subscriptions);
    }

    @Override
    public void deleteSubscriptions(int subscriptionId) {
        subscriptionsRepository.deleteById(subscriptionId);
    }
}
