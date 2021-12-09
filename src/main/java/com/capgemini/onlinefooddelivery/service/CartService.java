package com.capgemini.onlinefooddelivery.service;
import com.capgemini.onlinefooddelivery.exceptions.CartNotFoundException;
import com.capgemini.onlinefooddelivery.exceptions.ItemNotFoundException;
import com.capgemini.onlinefooddelivery.exceptions.ValidateCartException;
import com.capgemini.onlinefooddelivery.exceptions.ValidateItemException;
import com.capgemini.onlinefooddelivery.model.FoodCart;
import com.capgemini.onlinefooddelivery.model.Item;


public interface CartService {

	
	public FoodCart addItemToCart(int cartId,int itemId)throws CartNotFoundException,ItemNotFoundException, ValidateItemException;
	public FoodCart increseQuantity(int cartId, int itemId, int quantity);
	public FoodCart reduceQuantity(int cartId, int itemId, int quantity);
	public boolean removeItem(int cartId) throws ValidateCartException;
	public boolean clearCart(int cartId)throws ValidateCartException ;
	
}
