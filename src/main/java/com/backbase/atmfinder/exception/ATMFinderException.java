package com.backbase.atmfinder.exception;

public class ATMFinderException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creates a new Exception specific to IngestionAdapter
	 * 
	 * @param message exception message
	 */
	public ATMFinderException(String message) {
		super(message);
	}

	/**
	 * Creates a new Exception specific to IngestionAdapter
	 * 
	 * @param message exception message 
	 * @param throwable actual exception that was caused
	 */
	public ATMFinderException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
