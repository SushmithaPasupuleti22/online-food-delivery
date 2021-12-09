package com.capgemini.onlinefooddelivery.service;

import java.util.List;
import com.capgemini.onlinefooddelivery.model.Customer;
import com.capgemini.onlinefooddelivery.model.OrderDetails;
import com.capgemini.onlinefooddelivery.model.Restaurant;

public interface OrderService {

	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails removeOrder(int orderId);
	public OrderDetails viewOrder(int orderId);
	public List<OrderDetails> viewAllOders(Restaurant res);
	public List<OrderDetails> viewAllOders(Customer customer);
	
	
}
