package com.capgemini.onlinefooddelivery.exceptions;

public class ValidateCartException extends Exception {
	public ValidateCartException(String message) {
		super(message);
	}
	public ValidateCartException() {
		super();
	}
}
