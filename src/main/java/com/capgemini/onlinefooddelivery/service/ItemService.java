package com.capgemini.onlinefooddelivery.service;

import java.util.List;
import com.capgemini.onlinefooddelivery.model.Category;
import com.capgemini.onlinefooddelivery.model.Item;
import com.capgemini.onlinefooddelivery.model.Restaurant;

public interface ItemService {

	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(int itemId);
	public Item removeItem(int itemId);
	public List<Item> viewAllItems(Category cat);
	public List<Item> viewAllItems(Restaurant res);
	public List<Item> viewAllItemByName(String name);

	
}
