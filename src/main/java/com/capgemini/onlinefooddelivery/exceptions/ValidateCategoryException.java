package com.capgemini.onlinefooddelivery.exceptions;

public class ValidateCategoryException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public ValidateCategoryException() {
		super();
		
	}

	public ValidateCategoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ValidateCategoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValidateCategoryException(String message) {
		super(message);
	}

	public ValidateCategoryException(Throwable cause) {
		super(cause);
	}
	
}
