package com.capgemini.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.onlinefooddelivery.model.Category;
public interface CategoryService {

	
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public Category removeCategory(int catId);
	public Optional<Category> viewCategory(int catId);
	public List<Category> viewAllCategory();
}
