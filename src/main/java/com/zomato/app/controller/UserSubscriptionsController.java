package com.zomato.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.app.Entity.UserSubscriptions;
import com.zomato.app.repository.UserSubscriptionsRepository;
import com.zomato.app.service.UserSubscriptionsService;

@RestController
@RequestMapping("/user-subscriptions")
public class UserSubscriptionsController {

    @Autowired
    private UserSubscriptionsService userSubscriptionsService;
    
    @Autowired
    private UserSubscriptionsRepository userSubscriptionRepository;

    @GetMapping
    public List<UserSubscriptions> getAllUserSubscriptions() {
        return userSubscriptionsService.getAllUserSubscriptions();
    }

    @GetMapping("/{userSubscriptionId}")
    public UserSubscriptions getUserSubscriptionsById(@PathVariable int userSubscriptionId) {
        return userSubscriptionsService.getUserSubscriptionsById(userSubscriptionId);
    }

    @PostMapping
    public UserSubscriptions createUserSubscriptions(@RequestBody UserSubscriptions userSubscriptions) {
        return userSubscriptionsService.createUserSubscriptions(userSubscriptions);
    }

    @PutMapping("/{userSubscriptionId}")
    public UserSubscriptions updateUserSubscriptions(@PathVariable int userSubscriptionId, @RequestBody UserSubscriptions userSubscriptions) {
        userSubscriptions.setUserSubscriptionId(userSubscriptionId);
        return userSubscriptionsService.updateUserSubscriptions(userSubscriptions);
    }

    @DeleteMapping("/{userSubscriptionId}")
    public void deleteUserSubscriptions(@PathVariable int userSubscriptionId) {
        userSubscriptionsService.deleteUserSubscriptions(userSubscriptionId);
    }
    
    @GetMapping("/user/{userId}/totalSubscriptions")
    public ResponseEntity<Integer> getUserTotalSubscriptions(@PathVariable Integer userId) {
        Integer totalSubscriptions = userSubscriptionRepository.getUserTotalSubscriptions(userId);
            return ResponseEntity.ok(totalSubscriptions);
        
    }
    
}
