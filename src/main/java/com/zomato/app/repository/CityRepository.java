package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>,JpaSpecificationExecutor<City> {
    // Add custom queries if needed
}