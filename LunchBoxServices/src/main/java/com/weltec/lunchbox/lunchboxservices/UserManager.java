package com.weltec.lunchbox.lunchboxservices;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import com.weltec.lunchbox.entity.Admin;
import com.weltec.lunchbox.entity.Customer;
import com.weltec.lunchbox.entity.User;
import com.weltec.lunchbox.entity.Vendor;
import com.weltec.lunchbox.exception.EntityPersistException;
import com.weltec.lunchbox.exception.InvalidRequestException;
import com.weltec.lunchbox.util.DBManager;
import com.weltec.lunchbox.util.EntityValidator;
import com.weltec.lunchbox.util.MapUser;
import com.weltec.lunchbox.util.RandomString;

public class UserManager {
	private EntityValidator entityValidator;
	private MapUser userMap;
	private DBManager dbManager;
	
	public UserManager(){
		entityValidator = new EntityValidator();
		userMap = new MapUser();
		dbManager = new DBManager();
	}
	
	public User registerUser(User user)throws InvalidRequestException, EntityPersistException{
		
		ArrayList<String> errorList = new ArrayList<String>();
		
		entityValidator.validateUserEntity(user, errorList);
		if(errorList!=null && errorList.size()>0){
			throw new InvalidRequestException(errorList);
		}
		
		Object obj = userMap.convertUserToJPA(user);
		dbManager.persistObject(obj);
		
		return user;
	
	}
	
	public User viewUser(User user, String userId)throws EntityPersistException{
		User entityUser=null;
		Object obj = dbManager.getObject(user, userId);
		switch (user.getClass().getName().toUpperCase()){
		case "VENDOR":
			entityUser = userMap.convertToEntity((model.Vendor) obj);
			break;
			
		case "CUSTOMER":
			entityUser = userMap.convertToEntity((model.Customer) obj);
			break;
			
		case "ADMIN":
			entityUser = userMap.convertToEntity((model.Admin) obj);
			break;
		
	}
		
		return entityUser;
		
	}
	
	public User updateUser(User user)throws InvalidRequestException, EntityPersistException{
		
		ArrayList<String> errorList = new ArrayList<String>();
		
		entityValidator.validateUserEntity(user, errorList);
		if(errorList!=null && errorList.size()>0){
			throw new InvalidRequestException(errorList);
		}
		
		Object obj = userMap.convertUserToJPA(user);
		dbManager.updateObject(obj);
		
		return user;
	}
	
		
	public String resetPassword(User user, String userId)throws InvalidRequestException, EntityPersistException{
		RandomString gen = new RandomString(8, ThreadLocalRandom.current());
		String generatedPassword = gen.nextString();
		user.setPassword(generatedPassword);
		this.updateUser(user);
		return generatedPassword;
	}

}
