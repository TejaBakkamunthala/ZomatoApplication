package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>,JpaSpecificationExecutor<OrderRepository> {

	@Query(value = "SELECT zomato.get_user_total_order_amount(:userId) AS total_amount", nativeQuery = true)
    Double getUserTotalOrderAmount(@Param("userId") int userId);




}
