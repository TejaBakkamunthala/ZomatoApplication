package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer>,JpaSpecificationExecutor<Reviews> {
    // Add custom queries if needed
}
