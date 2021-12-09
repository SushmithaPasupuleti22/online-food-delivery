package com.capgemini.onlinefooddelivery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	@Size(min = 4, max = 20, message = "Name of the Buliding must have 4 to 20 Characters")
	private String buildingName;
	private int streetNo;
	@Size(min = 4, max = 20, message = "Name of the Area must have 4 to 20 Characters")
	private String area;
	@NotBlank
	@Size(min = 4, max = 20, message = "Name of the city must have 4 to 20 Characters")
	private String city;
	@NotBlank
	@Size(min = 4, max = 20, message = "Name of the state must have 4 to 20 Characters")
	private String state;
	@NotBlank
	@Size(min = 4, max = 20, message = "Name of the country must have 4 to 20 Characters")
	private String country;
	private double pincode;
	public Address(int addressId, String buildingName, int streetNo, String area, String city, String state,
			String country, double pincode) {
		super();
		this.addressId = addressId;
		this.buildingName = buildingName;
		this.streetNo = streetNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getPincode() {
		return pincode;
	}
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", buildingName=" + buildingName + ", streetNo=" + streetNo
				+ ", area=" + area + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + "]";
	}
	
	
}
