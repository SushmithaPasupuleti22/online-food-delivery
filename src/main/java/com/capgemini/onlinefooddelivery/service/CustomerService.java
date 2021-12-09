package com.capgemini.onlinefooddelivery.service;

import java.util.List;
import com.capgemini.onlinefooddelivery.model.Customer;
import com.capgemini.onlinefooddelivery.model.Restaurant;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(int customerId);
	public Customer viewCustomer(int customerId);
	public List<Customer> viewAllCustomers(Restaurant res);
	
	
	
}
