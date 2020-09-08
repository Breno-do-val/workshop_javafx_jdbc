package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/*
	 * To store the field and correspondent error;
	 * */
	private Map<String, String> errors = new HashMap<>();
	
	/*
	 * Force validation to use string;
	 * */
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors() {
		return errors;
	}
	
	/*
	 * Method to add errors to Hash;
	 * */
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
}
