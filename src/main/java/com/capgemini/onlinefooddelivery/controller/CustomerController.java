package com.capgemini.onlinefooddelivery.controller;
  
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinefooddelivery.exceptions.CustomerNotFoundException;
import com.capgemini.onlinefooddelivery.model.Customer;
import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

		@Autowired
		CustomerServiceImpl iservice;
		@PostMapping("/add")
		@ResponseStatus(HttpStatus.CREATED)
		public Customer addCustomer(@RequestBody Customer customer)
		{
		return	iservice.addCustomer(customer);
		}

		@GetMapping("/view/{customerId}")
		public Customer viewCustomer(@PathVariable int customerId) throws AccountNotFoundException  {
			Customer customer=null;
			try {
				customer=iservice.viewCustomer(customerId);
			}catch(Exception e) {
				throw new AccountNotFoundException("Customer is not found with id "+customerId);
			}
			return customer;
		}
		
		@PutMapping("/update")
		public Customer updateCustomer(@RequestBody Customer customer) throws CustomerNotFoundException {
			Customer c=null;
			try {
				c=iservice.viewCustomer(customer.getCustomerid());
			}
			catch(Exception e) {
				throw new CustomerNotFoundException("Customer is not found for updating");
			}
			c=iservice.updateCustomer(customer);
			return c;
		}
		
		
		@DeleteMapping("/delete/{customerId}")
		public Customer removeCustomer(@PathVariable int customerId) throws CustomerNotFoundException {
			Customer customer=null;
			try {
				customer=iservice.viewCustomer(customerId);
			}
			catch(Exception e){
				throw new CustomerNotFoundException("Customer is not found with id "+customerId+" for deletting");
			}
			customer=iservice.removeCustomer(customerId);
			return customer;
		}
		
	
		
		@GetMapping("/all")
		public List<Customer> viewAllCustomers(Restaurant res)
		{
			return iservice.viewAllCustomers(res);
			
		}
	}
 