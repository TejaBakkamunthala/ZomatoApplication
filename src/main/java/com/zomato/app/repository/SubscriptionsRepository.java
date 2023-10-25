package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Subscriptions;

@Repository
public interface SubscriptionsRepository extends JpaRepository<Subscriptions, Integer>,JpaSpecificationExecutor<Subscriptions>{
    // Add custom queries if needed
}
