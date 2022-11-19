/**
 * 
 */
package com.backend.exceptions;

/**
 * @author AvinashSankineni
 *
 */
public class TableNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public TableNotFoundException() {
		super();
	}

	/**
	 * @param message
	 */
	public TableNotFoundException(String message) {
		super(message);
	}
	

}
