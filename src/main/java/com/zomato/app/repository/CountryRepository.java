package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>,JpaSpecificationExecutor<Country> {
    // Add custom queries if needed
}
