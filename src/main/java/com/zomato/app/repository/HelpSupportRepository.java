package com.zomato.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.zomato.app.Entity.HelpSupport;

@Repository
public interface HelpSupportRepository extends JpaRepository<HelpSupport, Integer>,JpaSpecificationExecutor<HelpSupport> {
    // Add custom queries if needed
}
