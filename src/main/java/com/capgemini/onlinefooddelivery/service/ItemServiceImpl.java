package com.capgemini.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinefooddelivery.model.Category;
import com.capgemini.onlinefooddelivery.model.Customer;
import com.capgemini.onlinefooddelivery.model.Item;
import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.repository.ItemRepository;
import com.capgemini.onlinefooddelivery.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	  @Autowired ItemRepository itemRepo;
	 
	@Override
	public Item addItem(Item item) {
		return itemRepo.saveAndFlush(item);
	}

	@Override
	public Item updateItem(Item item) {
		return itemRepo.save(item);
	}

	@Override
	public Item viewItem(int itemId) {
		return itemRepo.findById(itemId).get();
	}

	@Override
	public Item removeItem(int itemId) {
		 
		 Item item=itemRepo.findById(itemId).get(); 
		 itemRepo.deleteById(itemId); 
		 return item;
	}

	@Override
	public List<Item> viewAllItems(Category cat) {
		return itemRepo.findAll();
	}

	@Override
	public List<Item> viewAllItems(Restaurant res) {
		return itemRepo.findAll();
	}

	@Override
	public List<Item> viewAllItemByName(String name) {
		//return itemRepo.findAllByName();
		return null;
	}

}
