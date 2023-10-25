package com.zomato.app.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User> {
  
	
	@Query(value = "select * from zomato.restaurant_with_location",nativeQuery = true)
    List<Object> getRestaurantwithLocation();

	@Query(value = "select * from zomato.user_with_subscription",nativeQuery = true)
    List<Object> getUserWithSubscription();

	@Query(value = "select * from zomato.restaurants_with_highest_averageRating",nativeQuery = true)
    List<Object> getRestaurantsWithHighesverageRating();


	@Query(value = "select * from zomato.get_user_total_order_amount(:user_id_1)",nativeQuery = true)
    int getuserTotalOrderAmount(@Param("user_id_1") int userId);

	@Query(value = "select * from zomato.get_user_total_subscriptions(:user_id_1)",nativeQuery = true)
    int getuserTotalSubscriptions(@Param("user_id_1") int userId);


	@Query(value = "select * from zomato.get_total_orders_in_city(:city_name_1)",nativeQuery = true)
     String gettotalOrdersInCity(@Param("city_name_1") String cityName);

	

	
	

	
}
