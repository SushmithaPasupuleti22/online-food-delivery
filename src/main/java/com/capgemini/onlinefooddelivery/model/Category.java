package com.capgemini.onlinefooddelivery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int catId;
	@NotBlank
	@Size(min = 4, max = 20, message = "Name of the Category must have 4 to 20 Characters")
	private String categoryName;
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public Category() {
		super();
	}
	public Category(int catId,
			@NotBlank @Size(min = 4, max = 20, message = "Name of the Category must have 4 to 20 Characters") String categoryName) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + "]";
	}

	
}
