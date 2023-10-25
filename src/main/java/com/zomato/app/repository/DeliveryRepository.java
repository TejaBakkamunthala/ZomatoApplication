package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer>,JpaSpecificationExecutor<Delivery> {
    // Add custom queries if needed
}
