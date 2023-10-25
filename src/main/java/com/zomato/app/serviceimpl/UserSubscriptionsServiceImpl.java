package com.zomato.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.app.Entity.UserSubscriptions;
import com.zomato.app.repository.UserSubscriptionsRepository;
import com.zomato.app.service.UserSubscriptionsService;

@Service
public class UserSubscriptionsServiceImpl implements UserSubscriptionsService {

    @Autowired
    private UserSubscriptionsRepository userSubscriptionsRepository;

    @Override
    public List<UserSubscriptions> getAllUserSubscriptions() {
        return userSubscriptionsRepository.findAll();
    }

    @Override
    public UserSubscriptions getUserSubscriptionsById(int userSubscriptionId) {
        return userSubscriptionsRepository.findById(userSubscriptionId).orElse(null);
    }

    @Override
    public UserSubscriptions createUserSubscriptions(UserSubscriptions userSubscriptions) {
        return userSubscriptionsRepository.save(userSubscriptions);
    }

    @Override
    public UserSubscriptions updateUserSubscriptions(UserSubscriptions userSubscriptions) {
        return userSubscriptionsRepository.save(userSubscriptions);
    }

    @Override
    public void deleteUserSubscriptions(int userSubscriptionId) {
        userSubscriptionsRepository.deleteById(userSubscriptionId);
    }
}
