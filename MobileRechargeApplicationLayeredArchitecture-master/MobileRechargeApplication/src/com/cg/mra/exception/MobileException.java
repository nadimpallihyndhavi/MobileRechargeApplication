package com.cg.mra.exception;

//Extends the base class Exception to handle the exceptional messages

public class MobileException extends Exception{
	
	//constructor to handle the messages of  thrown exception
	
	public MobileException(String message){
		super(message);
	}

}
