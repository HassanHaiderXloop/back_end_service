package com.micro.back_end_service.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.back_end_service.Entity.Price;


@Repository
public interface PriceRepo extends JpaRepository < Price , Long > {
    
}
