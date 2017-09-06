package com.weltec.lunchbox.util;

import java.util.ArrayList;

import com.weltec.lunchbox.entity.Admin;
import com.weltec.lunchbox.entity.Customer;
import com.weltec.lunchbox.entity.User;
import com.weltec.lunchbox.entity.Vendor;

public class EntityValidator {
	
	public void validateUserEntity(User user, ArrayList<String> errorList){
		
		validateUser(user, errorList);
		
		switch (user.getClass().getName().toUpperCase()){
			case "VENDOR":
				validateVendor((Vendor)user, errorList);
				break;
				
			case "CUSTOMER":
				validateCustomer((Customer)user, errorList);
				break;
				
			case "ADMIN":
				validateAdmin((Admin)user, errorList);
				break;
			
		}
	}
	
	public void validateUser(User user, ArrayList<String> errorList){
		if(user.getUserId() == null || user.getUserId().isEmpty()){
			errorList.add("User Id is mandetory");
		}
		if(user.getPassword() == null || user.getPassword().isEmpty()){
			errorList.add("Password is mandetory");
		}
		if(user.getFirstName() == null || user.getFirstName().isEmpty()){
			errorList.add("First name is mandetory");
		}
		if(user.getLastName() == null || user.getLastName().isEmpty()){
			errorList.add("Last name is mandetory");
		}
		if(user.getEmailId() == null || user.getEmailId().isEmpty()){
			errorList.add("Email Id is mandetory");
		}
		if(user.getContactNo() == null || user.getContactNo().isEmpty()){
			errorList.add("Contact number is mandetory");
		}
		
	}
	public void validateVendor(Vendor vendor, ArrayList<String> errorList){
		if(vendor.getBusinessAddress() == null || vendor.getBusinessAddress().isEmpty()){
			errorList.add("Business address is mandetory");
		}
		if(vendor.getHomeAddress() == null || vendor.getHomeAddress().isEmpty()){
			errorList.add("Home address is mandetory");
		}
	}
	public void validateCustomer(Customer customer, ArrayList<String> errorList){
		
		if(customer.getHomeAddress() == null || customer.getHomeAddress().isEmpty()){
			errorList.add("Home address is mandetory");
		}
	
	}
	public void validateAdmin(Admin admin, ArrayList<String> errorList){
		
	}

}
