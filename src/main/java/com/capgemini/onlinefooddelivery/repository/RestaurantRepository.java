package com.capgemini.onlinefooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinefooddelivery.model.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
	
	
@Query(value="delete from restaurant r where r.restaurantName = :restaurantName",nativeQuery=true)
	public Restaurant findByName(@Param("restaurantName") String restaurantName);
		
@Query(value="select restaurantName from restaurant r where r.restaurantName = :restaurantName",nativeQuery=true)
public Restaurant findByRestaurantName(@Param("restaurantName") String restaurantName);

}