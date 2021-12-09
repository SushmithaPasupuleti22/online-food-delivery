
  package com.capgemini.onlinefooddelivery.controller;
  
  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.service.RestaurantServiceImpl;

  @RestController
  @RequestMapping("/restaurant")
  public class RestaurantController {
  
  
  @Autowired 
  public RestaurantServiceImpl restaurantService;
  
  @PostMapping("/add")
  public Restaurant addRestaurant(@RequestBody Restaurant res) {
	  return restaurantService.addRestaurant(res);
  }
  
  @PutMapping("/update")
  public Restaurant updateRestaurant(@RequestBody Restaurant res) {
	  return restaurantService.updateRestaurant(res);
  }
  
  @DeleteMapping("/delete/{restaurantName}")
  public Restaurant removeRestaurant(@PathVariable("restaurantName") String restaurantName) {
	  return restaurantService.removeRestaurant(restaurantName);
  }
  
  @GetMapping("/view/{restaurantName}")
  public Restaurant viewRestaurant(@PathVariable("restaurantName") String restaurantName) {
	  return restaurantService.viewRestaurant(restaurantName);
  }
  @GetMapping("/view/{location}")
  public List<Restaurant> viewNearByRestaurant(@PathVariable("location") String location) {
	  return restaurantService.viewNearByRestaurant(location);
  }
  @GetMapping("/view/{Name}")
  public List<Restaurant> viewRestaurantByItemName(@PathVariable("Name") String Name) {
	  return restaurantService.viewNearByRestaurant(Name);
  }
  
  }
 