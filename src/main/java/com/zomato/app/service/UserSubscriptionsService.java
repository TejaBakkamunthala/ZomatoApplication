package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.UserSubscriptions;

public interface UserSubscriptionsService {
    List<UserSubscriptions> getAllUserSubscriptions();
    UserSubscriptions getUserSubscriptionsById(int userSubscriptionId);
    UserSubscriptions createUserSubscriptions(UserSubscriptions userSubscriptions);
    UserSubscriptions updateUserSubscriptions(UserSubscriptions userSubscriptions);
    void deleteUserSubscriptions(int userSubscriptionId);
}
