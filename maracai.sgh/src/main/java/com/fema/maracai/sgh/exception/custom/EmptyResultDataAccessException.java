package com.fema.maracai.sgh.exception.custom;

public class EmptyResultDataAccessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public EmptyResultDataAccessException(String message) {
		super(message);
	}
}

