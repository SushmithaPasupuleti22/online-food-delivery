package com.capgemini.onlinefooddelivery.exceptions;

public class CategoryNotFoundException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public CategoryNotFoundException(String message) {
		super(message);
	}
	

	public CategoryNotFoundException() {
		super();
	}
	
}
