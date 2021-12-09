
package com.capgemini.onlinefooddelivery.controller;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinefooddelivery.model.Category;
import com.capgemini.onlinefooddelivery.model.Item;
import com.capgemini.onlinefooddelivery.model.Restaurant;
import com.capgemini.onlinefooddelivery.service.ItemServiceImpl;
  

  @RestController 
  @RequestMapping("/item")
  public class ItemController {
  
  
  @Autowired public ItemServiceImpl itemService;
  
   @PostMapping("/add")
   public Item addItem(@RequestBody Item item) {
	  return itemService.addItem(item);
   }
  
    @PutMapping("/update")
	public Item updateItem(@RequestBody Item item) {
		return itemService.updateItem(item);
	}
  
    @GetMapping("/view/{itemId}")
	public Item viewItem(@PathVariable("itemId") int itemId) {
		return itemService.viewItem(itemId);
  
	}
	
    @DeleteMapping("/delete/{itemId}")
	public Item removeItem(@PathVariable("itemId") int itemId) {
		return itemService.removeItem(itemId);
	}
	
    @GetMapping("/viewAll")
	public List<Item> viewAllItems(Category cat) {
		return itemService.viewAllItems(cat);
	}
	
    @GetMapping("/viewAllItems")
	public List<Item> viewAllItems(Restaurant res) {
		return itemService.viewAllItems(res);
	}
	
    @GetMapping("/viewAllItemByName")
	public List<Item> viewAllItemByName(String name) {
		return itemService.viewAllItemByName(name);
	}
	
  }
 