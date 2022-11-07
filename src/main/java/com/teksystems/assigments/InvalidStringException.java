package com.teksystems.assigments;

public class InvalidStringException extends Exception{
    
    private static final long serialVersionUID = 1L;

	public InvalidStringException() {
        super();
    }
    
    public InvalidStringException(String message){
        super(message);
    }
  
}
