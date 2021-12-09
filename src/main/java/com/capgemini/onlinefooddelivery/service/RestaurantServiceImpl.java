package com.capgemini.onlinefooddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.repository.RestaurantRepository;
import com.capgemini.onlinefooddelivery.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{
	@Autowired RestaurantRepository restaurantRepo;
	@Override
	public Restaurant addRestaurant(Restaurant res) {
		return restaurantRepo.saveAndFlush(res);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant res) {
		return restaurantRepo.save(res);
	}

	@Override
	public Restaurant removeRestaurant(String restaurantName) {
		return restaurantRepo.findByName(restaurantName);
	}

	@Override
	public Restaurant viewRestaurant(String restaurantName) {
		return restaurantRepo.findByRestaurantName(restaurantName);
	}

	@Override
	public List<Restaurant> viewNearByRestaurant(String location) {
		return (List<Restaurant>)restaurantRepo.findAll();
	}

	@Override
	public List<Restaurant> viewRestaurantByItemName(String Name) {
		return (List<Restaurant>)restaurantRepo.findAll();
	}

}
