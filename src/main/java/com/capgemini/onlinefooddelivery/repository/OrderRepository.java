package com.capgemini.onlinefooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinefooddelivery.model.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails,Integer>{

}
