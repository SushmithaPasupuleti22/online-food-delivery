package com.capgemini.onlinefooddelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinefooddelivery.exceptions.CartNotFoundException;
import com.capgemini.onlinefooddelivery.exceptions.ItemNotFoundException;
import com.capgemini.onlinefooddelivery.exceptions.ValidateCartException;
import com.capgemini.onlinefooddelivery.exceptions.ValidateItemException;
import com.capgemini.onlinefooddelivery.model.FoodCart;
import com.capgemini.onlinefooddelivery.service.CartServiceImpl;

@RestController
@RequestMapping("/foodcart")
public class CartConroller {

	 @Autowired public CartServiceImpl cartService;
	
	 @RequestMapping("/additemtocart/{cartId}/{item}")
	 public FoodCart addItemToCart(int cartId, int itemId) throws CartNotFoundException,ItemNotFoundException, ValidateItemException{
		 return cartService.addItemToCart(cartId, itemId);
	 }
	 @RequestMapping("/increseQuantity/{cartId}/{item}/{quantity}")
	 public FoodCart increseQuantity(@RequestBody int cartId, int itemId, int quantity) {
		 return cartService.increseQuantity(cartId, itemId, quantity);
	 }
	 @RequestMapping("/reduceQuantity{cartId}/{item}/{quantity}")
		public FoodCart reduceQuantity(@RequestBody int cartId, int itemId, int quantity) {
			return cartService.reduceQuantity(cartId, itemId, quantity);
		}
	 @RequestMapping("/removeItem/{cartId}")
		public boolean removeItem(@PathVariable("cartId")  int cartId) throws ValidateCartException {
			return cartService.removeItem(cartId);
		}
	 @RequestMapping("/clearCart/{cartId}")
		public FoodCart clearCart(@PathVariable("cartId")  int cartId) {
		 return null;
		}
}
