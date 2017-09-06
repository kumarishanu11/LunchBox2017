package com.weltec.lunchbox.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.weltec.lunchbox.entity.Admin;
import com.weltec.lunchbox.entity.Customer;
import com.weltec.lunchbox.entity.User;
import com.weltec.lunchbox.entity.Vendor;

public class MapUser {
	public Object convertUserToJPA(User user){
		Object obj=null;
		switch (user.getClass().getName().toUpperCase()){
		case "VENDOR":
			obj= convertToJPA((Vendor)user);
			break;
			
		case "CUSTOMER":
			obj= convertToJPA((Customer)user);
			break;
			
		case "ADMIN":
			obj= convertToJPA((Admin)user);
			break;
		
	}
		return obj;
	}
	
	
		public model.Vendor convertToJPA(Vendor vendor){
			model.Vendor vendorJPA = new model.Vendor();
			if(vendor.getUserId()!=null && !vendor.getUserId().isEmpty()){
				vendorJPA.setVendorId(vendor.getUserId());
			}
			if(vendor.getPassword()!=null && !vendor.getPassword().isEmpty()){
				vendorJPA.setPassword(vendor.getPassword());
			}
			if(vendor.getFirstName()!=null && !vendor.getFirstName().isEmpty()){
				vendorJPA.setFirstName(vendor.getFirstName());
			}
			if(vendor.getLastName()!=null && !vendor.getLastName().isEmpty()){
				vendorJPA.setLastName(vendor.getLastName());
			}
			if(vendor.getEmailId()!=null && !vendor.getEmailId().isEmpty()){
				vendorJPA.setEmailId(vendor.getEmailId());
			}
			if(vendor.getContactNo()!=null && !vendor.getContactNo().isEmpty()){
				vendorJPA.setContactNo(vendor.getContactNo());
			}
			if(vendor.getBusinessAddress()!=null && !vendor.getBusinessAddress().isEmpty()){
				vendorJPA.setBusinessAddress(vendor.getBusinessAddress());
			}
			if(vendor.getHomeAddress()!=null && !vendor.getHomeAddress().isEmpty()){
				vendorJPA.setHomeAddress(vendor.getHomeAddress());
			}
			if(vendor.getBusinessName()!=null && !vendor.getBusinessName().isEmpty()){
				vendorJPA.setBusinessName(vendor.getBusinessName());
			}
			if(vendor.getStatus()!=null && !vendor.getStatus().isEmpty()){
				vendorJPA.setStatusId(vendor.getStatus());
			}
			
			Date date = new Date();
			vendorJPA.setStartDate(date);
			
			
			return vendorJPA;
		}
		public model.Customer convertToJPA(Customer customer){
			model.Customer customerJPA = new model.Customer();
			
			if(customer.getUserId()!=null && !customer.getUserId().isEmpty()){
				customerJPA.setUserId(customer.getUserId());
			}
			if(customer.getPassword()!=null && !customer.getPassword().isEmpty()){
				customerJPA.setPassword(customer.getPassword());
			}
			if(customer.getFirstName()!=null && !customer.getFirstName().isEmpty()){
				customerJPA.setFirstName(customer.getFirstName());
			}
			if(customer.getLastName()!=null && !customer.getLastName().isEmpty()){
				customerJPA.setLastName(customer.getLastName());
			}
			if(customer.getEmailId()!=null && !customer.getEmailId().isEmpty()){
				customerJPA.setEmailId(customer.getEmailId());
			}
			if(customer.getContactNo()!=null && !customer.getContactNo().isEmpty()){
				customerJPA.setContactNo(customer.getContactNo());
			}
			if(customer.getHomeAddress()!=null && !customer.getHomeAddress().isEmpty()){
				customerJPA.setHomeAddress(customer.getHomeAddress());
			}
			if(customer.getDeliveryAddress()!=null && !customer.getDeliveryAddress().isEmpty()){
				customerJPA.setDeliveryAddress(customer.getDeliveryAddress());
			}
			if(customer.getStatus()!=null && !customer.getStatus().isEmpty()){
				customerJPA.setStatusId(customer.getStatus());
			}
			customerJPA.setStartDate(new Date());
			
			
			return customerJPA;
					
					
		}
		public model.Admin convertToJPA(Admin admin){
			
			model.Admin adminJPA = new model.Admin();
			if(admin.getUserId()!=null && !admin.getUserId().isEmpty()){
				adminJPA.setAdminId(admin.getUserId());
			}
			if(admin.getPassword()!=null && !admin.getPassword().isEmpty()){
				adminJPA.setPassword(admin.getPassword());
			}
			if(admin.getFirstName()!=null && !admin.getFirstName().isEmpty()){
				adminJPA.setFirstName(admin.getFirstName());
			}
			if(admin.getLastName()!=null && !admin.getLastName().isEmpty()){
				adminJPA.setLastName(admin.getLastName());
			}
			if(admin.getEmailId()!=null && !admin.getEmailId().isEmpty()){
				adminJPA.setEmailId(admin.getEmailId());
			}
			if(admin.getContactNo()!=null && !admin.getContactNo().isEmpty()){
				adminJPA.setContactNo(admin.getContactNo());
			}
			if(admin.getStatus()!=null && !admin.getStatus().isEmpty()){
				adminJPA.setStatusId(admin.getStatus());
			}
			
			adminJPA.setStartDate(new Date());
			
			return adminJPA;
		}
		
