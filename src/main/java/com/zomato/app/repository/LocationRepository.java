package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>,JpaSpecificationExecutor<Location> {
    // Add custom queries if needed
}
