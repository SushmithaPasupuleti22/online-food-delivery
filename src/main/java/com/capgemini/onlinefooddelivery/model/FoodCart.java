package com.capgemini.onlinefooddelivery.model;

import java.util.*;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "foodcart")
public class FoodCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	@OneToOne
    //@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customer customer;
	@ElementCollection
	private List<Item> itemList;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public void setCategory(FoodCart foodCart) {
		this.setCategory(foodCart);
	}
	public Optional<FoodCart> getOrders() {
		return this.getOrders();
	}
	public Object getItemId() {

		return this.getItemId();
	}
	
	
}