		public Vendor convertToEntity(model.Vendor  vendor){
			Vendor vendorEntity = new Vendor();
			if(vendor.getVendorId()!=null && !vendor.getVendorId().isEmpty()){
			vendorEntity.setUserId(vendor.getVendorId());
			}
			if(vendor.getPassword()!=null && !vendor.getPassword().isEmpty()){
			vendorEntity.setPassword(vendor.getPassword());
			}
			if(vendor.getFirstName()!=null && !vendor.getFirstName().isEmpty()){
			vendorEntity.setFirstName(vendor.getFirstName());
			}
			if(vendor.getLastName()!=null && !vendor.getLastName().isEmpty()){
			vendorEntity.setLastName(vendor.getLastName());
			}
			if(vendor.getContactNo()!=null && !vendor.getContactNo().isEmpty()){
			vendorEntity.setContactNo(vendor.getContactNo());
			}
			if(vendor.getEmailId()!=null && !vendor.getEmailId().isEmpty()){
			vendorEntity.setEmailId(vendor.getEmailId());
			}
			if(vendor.getBusinessName()!=null && !vendor.getBusinessName().isEmpty()){
			vendorEntity.setBusinessName(vendor.getBusinessName());
			}
			if(vendor.getBusinessAddress()!=null && !vendor.getBusinessAddress().isEmpty()){
			vendorEntity.setBusinessAddress(vendor.getBusinessAddress());
			}
			if(vendor.getHomeAddress()!=null && !vendor.getHomeAddress().isEmpty()){
			vendorEntity.setHomeAddress(vendor.getHomeAddress());
			}
			if(vendor.getStatusId()!=null && !vendor.getStatusId().isEmpty()){
			vendorEntity.setStatus(vendor.getStatusId());
			}
						
			return vendorEntity;
		}
		public Customer convertToEntity(model.Customer customer){
			Customer customerEntity = new Customer();
			if(customer.getUserId()!=null && !customer.getUserId().isEmpty()){
				customerEntity.setUserId(customer.getUserId());
			}
			if(customer.getPassword()!=null && !customer.getPassword().isEmpty()){
				customerEntity.setPassword(customer.getPassword());
			}
			if(customer.getFirstName()!=null && !customer.getFirstName().isEmpty()){
				customerEntity.setFirstName(customer.getFirstName());
			}
			if(customer.getLastName()!=null && !customer.getLastName().isEmpty()){
				customerEntity.setLastName(customer.getLastName());
			}
			if(customer.getEmailId()!=null && !customer.getEmailId().isEmpty()){
				customerEntity.setEmailId(customer.getEmailId());
			}
			if(customer.getContactNo()!=null && !customer.getContactNo().isEmpty()){
				customerEntity.setContactNo(customer.getContactNo());
			}
			if(customer.getHomeAddress()!=null && !customer.getHomeAddress().isEmpty()){
				customerEntity.setHomeAddress(customer.getHomeAddress());
			}
			if(customer.getDeliveryAddress()!=null && !customer.getDeliveryAddress().isEmpty()){
				customerEntity.setDeliveryAddress(customer.getDeliveryAddress());
			}
			if(customer.getStatusId()!=null && !customer.getStatusId().isEmpty()){
				customerEntity.setStatus(customer.getStatusId());
			}
			
			
			return customerEntity;
			
		}
		public Admin convertToEntity(model.Admin admin){
			
			Admin adminEntity = new Admin();
			if(admin.getAdminId()!=null && !admin.getAdminId().isEmpty()){
				adminEntity.setUserId(admin.getAdminId());
			}
			if(admin.getPassword()!=null && !admin.getPassword().isEmpty()){
				adminEntity.setPassword(admin.getPassword());
			}
			if(admin.getFirstName()!=null && !admin.getFirstName().isEmpty()){
				adminEntity.setFirstName(admin.getFirstName());
			}
			if(admin.getLastName()!=null && !admin.getLastName().isEmpty()){
				adminEntity.setLastName(admin.getLastName());
			}
			if(admin.getEmailId()!=null && !admin.getEmailId().isEmpty()){
				adminEntity.setEmailId(admin.getEmailId());
			}
			if(admin.getContactNo()!=null && !admin.getContactNo().isEmpty()){
				adminEntity.setContactNo(admin.getContactNo());
			}
			
			if(admin.getStatusId()!=null && !admin.getStatusId().isEmpty()){
				adminEntity.setStatus(admin.getStatusId());
			}
			
			return adminEntity;
			
			
		}

}
