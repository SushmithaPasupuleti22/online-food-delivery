package com.capgemini.onlinefooddelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinefooddelivery.model.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>{

	public default Item deleteByName(String itemName) {
		return new Item();
	}

	public default Item findByName(String itemName) {
		return new Item();
	}

	
	
	
}
