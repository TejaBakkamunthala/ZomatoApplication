package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>,JpaSpecificationExecutor<Menu>{
    // Add custom queries if needed
}
