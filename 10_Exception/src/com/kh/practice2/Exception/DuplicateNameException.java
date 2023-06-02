package com.kh.practice2.Exception;

public class DuplicateNameException extends Exception{
	
	public DuplicateNameException() {
		this("This is DuplicatenNameException...");
	}
	
	public DuplicateNameException(String message) {
		super(message);
	}
}
