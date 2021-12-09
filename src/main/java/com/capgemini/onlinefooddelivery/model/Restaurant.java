package com.capgemini.onlinefooddelivery.model;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Embeddable
@Entity
@Table(name="restaurant")
public class Restaurant {
	@Id
	private int restaurantId;
	@Size(min = 4, max = 20, message = "Name of the Area must have 4 to 20 Characters")
	private String restaurantName;
	@OneToOne
   // @JoinColumn(name = "addressId", referencedColumnName = "addressId")
	private Address address;
	@ElementCollection
	private List<Item> itemList;
	@NotBlank
	@Size(min = 4, max = 20, message = "Name of the Area must have 4 to 20 Characters")
	private String managerName;
	@NotBlank
	@Size(min = 4, max = 20, message = "Name of the Area must have 4 to 20 Characters")
	private String contactNumber;
	public Restaurant() {
		super();
	}
	public Restaurant(int restaurantId, String restaurantName, Address address, List<Item> itemList, String managerName,
			String contactNumber) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.address = address;
		this.itemList = itemList;
		this.managerName = managerName;
		this.contactNumber = contactNumber;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address="
				+ address + ", itemList=" + itemList + ", managerName=" + managerName + ", contactNumber="
				+ contactNumber + "]";
	}
	
	
}
