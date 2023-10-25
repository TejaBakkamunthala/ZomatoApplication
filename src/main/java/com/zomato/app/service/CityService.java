package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.City;

public interface CityService {
    List<City> getAllCities();
    City getCityById(int cityId);
    City createCity(City city);
    City updateCity(City city);
    void deleteCity(int cityId);
}
