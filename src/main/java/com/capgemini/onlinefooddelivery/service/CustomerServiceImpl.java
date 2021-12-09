  package com.capgemini.onlinefooddelivery.service;
  
  import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinefooddelivery.model.Customer;
import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.repository.CustomerRepository; 
  @Service 
  public class CustomerServiceImpl implements CustomerService{

	 
	  	@Autowired
	     CustomerRepository iRep;
	  	@Override
	  	public Customer addCustomer(Customer customer) {
	  		
	  		return iRep.save(customer);
	  	}

	  	@Override
		public Customer viewCustomer(int customerId) {
			return iRep.findById(customerId).get();
		}

	  	@Override
	  	public Customer updateCustomer(Customer customer) {
	  	
	  		
	  		 Customer cust=iRep.findById(customer.getCustomerid()).orElseThrow(()-> new
	  		  EntityNotFoundException("No customer found!"));
	  		cust.setFirstName(cust.getFirstName()); return iRep.save(cust);
	  	}

	  	@Override
		public Customer removeCustomer(int customerId) {
			Customer customer=iRep.findById(customerId).get(); 
			iRep.deleteById(customerId); 
			 return customer;
			 
		}


	  	@Override
	  	public List<Customer> viewAllCustomers(Restaurant res) {	  		
	  		return iRep.findAll();
	  	}


	  	
	  	  public List<Customer> viewAllCus(Customer customer) {
	  	  
	  	  return iRep.findAll(); }


	
	  }

