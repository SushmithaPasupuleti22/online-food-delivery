package com.capgemini.onlinefooddelivery.service;

import java.util.List;
import com.capgemini.onlinefooddelivery.model.Restaurant;

public interface RestaurantService {

	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(String restaurantName);
	public Restaurant viewRestaurant(String restaurantName);
	public List<Restaurant> viewNearByRestaurant(String location);
	public List<Restaurant> viewRestaurantByItemName(String Name);
}
