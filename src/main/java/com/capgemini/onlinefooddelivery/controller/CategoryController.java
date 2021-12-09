package com.capgemini.onlinefooddelivery.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinefooddelivery.exceptions.CategoryNotFoundException;
import com.capgemini.onlinefooddelivery.model.Category;
import com.capgemini.onlinefooddelivery.service.CategoryServiceImpl;
  

@RestController 
@RequestMapping("Category")
  public class CategoryController {
  
  
  @Autowired 
  public CategoryServiceImpl categoryService;
  
  @PostMapping("/add")
  public Category addCategory(@RequestBody Category cat) throws CategoryNotFoundException{
	  Category c=null;
	  try {
		  c=categoryService.addCategory(cat);
	  }
	  catch(Exception e) {
			throw new CategoryNotFoundException("Category is not found for adding");
	  }
	  c=categoryService.addCategory(cat);
		return c;
  }
  
  @PutMapping("/update")
  public Category updateCategory(@RequestBody Category cat) throws CategoryNotFoundException{
	  
	  Category c=null;
	  try {
		  c=categoryService.updateCategory(cat);
	  }
	  catch(Exception e) {
			throw new CategoryNotFoundException("Category is not found for adding");
	  }
	  c=categoryService.updateCategory(cat);
		return c;
  }
  @DeleteMapping("/delete/{catId}")
  public Category removeCategory(@PathVariable("catId") int catId) throws CategoryNotFoundException {
	  
	  Category c=null;
	  try {
		  c=categoryService.removeCategory(catId);

	  }
	  catch(Exception e) {
			throw new CategoryNotFoundException("Category is not found for adding");
	  }
	  c=categoryService.removeCategory(catId);
		return c;
		}
  @GetMapping("/view/{catId}")
  public Optional<Category> viewCategory(@PathVariable("catId") int catId) throws CategoryNotFoundException {
	  Optional<Category> c=null;
	  try {
		  c=categoryService.viewCategory(catId);

	  }
	  catch(Exception e) {
			throw new CategoryNotFoundException("Category is not found for adding");
	  }
	  c=categoryService.viewCategory(catId);
		return c;
	
  }
  
  @GetMapping("/all")
  public List<Category> viewAllCategory() {
	  return categoryService.viewAllCategory();
	  
  }
  
  
  }
 