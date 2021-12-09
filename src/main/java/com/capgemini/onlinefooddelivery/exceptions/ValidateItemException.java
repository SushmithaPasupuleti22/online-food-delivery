package com.capgemini.onlinefooddelivery.exceptions;

public class ValidateItemException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	/*
	 * public void ValidateCartException() { super(); }
	 * 
	 * public void ValidateCartException(String message, Throwable cause, boolean
	 * enableSuppression, boolean writableStackTrace) { super(message, cause,
	 * enableSuppression, writableStackTrace); }
	 * 
	 * public void ValidateCartException(String message, Throwable cause) {
	 * super(message, cause); }
	 * 
	 * public void ValidateCartException(String message) { super(message); }
	 * 
	 * public void ValidateCartException(Throwable cause) { super(cause);
	 * 
	 * }
	 */
	 
	public ValidateItemException(String message) {
		super(message);
	}
}
