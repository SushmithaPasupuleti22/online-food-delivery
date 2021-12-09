package com.capgemini.onlinefooddelivery.service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.onlinefooddelivery.exceptions.CartNotFoundException;
import com.capgemini.onlinefooddelivery.exceptions.ItemNotFoundException;
import com.capgemini.onlinefooddelivery.exceptions.ValidateItemException;
import com.capgemini.onlinefooddelivery.model.FoodCart;
import com.capgemini.onlinefooddelivery.model.Item;
import com.capgemini.onlinefooddelivery.repository.CartRepository;
import com.capgemini.onlinefooddelivery.repository.ItemRepository;
import com.capgemini.onlinefooddelivery.service.CartService;
import com.capgemini.onlinefooddelivery.util.ShoppingConstants;
import com.capgemini.onlinefooddelivery.exceptions.ValidateCartException;
@Service
public class CartServiceImpl implements CartService{

	
	  @Autowired 
	  CartRepository cartRepo;
	  @Autowired 
	  ItemRepository itemRepo;
	  
	 
	@Override
	public FoodCart addItemToCart(int cartId, int itemId) throws CartNotFoundException,ItemNotFoundException, ValidateItemException{
		
		/*
		 * FoodCart foodcart=cartRepo.findById(cartId).get(); ArrayList<Item>
		 * alist=(ArrayList<Item>) foodcart.getItemList(); alist.addAll(itemId).get();
		 * foodcart.setItemList(alist);
		 */
		/*
		 * if(optCustomer.isEmpty()) throw new
		 * CartNotFoundException(ShoppingConstants.CUSTOMER_NOT_FOUND); Optional<Item>
		 * optItem= itemRepo.findById(itemId); if(optItem.isEmpty()) throw new
		 * ItemNotFoundException(ShoppingConstants.CART_ITEM_NOT_FOUND);
		 * 
		 * Item item =optItem.get();
		 * 
		 * if(item.getQuantity()<=0) throw new
		 * ValidateItemException(ShoppingConstants.NO_STOCK);
		 * 
		 * FoodCart cart= new FoodCart(); cart.setCategory(optCustomer.get());
		 * //cart.setItem(item); FoodCart itemcart= cartRepo.save(cart); return
		 * itemcart;
		 */
		return null;
	}


	@Override
	public boolean removeItem(int cartId) throws ValidateCartException {
    Optional<FoodCart> optCart= cartRepo.findById(cartId);
		
		if(optCart.isEmpty())
			throw new ValidateCartException(ShoppingConstants.CART_ITEM_NOT_FOUND);
		
		cartRepo.delete(optCart.get());
		return true;
	}

	@Override
	public boolean clearCart(int cartId) throws ValidateCartException {
		Optional<FoodCart> optCart= cartRepo.findById(cartId);
			
			if(optCart.isEmpty())
				throw new ValidateCartException(ShoppingConstants.CART_ITEM_NOT_FOUND);
			
			cartRepo.deleteAll();;
			return true;
	}

	@Override
	public FoodCart reduceQuantity(int cartId, int itemId, int quantity) {
		
		return null;
	}

	
	@Override
	public FoodCart increseQuantity(int cartId, int itemId, int quantity) {
		return null;
		/*
		 * FoodCart cart = cartRepo.findById(cartId) .orElseThrow(() -> new
		 * CartNotFoundException("Cart not found"));
		 * 
		 * List<FoodCart> collect = cart.getOrders().stream().filter(order ->
		 * order.getItemId() == itemId) .collect(Collectors.toList());
		 * 
		 * if (collect.isEmpty()) { throw new ItemNotFoundException("Items not found");
		 * }
		 * 
		 * return collect.get(0);
		 */
	}

}
