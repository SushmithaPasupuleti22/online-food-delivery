package com.capgemini.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.onlinefooddelivery.model.Category;
import com.capgemini.onlinefooddelivery.repository.CategoryRepository;
import com.capgemini.onlinefooddelivery.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
	
	  @Autowired CategoryRepository categoryRepo;
	 
	@Override
	public Category addCategory(Category cat) {
		return categoryRepo.saveAndFlush(cat);
	}

	@Override
	public Category updateCategory(Category cat) {
		return categoryRepo.saveAndFlush(cat);
	}

	@Override
	public Optional<Category> viewCategory(int catId) {
		return categoryRepo.findById(catId);
	}

	@Override
	public List<Category> viewAllCategory() {
		return (List<Category>) categoryRepo.findAll();
	}

	@Override
	public Category removeCategory(int catId){
		Category category=categoryRepo.findById(catId).get(); 
		categoryRepo.deleteById(catId); 
		 return category;
	}

}
