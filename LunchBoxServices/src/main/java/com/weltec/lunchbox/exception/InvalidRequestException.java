package com.weltec.lunchbox.exception;

import java.util.ArrayList;

public class InvalidRequestException extends Exception{
	ArrayList<String> exceptionList;
	public InvalidRequestException(ArrayList<String> exceptionList) {
		   this.exceptionList = exceptionList;
	   } 
	   @Override
	   public String toString() { 
		   String exceptionString="";
		   for(String error : exceptionList){
			   exceptionString=exceptionString + error;
		   }
	      return (exceptionString);
	   }

}
