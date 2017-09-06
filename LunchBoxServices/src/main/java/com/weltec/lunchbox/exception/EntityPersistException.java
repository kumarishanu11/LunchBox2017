package com.weltec.lunchbox.exception;

import java.util.ArrayList;

public class EntityPersistException extends Exception{
	String errorMessage;
	public EntityPersistException(String exceptionMessage) {
		   this.errorMessage = exceptionMessage;
	   } 
	   @Override
	   public String toString() { 
		   
	      return errorMessage;
	   }
}
