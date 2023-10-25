package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.UserSubscriptions;

@Repository
public interface UserSubscriptionsRepository extends JpaRepository<UserSubscriptions, Integer>,JpaSpecificationExecutor<UserSubscriptions>{

	@Query(value = "select * from zomato.get_user_total_subscriptions",nativeQuery = true)
    Integer getUserTotalSubscriptions(int userId);

	
	
//	@Query(value = "SELECT zomato.get_user_total_subscriptions(:userId) AS total_subscriptions", nativeQuery = true)
//    Integer getUserTotalSubscriptions(@Param("userId") Integer userId);


}




