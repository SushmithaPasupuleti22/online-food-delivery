package com.capgemini.onlinefooddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinefooddelivery.model.Customer;
import com.capgemini.onlinefooddelivery.model.OrderDetails;
import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.repository.OrderRepository;
import com.capgemini.onlinefooddelivery.service.OrderService;

@Service
public class OrderRestaurantImpl implements OrderService{

	
	  @Autowired OrderRepository orderRepo;
	 
	
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		return orderRepo.saveAndFlush(order);
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		return orderRepo.saveAndFlush(order);
	}

	@Override
	public OrderDetails removeOrder(int orderId) {
		OrderDetails order=orderRepo.findById(orderId).get(); 
		orderRepo.deleteById(orderId); 
		 return order;
	}

	@Override
	public OrderDetails viewOrder(int orderId) {
		return orderRepo.findById(orderId).get();
		
	}

	@Override
	public List<OrderDetails> viewAllOders(Restaurant res) {
		return (List<OrderDetails>)orderRepo.findAll();
	}

	@Override
	public List<OrderDetails> viewAllOders(Customer customer) {
		return (List<OrderDetails>)orderRepo.findAll();
	}

}
