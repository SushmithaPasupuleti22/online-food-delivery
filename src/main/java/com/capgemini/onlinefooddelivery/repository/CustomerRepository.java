package com.capgemini.onlinefooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinefooddelivery.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
