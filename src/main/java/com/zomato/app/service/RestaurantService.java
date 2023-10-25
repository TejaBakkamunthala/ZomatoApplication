package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Restaurant;

public interface RestaurantService {
    List<Restaurant> getAllRestaurants();
    Restaurant getRestaurantById(int restaurantId);
    Restaurant createRestaurant(Restaurant restaurant);
    Restaurant updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int restaurantId);
}
