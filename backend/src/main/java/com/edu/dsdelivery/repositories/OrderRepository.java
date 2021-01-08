package com.edu.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.dsdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
