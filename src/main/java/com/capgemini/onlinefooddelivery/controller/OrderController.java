
package com.capgemini.onlinefooddelivery.controller;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinefooddelivery.model.Customer;
import com.capgemini.onlinefooddelivery.model.OrderDetails;
import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.service.OrderRestaurantImpl;
 
  @RestController 
  @RequestMapping("/order")
  public class OrderController {
  
  
  @Autowired
  public OrderRestaurantImpl orderService;
  
  @PostMapping("/add")
  public OrderDetails addOrder(OrderDetails order) {
	  return orderService.addOrder(order);
  }
  
  @PutMapping("/update")
  public OrderDetails updateOrder(OrderDetails order) {
	  return orderService.updateOrder(order);
  }
  @DeleteMapping("/delete/{orderId}")
  public OrderDetails removeOrder(@PathVariable("orderId") int orderId) {
	  return orderService.removeOrder(orderId);
  }
  
  @GetMapping("/view/{orderId}")
  public OrderDetails viewOrder(@PathVariable("orderId") int orderId) {
	  return orderService.viewOrder(orderId);
  }
  
  @GetMapping("/viewAllRestaurantOders")
  public List<OrderDetails> viewAllOders(Restaurant res) {
	  return orderService.viewAllOders(res);
  }
  @GetMapping("/viewAllCustomerOders")
  public List<OrderDetails> viewAllOders(Customer customer) {
	  return orderService.viewAllOders(customer);
  }
  
  }
 