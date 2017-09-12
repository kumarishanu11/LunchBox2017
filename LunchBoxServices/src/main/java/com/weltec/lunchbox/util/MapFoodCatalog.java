package com.weltec.lunchbox.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.weltec.lunchbox.entity.FoodCatalog;
import com.weltec.lunchbox.entity.FoodCategory;
import com.weltec.lunchbox.entity.FoodItem;

public class MapFoodCatalog {
	public model.FoodCatalog convertFoodCatalogToJPA(FoodCatalog foodCatalog){
		model.FoodCatalog foodCatalogJPA = new model.FoodCatalog();
		if(foodCatalog.getFoodCatalogId()!=0){
			foodCatalogJPA.setFoodCatalogId(foodCatalog.getFoodCatalogId());
		}
		if(foodCatalog.getFoodCatalogName()!=null && !foodCatalog.getFoodCatalogName().isEmpty()){
			foodCatalogJPA.setFoodCatalogName(foodCatalog.getFoodCatalogName());
		}
		if(foodCatalog.getVendorId()!=null && !foodCatalog.getVendorId().isEmpty()){
			foodCatalogJPA.setVendorId(foodCatalog.getVendorId());
		}
		
		//foodCatalogJPA.setFoodCategoryList(foodCategoryList)
		
		return foodCatalogJPA;
		
	}
//	public model.FoodCatalogCategoryBridge convertFoodCatalogCategoryBridgeToJPA(){
//		
//	}
	public model.FoodCategory convertFoodCategoryToJPA(FoodCategory foodCategory){
		model.FoodCategory foodCategoryJPA = new model.FoodCategory();
		
		if(foodCategory.getFoodCategoryId()!=0){
			foodCategoryJPA.setFoodCategoryId(foodCategory.getFoodCategoryId());
		}
		
		if(foodCategory.getFoodCategoryName()!=null && !foodCategory.getFoodCategoryName().isEmpty()){
			foodCategoryJPA.setFoodCategoryName(foodCategory.getFoodCategoryName());
		}
		if(foodCategory.getFoodCategoryCode()!=null && !foodCategory.getFoodCategoryCode().isEmpty()){
			foodCategoryJPA.setFoodCategoryCode(foodCategory.getFoodCategoryCode());
		}
		
		//foodCategoryJPA.setFoodItems(foodItems);
		
		foodCategoryJPA.setStartDate(new Date());
		
		return foodCategoryJPA;
		
	}
	public model.FoodItem convertFoodItemToJPA(FoodItem foodItem){
		model.FoodItem foodItemJPA = new model.FoodItem();
		if(foodItem.getFoodItemId()!=0){
			foodItemJPA.setFoodItemId(foodItem.getFoodItemId());
		}
		//foodItemJPA.setFoodCategoryId();
		
		if(foodItem.getFoodItemName()!=null && !foodItem.getFoodItemName().isEmpty()){
			foodItemJPA.setFoodItemName(foodItem.getFoodItemName());
		}
		if(foodItem.getCalori()!=null && !foodItem.getCalori().isEmpty()){
			foodItemJPA.setCalorie(foodItem.getCalori());
		}
		if(foodItem.getDescription()!=null && !foodItem.getDescription().isEmpty()){
			foodItemJPA.setDescription(foodItem.getDescription());
		}
		if(foodItem.getIngredient()!=null && !foodItem.getIngredient().isEmpty()){
			foodItemJPA.setIngredient(foodItem.getIngredient());
		}
		
			foodItemJPA.setNumberOfServe(new BigDecimal(foodItem.getNumberOfServe()));
			foodItemJPA.setPrice(new BigDecimal(foodItem.getPrice()));
			foodItemJPA.setTimeToServer(new BigDecimal(foodItem.getTimeToCoock()));
			foodItemJPA.setStartDate(new Date());
		return foodItemJPA;
	}
	
	
	public FoodCatalog convertToFoodCatalog(model.FoodCatalog foodCatalogJPA){
		FoodCatalog foodCatalog = new FoodCatalog();
		
		foodCatalog.setFoodCatalogId((int)foodCatalogJPA.getFoodCatalogId());
		if(foodCatalogJPA.getFoodCatalogName()!=null && !foodCatalogJPA.getFoodCatalogName().isEmpty()){
			foodCatalog.setFoodCatalogName(foodCatalogJPA.getFoodCatalogName());
		}
		if(foodCatalogJPA.getVendorId()!=null && !foodCatalogJPA.getVendorId().isEmpty()){
			foodCatalog.setVendorId(foodCatalogJPA.getVendorId());
		}
		//foodCatalog.setFoodCategoryList((ArrayList<FoodCategory>)foodCatalogJPA.getFoodCategoryList());
		
		return foodCatalog;
		
	}
	public FoodCategory convertToFoodCategory(model.FoodCategory foodCategoryJPA){
		FoodCategory foodCategory = new FoodCategory();
		
		foodCategory.setFoodCategoryId(foodCategoryJPA.getFoodCategoryId());
		if(foodCategoryJPA.getFoodCategoryCode()!=null && !foodCategoryJPA.getFoodCategoryCode().isEmpty()){
			foodCategory.setFoodCategoryCode(foodCategoryJPA.getFoodCategoryCode());
		}
		if(foodCategoryJPA.getFoodCategoryName()!=null && !foodCategoryJPA.getFoodCategoryName().isEmpty()){
			foodCategory.setFoodCategoryName(foodCategoryJPA.getFoodCategoryName());
		}
		
		
		return foodCategory;
		
	}
	public FoodItem convertToFoodItem(model.FoodItem foodItemJPA){
		FoodItem foodItem = new FoodItem();
		
		if(foodItemJPA.getCalorie()!=null && !foodItemJPA.getCalorie().isEmpty()){
			foodItem.setCalori(foodItemJPA.getCalorie());
		}
		if(foodItemJPA.getDescription()!=null && !foodItemJPA.getDescription().isEmpty()){
			foodItem.setDescription(foodItemJPA.getDescription());
		}
		if(foodItemJPA.getFoodItemName()!=null && !foodItemJPA.getFoodItemName().isEmpty()){
			foodItem.setFoodItemCode(foodItemJPA.getFoodItemName());
		}
		
		foodItem.setFoodItemId((int)foodItemJPA.getFoodItemId());
		
		if(foodItemJPA.getFoodItemName()!=null && !foodItemJPA.getFoodItemName().isEmpty()){
			foodItem.setFoodItemName(foodItemJPA.getFoodItemName());
		}
		if(foodItemJPA.getIngredient()!=null && !foodItemJPA.getIngredient().isEmpty()){
			foodItem.setIngredient(foodItemJPA.getIngredient());
		}
		if(foodItemJPA.getNumberOfServe()!=null ){
			foodItem.setNumberOfServe(foodItemJPA.getNumberOfServe().intValue());
		}
		if(foodItemJPA.getPrice()!=null){
			foodItem.setPrice(foodItemJPA.getPrice().floatValue());
		}
		if(foodItemJPA.getTimeToServer()!=null){
			foodItem.setTimeToCoock(foodItemJPA.getTimeToServer().intValue());
		}
		
		return foodItem;
		
	}
	
}
