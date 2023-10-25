package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>,JpaSpecificationExecutor<Payment> {
    // Add custom queries if needed
}
